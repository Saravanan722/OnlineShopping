package com.saravana.onlineshopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.saravana.onlineshopping.databinding.FragmentShowDetailProductBinding
import com.saravana.onlineshoppingcore.Admin
import com.saravana.onlineshoppingcore.Cart
import com.saravana.onlineshoppingcore.Product

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ShowDetailProductFragment : Fragment() {
    private val cart = Cart()
    private val admin =Admin()

    private var _binding: FragmentShowDetailProductBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentShowDetailProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.addToCart.setOnClickListener {
          val item = admin.copyProduct()
            cart.addCart(item,5)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}