package com.saravana.onlineshopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.saravana.onlineshopping.databinding.FragmentShowDetailProductBinding
import com.saravana.onlineshoppingcore.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ShowDetailProductFragment : Fragment() {

    private var _binding: FragmentShowDetailProductBinding? = null
    private var changeQuantity = 1
    private var item = Store.getStoreItem()
    private var currentItem: Product? = null

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

        item.forEach {
            initialSetup(it)
            changeQuantityAddToCart(it)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initialSetup(product: Product) {
        currentItem = product
        binding.DescriptionText.text = product.description
        binding.titleText.text = product.name
        binding.priceText.text = product.price.toString()
    }

    private fun changeQuantityAddToCart(product: Product) {
        if (changeQuantity <= 1) {

            binding.quantityDecrement.setOnClickListener {
                changeQuantity--

                binding.quantityText.text = changeQuantity.toString()
            }
        }
        if (changeQuantity >= 2) {
            binding.quantityIncrement.setOnClickListener {
                changeQuantity++
                binding.quantityText.text = changeQuantity.toString()
            }
        }
        Cart.changeQuantity(product.ID, changeQuantity)

        binding.addToCart.setOnClickListener {
            Toast.makeText(requireContext(), "Added to cart ", Toast.LENGTH_SHORT).show()
            Cart.addCart(product, changeQuantity)
        }

    }

}