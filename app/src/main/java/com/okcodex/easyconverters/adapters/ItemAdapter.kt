package com.okcodex.easyconverters.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.okcodex.easyconverters.R
import com.okcodex.easyconverters.models.Model


class ItemAdapter(
    var context: Context?,
    list: List<Model>
) : RecyclerView.Adapter<ItemAdapter.MyViewHolder>() {

    var list: List<Model>
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recy, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: MyViewHolder,
        position: Int
    ) {
        val model: Model = list[position]
        holder.title.setText(model.title)
        holder.imageView.setImageResource(model.image)
    }

    override fun getItemCount(): Int {
        return list.size
    }


    inner class MyViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var title: TextView
        var imageView: ImageView

        init {
            title = itemView.findViewById(R.id.itemText)
            imageView = itemView.findViewById(R.id.itemimgID)
        }
    }


    init {
        this.list = list
    }



}