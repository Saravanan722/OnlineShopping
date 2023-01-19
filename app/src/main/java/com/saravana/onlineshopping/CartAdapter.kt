package com.saravana.onlineshopping

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
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

    inner class CartViewHolder(view: View, listener: OnItemClickListener) :
        RecyclerView.ViewHolder(view) {
        private val productQuantity: TextView = itemView.findViewById(R.id.product_quantity)
        private val productName: TextView = itemView.findViewById(R.id.product_name)
        private val imageView: ImageView = itemView.findViewById(R.id.product_image)
        private val productPrice: TextView = itemView.findViewById(R.id.product_price)
        private val productDiscount: TextView = itemView.findViewById(R.id.product_discount)
        private val productRemove: TextView = itemView.findViewById(R.id.product_removed)
        private val productSaveForLater: TextView = itemView.findViewById(R.id.saved_for_later)


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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)

        return CartViewHolder(view, mListener)
    }

    override fun getItemCount(): Int {
        return cartItem.size
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val item = cartItem[position]
        holder.bind(item)


    }

}


