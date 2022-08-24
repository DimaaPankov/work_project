package com.example2.wallpapercars.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example2.wallpapercars.R


class AdapterLots(
    val onUserClick: OnUserClickListener,val data : List<Int>
) : RecyclerView.Adapter<AdapterLots.UserViewHolder>(){




    class UserViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val IV = view.findViewById<ImageView>(R.id.IVcard)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
       val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_car, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        holder.IV.setImageResource(data[position])


        holder.view.setOnClickListener {
            onUserClick.onClick(data[position])
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun interface OnUserClickListener {
        fun onClick(img: Int)
    }

}
