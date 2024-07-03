package com.example.swu_collection.ui.set.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.example.swu_collection.databinding.ItemSetBinding
import com.example.swu_collection.domain.model.SetInfo

class SetViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSetBinding.bind(view)

    fun render(setInfo: SetInfo, onItemSelected: (SetInfo) -> Unit) {
        val context = binding.tvSet.context
        binding.ivSet.setBackgroundResource(setInfo.logo)
        binding.tvSet.text = context.getString(setInfo.name)

        binding.clParent.setOnClickListener {
            startRotationAnimation(binding.ivSet, action = { onItemSelected(setInfo) })
        }
    }

    private fun startRotationAnimation(view: View, action: () -> Unit) {
        view.animate().apply {
            duration = 200
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction { action() }
            start()
        }
    }
}