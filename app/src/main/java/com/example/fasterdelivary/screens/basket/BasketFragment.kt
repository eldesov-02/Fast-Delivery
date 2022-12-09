package com.example.fasterdelivary.screens.basket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.fasterdelivary.APP
import com.example.fasterdelivary.R
import com.example.fasterdelivary.databinding.FragmentBasketBinding
import com.example.fasterdelivary.maski.adapter.OrderAdapter
import com.example.fasterdelivary.model.OrderModel
import kotlinx.android.synthetic.main.fragment_basket.*

class BasketFragment : Fragment() {

    lateinit var binding: FragmentBasketBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: OrderAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBasketBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init(){
        val viewModel = ViewModelProvider(this).get(BasketViewModel::class.java)
        viewModel.initDatabase()
        recyclerView = binding.rvOrder
        adapter = OrderAdapter()
        recyclerView.adapter = adapter
        viewModel.getAllOrders().observe(viewLifecycleOwner,{listOrder->
            adapter.setList(listOrder.asReversed())
        })

        binding.btnNext.setOnClickListener{
            APP.navController.navigate(R.id.action_basketFragment_to_addFoodFragment)
        }
        binding.button4.setOnClickListener{
            APP.navController.navigate(R.id.action_basketFragment_to_mainFragment)
        }
    }

    companion object{
        fun clickOrder(orderModel: OrderModel){
            val bundle = Bundle()
            bundle.putSerializable("order", orderModel)
            APP.navController.navigate(R.id.action_basketFragment_to_detailFragment,bundle)
        }
    }
}