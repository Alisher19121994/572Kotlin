package com.example.a571kotlin.`1-Adapters`

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a571kotlin.`1-Models`.Contents
import com.example.a572kotlin.R

class Main_Adapter(var context: Context, var list: ArrayList<Contents>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var EXPLORES = 0
    private var CONTENTS = 1
    override fun getItemViewType(position: Int): Int {

        if (isHeader(position)) {
            return EXPLORES
        } else {
            return CONTENTS
        }
    }

    fun isHeader(position: Int): Boolean {
        return position == 0
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == EXPLORES) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.explore, parent, false)
            return ExploreViewHolder(view)
        }
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contents, parent, false)
        return ContentsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val main = list[position]
        if (holder is ExploreViewHolder) {

        }

        if (holder is ContentsViewHolder) {
            holder.contents.text = main.contentsText
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ExploreViewHolder(item: View) : RecyclerView.ViewHolder(item) {

    }

    inner class ContentsViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        var contents: TextView = item.findViewById(R.id.contents_text_id)

    }
}