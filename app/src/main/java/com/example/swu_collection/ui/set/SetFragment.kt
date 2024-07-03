package com.example.swu_collection.ui.set

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.swu_collection.databinding.FragmentSetBinding
import com.example.swu_collection.domain.model.SetInfo
import com.example.swu_collection.domain.model.SetModel
import com.example.swu_collection.ui.set.adapter.SetAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class SetFragment : Fragment() {

    private val setViewModel by viewModels<SetViewModel>()
    private lateinit var setAdapter: SetAdapter

    private var _binding: FragmentSetBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initItems()
        initUIState()
    }

    private fun initItems() {
        setAdapter =
            SetAdapter(onItemSelected = {
                val setType = when(it) {
                    SetInfo.Shd -> SetModel.Shd
                    SetInfo.Sor -> SetModel.Sor
                    SetInfo.Totr -> SetModel.Totr
                }

                findNavController().navigate(
                    SetFragmentDirections.actionSetFragmentToSetDetailActivity(setType)
                )
            })
        binding.rvSets.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = setAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                setViewModel.swuSet.collect {
                    setAdapter.update(it)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSetBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}