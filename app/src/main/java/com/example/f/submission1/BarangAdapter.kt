package com.example.f.submission1

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.list_layout.*

class BarangAdapter(private val context: Context,private val barang: List<Barang>,val click:(Barang)->Unit):RecyclerView.Adapter<BarangAdapter.BarangVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BarangVH {
        return BarangVH(LayoutInflater.from(context).inflate(R.layout.list_layout,parent,false))
    }

    override fun getItemCount(): Int = barang.size

    override fun onBindViewHolder(holder: BarangVH, position: Int) {
        holder.bind(context,barang[position],click)
    }

    //anko containerView
    inner class BarangVH(override val containerView: View) : RecyclerView.ViewHolder(containerView),
        LayoutContainer{
            fun bind(c:Context,b:Barang,clk:(Barang)->Unit){
                judul.text = b.namaBarang
                harga.text = "Rp.${b.hargaBarang.toString()},-"

                val id = c.resources.getIdentifier(b.gambarBarang,"drawable",c.packageName)
                gbr.setImageResource(id)

                containerView.setOnClickListener { clk(b) }
            }

    }
}