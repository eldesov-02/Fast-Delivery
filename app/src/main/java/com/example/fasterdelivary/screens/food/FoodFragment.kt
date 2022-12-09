package com.example.fasterdelivary.screens.food

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fasterdelivary.R
import com.example.fasterdelivary.maski.adapter.UserAdapter
import com.example.fasterdelivary.model.UserModel
import kotlinx.android.synthetic.main.fragment_food.*

class FoodFragment : Fragment() {
    lateinit var adapter: UserAdapter
    lateinit var recyclerView: RecyclerView
    private var imageIdList = listOf(
        R.drawable.img,
        R.drawable.normpizza1,
        R.drawable.pizza
    )

     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food, container, false)
         initial()
         myUser()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initial()
        myUser()
    }

    private fun initial() {
        recyclerView = rv_user
        adapter = UserAdapter()
        recyclerView.adapter = adapter
        adapter.setList(myUser())
    }

    fun myUser(): ArrayList<UserModel>{
        val userList = ArrayList<UserModel>()



        return userList
    }
}