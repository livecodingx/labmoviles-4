
package com.huancahuari.andres.lab13

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.huancahuari.andres.lab13.databinding.ListItemImgBinding
import java.io.File

class GalleryAdapter( private val fileArray: Array<File>) :
    RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ListItemImgBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(file: File){
            Glide.with(binding.root).load(file).into(binding.localImg)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(ListItemImgBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(fileArray[position])  // Llamamos a bind para asociar los datos
    }

    override fun getItemCount(): Int = fileArray.size
}

