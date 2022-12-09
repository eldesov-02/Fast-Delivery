package com.example.fasterdelivary

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fasterdelivary.db.repository.OrderRepository
import com.example.fasterdelivary.screens.market.MarketAdapter
import com.example.fasterdelivary.screens.market.MarketViewModel

lateinit var APP: MainActivity
lateinit var REPOSITORY: OrderRepository

class TextItemViewHolder(val textView: TextView): RecyclerView.ViewHolder(textView)

