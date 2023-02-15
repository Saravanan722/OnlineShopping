package com.saravana.onlineshopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.saravana.onlineshopping.databinding.FragmentShowDetailProductBinding
import com.saravana.onlineshoppingcore.Admin
import com.saravana.onlineshoppingcore.Cart
import com.saravana.onlineshoppingcore.Product

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ShowDetailProductFragment : Fragment() {
    private val admin = Admin()
    private val cart = Cart()
    private var _binding: FragmentShowDetailProductBinding? = null
    private var changeQuantity = 1

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
        val item = admin.copyProduct()

        if (changeQuantity <= 1) {

            binding.quantityDecrement.setOnClickListener {
                changeQuantity--
                binding.quantityText.text = changeQuantity.toString()
            }
        }

        if (changeQuantity >= 1) {
            binding.quantityIncrement.setOnClickListener {
                changeQuantity++
                binding.quantityText.text = changeQuantity.toString()
            }
        }

        binding.addToCart.setOnClickListener {
            cart.addCart(item, changeQuantity)
            Toast.makeText(requireContext(), "Added to cart ", Toast.LENGTH_SHORT).show()
        }
        initialSetup(item)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initialSetup(product: Product) {

        binding.DescriptionText.text = product.description
        binding.titleText.text = product.name
        binding.priceText.text = product.price.toString()
    }
}