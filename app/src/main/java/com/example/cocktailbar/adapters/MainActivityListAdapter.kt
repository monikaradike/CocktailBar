package com.example.cocktailbar.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cocktailbar.databinding.CocktailListItemBinding
import com.example.cocktailbar.models.Cocktail
import com.example.cocktailbar.util.getIngredientsAsString

class MainActivityListAdapter(private val listener: OnItemClickListener) : ListAdapter<Cocktail, MainActivityListAdapter.ViewHolder>(UserComparator()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CocktailListItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(getItem(position))

    class UserComparator : DiffUtil.ItemCallback<Cocktail>() {
        override fun areItemsTheSame(oldItem: Cocktail, newItem: Cocktail): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Cocktail, newItem: Cocktail): Boolean {
            return oldItem.id == newItem.id
        }
    }

    inner class ViewHolder(val binding: CocktailListItemBinding) : RecyclerView.ViewHolder(binding.root), View.OnClickListener {
        fun bind(item: Cocktail) {
            binding.item = item
            binding.executePendingBindings()

            binding.ingredients.text = getIngredientsAsString(item)

            Glide.with(this.itemView.context)
                .load((binding.item as Cocktail).imageUrlThumb)
                .into(binding.cocktailThumb)
        }
        init {
            binding.root.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}
