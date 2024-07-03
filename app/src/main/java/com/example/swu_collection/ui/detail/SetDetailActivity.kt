package com.example.swu_collection.ui.detail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.navArgs
import com.example.swu_collection.R
import com.example.swu_collection.databinding.ActivitySetDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SetDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySetDetailBinding
    private val setDetailViewModel: SetDetailViewModel by viewModels()

    private val args:SetDetailActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySetDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}