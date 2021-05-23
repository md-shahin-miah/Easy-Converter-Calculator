package com.okcodex.easyconverters

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.okcodex.easyconverters.common.openFeedbackActivity
import com.okcodex.easyconverters.common.openPlayStoreActivity
import com.okcodex.easyconverters.common.openPrivacyActivity
import com.okcodex.easyconverters.common.openRateAppActivity

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var navView: NavigationView
    private lateinit var drawerLayout: DrawerLayout

//dev_shahin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

         drawerLayout = findViewById(R.id.drawer_layout)
         navView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.nav_)
        navView.setNavigationItemSelectedListener(this)
        navView.itemIconTintList = null

        appBarConfiguration = AppBarConfiguration(setOf(
           R.id.nav_calculator, R.id.nav_tools,R.id.nav_converter), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
      //  navView.setupWithNavController(navController)

        bottomNavigationView.setupWithNavController(navController)


        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()



    }



    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_feedback -> {
                openFeedbackActivity()
            }
            R.id.nav_moreapps -> {
                openPlayStoreActivity()
            }
            R.id.nav_rateApp -> {
                openRateAppActivity()
            }
            R.id.nav_privacy -> {
                openPrivacyActivity()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}

