package Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.saravana.onlineshopping.R
import com.saravana.onlineshopping.databinding.StoreItemBinding
import com.saravana.onlineshoppingcore.Store

class StoreAdapter : RecyclerView.Adapter<StoreAdapter.StoreViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
        val binding = StoreItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StoreViewHolder(binding)
    }

    override fun getItemCount(): Int = Store.getProductCount()

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
        holder.bind()
    }

    inner class StoreViewHolder(private val binding: StoreItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
//            binding.storeItemNameTextView
//            binding.storeItemImageView
//            binding.storeItemPriceView
//            binding.storeItemQuantityView
//            binding.storeItemDiscountView
        }
    }
}