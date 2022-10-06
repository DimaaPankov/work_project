package com.sekvenie.jdshjlgdsl

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sekvenie.R
import com.sekvenie.dkfhkd.ekhgfisd
import com.sekvenie.model.dksghdlslk.klfslks.egkhds



class eqohsgoids(
    val hfhfh: OnUserClickListener
) : RecyclerView.Adapter<eqohsgoids.UserViewHolder>(){
    private lateinit var sdjkhd: List<egkhds>
    var oehkdg = 0
    private val odlhkvd by lazy { ekhgfisd.sogfkd() }
    class UserViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val dgjf: ImageView = view.findViewById(R.id.IVcard)
        val jfkwjdf: TextView = view.findViewById(R.id.TVitem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val eohgdjs = LayoutInflater.from(parent.context).inflate(R.layout.cardview_item_film, parent, false)
        return UserViewHolder(eohgdjs)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
           holder.jfkwjdf.setText(sdjkhd[position].bjgds)
           holder.dgjf.setImageResource(sdjkhd[position].img)

        holder.itemView.setOnClickListener {
            hfhfh.onClick(sdjkhd[position])
            odlhkvd.sofkhd(sdjkhd[position])
            oehkdg = position
        }
    }

    override fun getItemCount(): Int {
    return sdjkhd.size
    }
      //sjf
    fun setList(list: List<egkhds>){
        sdjkhd = list
    }

    fun clearList() {
        sdjkhd = mutableListOf()
    }


    fun interface OnUserClickListener {
        fun onClick(eogusd: egkhds)
    }
}

