package com.example.fasterdelivary.screens.market

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.compose.ui.layout.Layout
import androidx.recyclerview.widget.RecyclerView
import com.example.fasterdelivary.R
import com.example.fasterdelivary.TextItemViewHolder
import com.example.fasterdelivary.model.Market


class MarketAdapter : RecyclerView.Adapter<MarketAdapter.MyViewHolder>(){

    private val marketList = ArrayList<Market>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_market_view,
            parent,false
        )
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = marketList[position]

        holder.nameOfTheProduct.text = currentItem.nameOfTheProduct
        holder.price.text = currentItem.price
        holder.type.text = currentItem.type
    }

    override fun getItemCount(): Int {
        return marketList.size
    }

    fun updateMarketList(marketList : List<Market>){

        this.marketList.clear()
        this.marketList.addAll(marketList)
        notifyDataSetChanged()
    }

    class MyViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView){

        val nameOfTheProduct : TextView = itemView.findViewById(R.id.nameOfTheProduct)
        val price : TextView = itemView.findViewById(R.id.price)
        val type : TextView = itemView.findViewById(R.id.type)

    }


}