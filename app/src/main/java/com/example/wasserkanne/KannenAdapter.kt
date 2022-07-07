package com.example.wasserkanne

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wasserkanne.databinding.ListItemBinding

class KannenAdapter(private val kannenListe: List<Kanne>) :
    RecyclerView.Adapter<KannenAdapter.KannenViewHolder>() {
    class KannenViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KannenViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return KannenViewHolder(binding)
    }

    override fun onBindViewHolder(holder: KannenViewHolder, position: Int) {
        val kanne = kannenListe[position]
        holder.binding.kannenTitel.text = kanne.titel
        holder.binding.preis.text = kanne.preis.toString()
        holder.binding.kanneBild.setImageResource(kanne.imageId)
    }

    override fun getItemCount(): Int {
        return kannenListe.size
    }
}
