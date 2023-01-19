package com.saravana.onlineshopping

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saravana.onlineshopping.databinding.FragmentSecondBinding
import com.saravana.onlineshoppingcore.Admin
import com.saravana.onlineshoppingcore.Store

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class CustomerFragment : Fragment() {
    private val admin = Admin()

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        admin.addStore()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}