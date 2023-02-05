package com.saravana.onlineshopping

import Adapter.StoreAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saravana.onlineshopping.databinding.FragmentStoreBinding
import com.saravana.onlineshoppingcore.Admin

class StoreFragment : Fragment() {

    private var _binding: FragmentStoreBinding? = null
    private lateinit var recyclerView: RecyclerView
    private val admin = Admin()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentStoreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        admin.addStore()
        recyclerView = binding.recyclerStoreView
        binding.recyclerStoreView.layoutManager = binding.recyclerStoreView.layoutManager
        val adapter = StoreAdapter()
        recyclerView.adapter = adapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}