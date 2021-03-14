package com.kenik.app.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kenik.app.ProductDomain
import com.kenik.app.databinding.ItemListAllProductBinding

class HomeAdapter(val context: Context, val items: List<ProductDomain>) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    private var mListener : OnAdapterItemClickListener? = null
    fun onItemClick(listener : OnAdapterItemClickListener) {
        mListener = listener
    }

    inner class ViewHolder(val binding: ItemListAllProductBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(domain: ProductDomain) {
            binding.run {
                tvName.text = domain.name
                tvDetail.text = domain.description
                if (domain.thumbnail.isNotEmpty()) {
                    Glide.with(context).load(domain.thumbnail).into(ivProduct)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemListAllProductBinding.inflate(LayoutInflater.from(context), parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(items[position])
    }

    override fun getItemCount(): Int = items.size
}