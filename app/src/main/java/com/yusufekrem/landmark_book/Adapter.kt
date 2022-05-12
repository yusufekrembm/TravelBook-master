package com.yusufekrem.landmark_book

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yusufekrem.landmark_book.databinding.RecyclerRowBinding

class Adapter(val landMarkList : ArrayList<Data>) : RecyclerView.Adapter<Adapter.LandmarkHolder>(){

    class LandmarkHolder(val binding: RecyclerRowBinding ) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return LandmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.recyclerRowTextView.text = landMarkList[position].name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("landmark",landMarkList[position])
            holder.itemView.context.startActivity(intent) // activite içerisinde degilim
        }
    }

    override fun getItemCount(): Int {
        return landMarkList.size
    }

}