package com.saravana.onlineshopping

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import com.saravana.onlineshopping.databinding.ActivityMainBinding
import com.saravana.onlineshoppingcore.Admin

class MainActivity : AppCompatActivity() {
    private val admin = Admin()
    private lateinit var binding: ActivityMainBinding


    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startButton.setOnClickListener {
            val intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)
        }
     //   actionBar()

        admin.addStore()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> Toast.makeText(this, "About Selected", Toast.LENGTH_SHORT).show()
            R.id.settings -> Toast.makeText(this, "Settings Selected", Toast.LENGTH_SHORT)
                .show()
            R.id.exit -> Toast.makeText(this, "Exit Selected", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }


    fun actionBar() {
        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()
        Handler().postDelayed({
            val intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }

}