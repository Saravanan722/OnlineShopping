package com.saravana.onlineshopping

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.saravana.onlineshopping.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

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
        binding.personButton.setOnClickListener {
            replaceFragment(SignUp())
        }
        binding.dehazeButton.setOnClickListener {
            replaceFragment(Login())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}