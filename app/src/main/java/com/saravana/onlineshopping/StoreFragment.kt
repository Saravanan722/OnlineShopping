package com.saravana.onlineshopping

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saravana.onlineshopping.databinding.FragmentStoreBinding
import com.saravana.onlineshoppingcore.Store

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class StoreFragment : Fragment() {

    private var _binding: FragmentStoreBinding? = null

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
        Store.getStoreItem()
        Store.searchItem("Apple")
        Store.getProductCount()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}