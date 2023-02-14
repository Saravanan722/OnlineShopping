package com.saravana.onlineshopping

import Adapter.StoreAdapter
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.saravana.onlineshopping.databinding.FragmentStoreBinding
import com.saravana.onlineshoppingcore.Admin
import com.saravana.onlineshoppingcore.Product
import com.saravana.onlineshoppingcore.Store

class StoreFragment : Fragment() {
    private val admin = Admin()
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

        admin.addStore()


        recyclerView = binding.recyclerStoreView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapter = StoreAdapter(storeItem = Store.getStoreItem())
        recyclerView.adapter = adapter

        adapter.setOnClickListener(object : StoreAdapter.OnItemClickListener {
            override fun onStoreItemClick(position: Int) {
                Toast.makeText(requireContext(), "clicked ", Toast.LENGTH_SHORT).show()
                nextFragment()
            }

        })


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun nextFragment() {
        val fragmentManager = parentFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment_container, ShowDetailProductFragment())
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}