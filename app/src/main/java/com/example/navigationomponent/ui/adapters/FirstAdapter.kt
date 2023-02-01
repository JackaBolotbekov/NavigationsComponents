package com.example.navigationomponent.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigationomponent.data.`interface`.setOnListClick
import com.example.navigationomponent.data.model.Models
import com.example.navigationomponent.databinding.ItemImageBinding

class FirstAdapter(private val setOnListClick: setOnListClick) : RecyclerView.Adapter<FirstAdapter.ViewHolder>(), View.OnClickListener {

    private val catList: List<Models> = ArrayList()

    class ViewHolder(private val binding: ItemImageBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(models: Models) {
            Glide.with(binding.itemImage.context).load(models.image).into(binding.itemImage)
            binding.text2.text = models.title
            binding.root.tag = models
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemImageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
        )
        binding.root.setOnClickListener(this)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(catList[position])
    }

    override fun getItemCount(): Int = catList.size

    override fun onClick(view: View?) {
        setOnListClick.onClick(view?.tag as Models)
    }
}
