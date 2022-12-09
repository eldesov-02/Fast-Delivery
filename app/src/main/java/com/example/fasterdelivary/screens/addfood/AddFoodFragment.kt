package com.example.fasterdelivary.screens.addfood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.fasterdelivary.APP
import com.example.fasterdelivary.R
import com.example.fasterdelivary.databinding.FragmentAddFoodBinding
import com.example.fasterdelivary.databinding.FragmentBasketBinding
import com.example.fasterdelivary.model.OrderModel

class AddFoodFragment : Fragment() {

    lateinit var binding: FragmentAddFoodBinding

     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         binding = FragmentAddFoodBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       init()
    }

    private fun init() {
        val viewModel = ViewModelProvider(this).get(AddOrderViewModel::class.java)
        binding.btnAddFood.setOnClickListener{
            val title = binding.etAddFood.text.toString()
            val description = binding.etAddDesc.text.toString()
            viewModel.insert(OrderModel(title = title, description = description)){}
            APP.navController.navigate(R.id.action_addFoodFragment_to_basketFragment)
        }
       binding.btnBack2.setOnClickListener{
           APP.navController.navigate(R.id.action_addFoodFragment_to_basketFragment)
       }

    }

}