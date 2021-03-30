package com.example.notesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

import androidx.recyclerview.widget.RecyclerView
import java.util.*

class adapter() : RecyclerView.Adapter<adapter.viewholder>() {
    var items: MutableList<Data> = Collections.emptyList();


    class viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: EditText = itemView.findViewById(R.id.txtname)
        var id: EditText = itemView.findViewById(R.id.txtid)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.add_user, parent, false)
        return viewholder(view)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.name.setText(items.get(position).txtname)
        holder.id.setText(items.get(position).id)
        insert(position,items)
    }

    override fun getItemCount(): Int {
        return items.size ?: 0
    }

    fun insert(position: Int, data :List<Data>) {
        if (data != null) {
            items.add(position, Data(txtname = null , id = null))
        }
        notifyItemInserted(position)
    }

}