package com.saravana.onlineshopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.saravana.onlineshopping.databinding.FragmentCartBinding
import com.saravana.onlineshoppingcore.Cart
import com.saravana.onlineshoppingcore.CartItem
import com.saravana.onlineshoppingcore.Product
import com.saravana.onlineshoppingcore.Store

class CartFragment : Fragment() {

    private val cart = Cart()


    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentCartBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCartBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Store.getStoreItem()

        recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapter = CartAdapter(cartItem = cart.getCartItem())
        recyclerView.adapter = adapter
        adapter.setOnClickListener(object : CartAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                Toast.makeText(requireContext(), "Clicked $position", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}