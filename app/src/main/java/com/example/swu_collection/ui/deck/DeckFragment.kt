package com.example.swu_collection.ui.deck

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.swu_collection.databinding.FragmentDeckBinding

class DeckFragment : Fragment() {

    private var _binding: FragmentDeckBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentDeckBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}