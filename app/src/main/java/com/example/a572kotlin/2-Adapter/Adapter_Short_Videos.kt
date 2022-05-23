package com.example.a572kotlin.`2-Adapter`

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a572kotlin.R
import com.example.a572kotlin.`2-Models`.Shorts

class Adapter_Short_Videos(var context: Context, var list: ArrayList<Shorts>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.shorts_videos, parent, false)
        return Shorts_Videos_ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val shorts = list[position]
        if (holder is Shorts_Videos_ViewHolder) {
            holder.image.setImageResource(shorts.image)
            holder.title.text = shorts.title
            holder.views.text = shorts.views
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class Shorts_Videos_ViewHolder(itemviews: View) : RecyclerView.ViewHolder(itemviews) {
        var image: ImageView = itemviews.findViewById(R.id.shorts_videos_image_id)
        var title: TextView = itemviews.findViewById(R.id.shorts_text_1_id)
        var views: TextView = itemviews.findViewById(R.id.shorts_text_2_id)
    }
}