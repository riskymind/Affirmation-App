package com.example.affirmationapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationapp.R
import com.example.affirmationapp.databinding.ListItemBinding
import com.example.affirmationapp.model.Affirmation

class ItemAdapter(private val context: Context, private val dataSet: List<Affirmation>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(var view: ListItemBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context),
       parent, false)

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item: Affirmation = dataSet[position]
        holder.view.itemTitle.text = context.resources.getString(item.stringResourceId)
        holder.view.itemImage.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int = dataSet.size
}