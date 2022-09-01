package com.example2.a1xbetproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example2.a1xbetproject.adapter.sportsevent.SportEventModel
import com.test.luckydrum.R


class UserAdapter(
    val onUserClick: OnUserClickListener,val data : List<SportEventModel>
) : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){




    class UserViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val TV1 = view.findViewById<TextView>(R.id.TV1loss)
        val TV2 = view.findViewById<TextView>(R.id.TV2win)
        val TV3 = view.findViewById<TextView>(R.id.TV3draw)
        val TVtitle = view.findViewById<TextView>(R.id.TVtitleEvent)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
       val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_bet, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        holder.TV1.text = data[position].xBet1
        holder.TV2.text = data[position].xBet2
        holder.TV3.text = data[position].xBet3
        holder.TVtitle.text = data[position].titleEvent

        holder.view.setOnClickListener {
            onUserClick.onClick(data[position])
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun interface OnUserClickListener {
        fun onClick(film: SportEventModel)
    }

}
