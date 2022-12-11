package com.example.fasterdelivary.maski.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fasterdelivary.R
import com.example.fasterdelivary.model.UserModel

class UserAdapter: RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var userList = ArrayList<UserModel>()

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_food_layout,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
    return userList.size
    }


}