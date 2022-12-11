package com.example.fasterdelivary.screens.market

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fasterdelivary.R
import com.example.fasterdelivary.screens.pharmacy.Pharmacy
import com.example.fasterdelivary.screens.pharmacy.PharmacyAdapter
import com.example.fasterdelivary.screens.pharmacy.PharmacyFragment

class MarketAdapter(
    private val context:MarketFragment,
    private val dataset:List<Market>
): RecyclerView.Adapter<MarketAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val medicineTitle: TextView = view.findViewById(R.id.text_item_market)
        val foodImage: ImageView = view.findViewById(R.id.image_item_market)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_food_layout, parent, false)
        return MarketAdapter.ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val market = dataset[position]
        holder.medicineTitle.text = context.resources.getString(market.stringResourceId)
        holder.foodImage.setImageResource(market.imageResourseId)
    }

    override fun getItemCount(): Int = dataset.size

}