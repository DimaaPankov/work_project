package com.sekvenie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sekvenie.R
import com.sekvenie.deteilpresentr.Deteilpresenter
import com.sekvenie.model.network.service.Data



class UserAdapter(
    val onUserClick: OnUserClickListener
) : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){
    private lateinit var filmsList: List<Data>
    var Position = 0
    private val presenter by lazy { Deteilpresenter.getInstance() }
    class UserViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val IV: ImageView = view.findViewById(R.id.IVcard)
        val TV: TextView = view.findViewById(R.id.TVitem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_item_film, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
           holder.TV.setText(filmsList[position].title)
           holder.IV.setImageResource(filmsList[position].img)

        holder.itemView.setOnClickListener {
            onUserClick.onClick(filmsList[position])
            presenter.setChooseFilm(filmsList[position])
            Position = position
        }
    }

    override fun getItemCount(): Int {
    return filmsList.size
    }
      //sjf
    fun setList(list: List<Data>){
        filmsList = list
    }

    fun clearList() {
        filmsList = mutableListOf()
    }


    fun interface OnUserClickListener {
        fun onClick(film: Data)
    }
}

