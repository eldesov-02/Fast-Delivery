package com.example.fasterdelivary.maski.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.fasterdelivary.R
import com.example.fasterdelivary.model.OrderModel
import com.example.fasterdelivary.screens.basket.BasketFragment
import kotlinx.android.synthetic.main.item_layout.view.*
import java.io.FileDescriptor

class OrderAdapter: RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

        var listOrder = emptyList<OrderModel>()

        class OrderViewHolder(view: View): RecyclerView.ViewHolder(view)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
                return OrderViewHolder(view)
        }

        override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
                holder.itemView.item_title.text = listOrder[position].title

        }

        override fun getItemCount(): Int {
                return listOrder.size
        }

        @SuppressLint
        fun setList(list: List<OrderModel>){
              listOrder = list
                notifyDataSetChanged()
        }

        override fun onViewAttachedToWindow(holder: OrderViewHolder) {
                super.onViewAttachedToWindow(holder)
                holder.itemView.setOnClickListener{
                        BasketFragment.clickOrder(listOrder[holder.adapterPosition])
                }
        }

        override fun onViewDetachedFromWindow(holder: OrderViewHolder) {
                holder.itemView.setOnClickListener(null)
        }
}