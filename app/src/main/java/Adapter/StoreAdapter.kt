package Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.saravana.onlineshopping.R
import com.saravana.onlineshopping.ShowDetailProductFragment
import com.saravana.onlineshopping.StoreFragment
import com.saravana.onlineshopping.databinding.StoreItemBinding
import com.saravana.onlineshoppingcore.Product
import com.saravana.onlineshoppingcore.Store


class StoreAdapter(val storeItem: List<Product>) :
    RecyclerView.Adapter<StoreAdapter.StoreViewHolder>() {
    private lateinit var mListener: StoreAdapter.OnItemClickListener

    interface OnItemClickListener {
        fun onStoreItemClick(position: Int)

    }

    fun setOnClickListener(listener: OnItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
        val binding = StoreItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StoreViewHolder(binding,mListener)
    }

    override fun getItemCount(): Int = Store.getProductCount()

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
        val product = storeItem[position]
        holder.bind(product)


    }

    inner class StoreViewHolder(binding: StoreItemBinding, listener: OnItemClickListener) :
        RecyclerView.ViewHolder(binding.root) {
        private val storeItemNameTextView: TextView = binding.storeItemNameTextView
        private val storeItemImageView: ImageView = binding.storeItemImageView
        private val storeItemPriceView: TextView = binding.storeItemPriceView
        private val storeItemDiscountView: TextView = binding.storeItemDiscountView
        private val storeItemTax: TextView = binding.storeItemTax

        init {
            storeItemImageView.setOnClickListener {
                listener.onStoreItemClick(adapterPosition)

            }
        }

        fun bind(product: Product) {
            storeItemNameTextView.text = product.name
            storeItemPriceView.text = product.price.toString()
            storeItemDiscountView.text = product.discount.toString()
            storeItemTax.text = product.tax.toString()
        }
    }

}


