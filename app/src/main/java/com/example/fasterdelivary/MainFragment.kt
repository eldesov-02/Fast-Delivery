package com.example.fasterdelivary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onStart() {
        super.onStart()
        mainToFood.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_foodFragment)
        }
        mainToMarket.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_marketFragment)
        }
        mainToPharmacy.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_pharmacyFragment)
        }
    }
}