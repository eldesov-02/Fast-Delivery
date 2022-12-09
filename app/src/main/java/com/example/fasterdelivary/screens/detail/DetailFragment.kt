package com.example.fasterdelivary.screens.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.fasterdelivary.APP
import com.example.fasterdelivary.R
import com.example.fasterdelivary.databinding.FragmentDetailBinding
import com.example.fasterdelivary.model.OrderModel


class DetailFragment : Fragment() {

    lateinit var binding:FragmentDetailBinding
    lateinit var currentOrder: OrderModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(layoutInflater,container,false)
        currentOrder = arguments?.getSerializable("order") as OrderModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        val viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
        binding.tvTitleDetail.text = currentOrder.title
        binding.tvDescDetail.text = currentOrder.description

        binding.btnDelete.setOnClickListener{
            viewModel.delete(currentOrder){}
            APP.navController.navigate(R.id.action_detailFragment_to_basketFragment)
        }

        binding.btnBack.setOnClickListener{
            APP.navController.navigate(R.id.action_detailFragment_to_basketFragment)
        }
    }

}