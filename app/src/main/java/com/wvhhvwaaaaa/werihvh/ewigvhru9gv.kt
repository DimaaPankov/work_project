package com.wvhhvwaaaaa.werihvh

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wvhhvwaaaaa.R


class AdapterLots(
    val ebu9orubosurbop: OnUserClickListener, val data : List<Int>, val buy : List<Int>
) : RecyclerView.Adapter<AdapterLots.UserViewHolder>(){




    class UserViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val e9ogbueriob = view.findViewById<ImageView>(R.id.IVcard)
        val e0bupdbjklejio = view.findViewById<TextView>(R.id.IVbuy)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
       val e9bgubuir =  LayoutInflater.from(parent.context).inflate(R.layout.item_cariii, parent, false)
        return UserViewHolder(e9bgubuir)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        holder.e9ogbueriob.setImageResource(data[position])
        holder.e0bupdbjklejio.text = "$"+buy[position]

        holder.view.setOnClickListener {
            ebu9orubosurbop.onClick(data[position],buy[position])
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun interface OnUserClickListener {
        fun onClick(img: Int,buy:Int)
    }

}
