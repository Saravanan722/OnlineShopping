package Adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.saravana.onlineshopping.databinding.ItemViewBinding
import com.saravana.onlineshoppingcore.CartItem

class CartAdapter(val cartItem: List<CartItem>) :
    RecyclerView.Adapter<CartAdapter.CartViewHolder>() {
    private lateinit var mListener: OnItemClickListener


    interface OnItemClickListener {
        fun onItemClick(position: Int)

    }

    fun setOnClickListener(listener: OnItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return CartViewHolder(binding, mListener)
    }

    override fun getItemCount(): Int {
        return cartItem.size
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val item = cartItem[position]
        holder.bind(item)


    }

    inner class CartViewHolder(binding: ItemViewBinding, listener: OnItemClickListener) :
        RecyclerView.ViewHolder(binding.root) {
        private val productQuantity: TextView = binding.productQuantity
        private val productName: TextView = binding.productName
        private val imageView: ImageView = binding.productImage
        private val productPrice: TextView = binding.productPrice
        private val productDiscount: TextView = binding.productDiscount
        private val productRemove: TextView = binding.productRemoved
        private val productSaveForLater: TextView = binding.savedForLater


        private var currentItem: CartItem? = null

        init {
            productRemove.setOnClickListener {
                listener.onItemClick(adapterPosition)
                productSaveForLater.setOnClickListener {
                    listener.onItemClick(adapterPosition)

                }

            }
        }

        @SuppressLint("SetTextI18n")
        fun bind(cartItem: CartItem) {
            currentItem = cartItem

            productName.text = cartItem.product.name
            productQuantity.text = "${cartItem.quantity}"
            productPrice.text = "$${cartItem.product.price}"
            productDiscount.text = "% ${cartItem.product.discount}"


        }

    }


}


