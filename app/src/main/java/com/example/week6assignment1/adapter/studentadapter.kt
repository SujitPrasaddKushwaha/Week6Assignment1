package com.example.week6assignment1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.week6assignment1.R
import com.example.week6assignment1.fragment.HomeFragment
import com.example.week6assignment1.model.studentClass

class studentadapter(
    val studentlist: ArrayList<studentClass>,
    val context: HomeFragment
) : RecyclerView.Adapter<studentadapter.studentviewholder>() {
    class studentviewholder(view: View) : RecyclerView.ViewHolder(view) {
        val imageprofile: ImageView
        val name: TextView
        val age: TextView
        val address: TextView
        val gender: TextView

        init {
            imageprofile = view.findViewById(R.id.profilePicture)
            name = view.findViewById(R.id.name)
            age = view.findViewById(R.id.age)
            address = view.findViewById(R.id.address)
            gender = view.findViewById(R.id.gender)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): studentviewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_item_layout,parent,false)
        return studentviewholder(view)
    }

    override fun onBindViewHolder(holder: studentviewholder, position: Int) {
        val lst = studentlist[position]
        holder.name.text = lst.name
        holder.age.text = lst.age
        holder.address.text = lst.address
        holder.gender.text = lst.gender

        Glide.with(context)
            .load(lst.imageprofile)
            .into(holder.imageprofile)
    }

    override fun getItemCount(): Int {
        return studentlist.size
    }
}