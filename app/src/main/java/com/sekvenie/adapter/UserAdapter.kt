package com.sekvenie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.ImageLoader
import coil.load
import coil.util.DebugLogger
import com.sekvenie.R
import com.sekvenie.deteilpresentr.Deteilpresenter
import com.sekvenie.model.network.service.Data
import com.sekvenie.model.network.service.Film
import kotlinx.android.synthetic.main.cardview_item_film.view.*


class UserAdapter(
    val onUserClick: OnUserClickListener
) : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){
    private lateinit var filmsList: List<Data>
    var Position = 0
    private val presenter by lazy { Deteilpresenter.getInstance() }
    class UserViewHolder(view : View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_item_film, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
           holder.itemView.TVitem.setText(filmsList[position].title)
           holder.itemView.IVcard.setImageResource(filmsList[position].img)

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

