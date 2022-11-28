package com.example.fasterdelivary

import android.icu.lang.UCharacter.IndicPositionalCategory.LEFT
import android.os.Bundle
import android.view.Gravity
import android.view.Gravity.LEFT
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)

        imageButton2.setOnClickListener(){
            drawerLayout.openDrawer(GravityCompat.START)
        }
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
        mainToBasket.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_basketFragment)
        }
    }
}


