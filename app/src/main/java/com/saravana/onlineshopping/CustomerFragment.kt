package com.saravana.onlineshopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.saravana.onlineshopping.databinding.FragmentCustomerBinding
import com.saravana.onlineshoppingcore.Admin

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class CustomerFragment : Fragment() {
    private val admin = Admin()

    private var _binding: FragmentCustomerBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCustomerBinding.inflate(inflater, container, false)
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