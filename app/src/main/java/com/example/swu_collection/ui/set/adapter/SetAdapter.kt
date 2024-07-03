package com.example.swu_collection.ui.set.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.swu_collection.R
import com.example.swu_collection.domain.model.SetInfo

class SetAdapter(
    private var setList: List<SetInfo> = emptyList(),
    private val onItemSelected: (SetInfo) -> Unit
) : RecyclerView.Adapter<SetViewHolder>() {

    fun update(inputList: List<SetInfo>) {
        setList = inputList
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SetViewHolder {
        return SetViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_set, parent, false)
        )
    }

    override fun getItemCount(): Int = setList.size

    override fun onBindViewHolder(holder: SetViewHolder, position: Int) {
        holder.render(setList[position], onItemSelected)
    }

}