package com.saravana.onlineshopping

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.saravana.onlineshopping.databinding.FragmentCartBinding
import com.saravana.onlineshoppingcore.Cart
import com.saravana.onlineshoppingcore.Product

class CartFragment: Fragment() {

    private val cart = Cart()

    private var _binding: FragmentCartBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cart.addCart(Product(
            ID = 2,
            name = "Cricket Ball",
            price = 100.0,
            discount = 10.0,
            tax = 20.0
        ), 1)
        Log.d(TAG, "${cart.filterCartItem()}")

        cart.viewCartItem()
        binding.productName.text = "Something"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private val TAG = "CartFragment"
    }
}