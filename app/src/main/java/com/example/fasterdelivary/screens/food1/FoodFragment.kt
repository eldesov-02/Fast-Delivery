package com.example.fasterdelivary.screens.food1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fasterdelivary.R

class FoodFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_market, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val phrasesDataSet: List<Food> = PharseDataSourse().loadMarket()
        val recyclerView:RecyclerView = view.findViewById<RecyclerView>(R.id.recycler_market)
        recyclerView.adapter = FoodAdapter(this, phrasesDataSet)
    }


}