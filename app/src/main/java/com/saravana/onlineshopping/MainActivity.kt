package com.saravana.onlineshopping

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.saravana.onlineshopping.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //  private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val navController = findNavController(R.id.nav_host_fragment_content_main)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)

        //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//        binding.textView3.setOnClickListener {
//
//            val intent = Intent(this@MainActivity, CartFragment::class.java)
//            startActivity(intent)
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.fragment_container_view, CartFragment())
//                .commit()

//        supportFragmentManager.beginTransaction()
//            .replace(R.id.fragment_container_view,StoreFragment())
//            .commit()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        return when (item.itemId) {
//            R.id.action_settings -> true
//            else -> super.onOptionsItemSelected(item)
//        }
//    }

}