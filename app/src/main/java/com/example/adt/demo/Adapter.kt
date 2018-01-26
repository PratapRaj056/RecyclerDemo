package com.example.adt.demo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.layout_att.view.*


class Adapter(val list: ArrayList<AttData>): RecyclerView.Adapter<Adapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent!!.context)

        val feedView = inflater.inflate(R.layout.layout_att, parent, false)
        val viewholder = ViewHolder(feedView)

        return viewholder
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bindData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindData(attData: AttData){
            itemView.name.text = attData.userName
            itemView.att.text = attData.attendance
        }
    }

    class AttData(val userName: String, val attendance: String)
}