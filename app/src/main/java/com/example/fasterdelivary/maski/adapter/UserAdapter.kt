package com.example.fasterdelivary.maski.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.fasterdelivary.R
import com.example.fasterdelivary.model.UserModel
import kotlinx.android.synthetic.main.item_user_layout.view.*

class UserAdapter: RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var userList = ArrayList<UserModel>()
    private var imageIdList = listOf(
        R.drawable.img,
        R.drawable.normpizza1,
        R.drawable.pizza
    )

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_layout,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.itemView.myImageView.id = imageIdList[position]
        holder.itemView.myImageViewText.text = userList[position].myImageViewText

    }

    override fun getItemCount(): Int {
    return userList.size
    }

    fun setList(list: List<UserModel>){
        userList = list as ArrayList<UserModel>
        notifyDataSetChanged()
    }
}