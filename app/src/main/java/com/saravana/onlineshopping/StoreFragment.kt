package com.saravana.onlineshopping

import Adapter.StoreAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.saravana.onlineshopping.databinding.FragmentStoreBinding
import com.saravana.onlineshoppingcore.Product
import com.saravana.onlineshoppingcore.Store

class StoreFragment : Fragment() {

    private var _binding: FragmentStoreBinding? = null
    private lateinit var recyclerView: RecyclerView

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentStoreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root
        val apple = Product(
            ID = 1, name = "Apple", price = 10.0, discount = 0.0, tax = 1.0
        )
        Store.addItem(apple)
        recyclerView = binding.recyclerStoreView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapter = StoreAdapter(storeItem = Store.getStoreItem())
        recyclerView.adapter = adapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}