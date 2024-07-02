package com.example.swu_collection.ui.collection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.swu_collection.databinding.FragmentCollectionBinding

class CollectionFragment : Fragment() {

    private var _binding: FragmentCollectionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentCollectionBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}