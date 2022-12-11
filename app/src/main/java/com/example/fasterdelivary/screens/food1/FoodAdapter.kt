package com.example.fasterdelivary.screens.food1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fasterdelivary.R

class FoodAdapter(
    private val context: FoodFragment,
    private val dataset: List<Food>
    ): RecyclerView.Adapter<FoodAdapter.ItemViewHolder>(){

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val phraseTitle: TextView = view.findViewById(R.id.text_item_market)
        val foodImage: ImageView = view.findViewById(R.id.image_item_market)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_market_view, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val market = dataset[position]
        holder.phraseTitle.text = context.resources.getString(market.stringResourceId)
        holder.foodImage.setImageResource(market.imageResourseId)
    }

    override fun getItemCount(): Int = dataset.size
}