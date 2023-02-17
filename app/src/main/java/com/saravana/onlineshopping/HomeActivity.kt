package com.saravana.onlineshopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.saravana.onlineshopping.databinding.ActivityHomeBinding
import com.saravana.onlineshopping.databinding.ActivityMainBinding
import com.saravana.onlineshoppingcore.Admin
import com.saravana.onlineshoppingcore.Cart

class HomeActivity : AppCompatActivity() {

    private val cart = Cart()

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeButton.setOnClickListener {
            replaceFragment(StoreFragment())
        }
        binding.cartButton.setOnClickListener {
            replaceFragment(CartFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}