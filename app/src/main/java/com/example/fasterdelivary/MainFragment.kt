package com.example.fasterdelivary

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.work.*
import com.example.fasterdelivary.databinding.ActivityMainBinding
import com.example.fasterdelivary.databinding.ActivityMainBinding.inflate
import com.example.fasterdelivary.databinding.FragmentMainBinding
import com.example.fasterdelivary.work.MyWork
import kotlinx.android.synthetic.main.fragment_main.*
import java.util.concurrent.TimeUnit

class MainFragment : Fragment() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(layoutInflater,container,false)
        return binding.root

        imageButton2.setOnClickListener(){
            drawerLayout.openDrawer(GravityCompat.START)
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        ToFood.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_foodFragment)
        }
        toSupermarket.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_marketFragment)
        }
        to_pharmacy.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_pharmacyFragment)
        }
        to_magazine.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_basketFragment)
        }
        to_phalochka.setOnClickListener(){
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_winBonusFragment)
        }
    }
}


