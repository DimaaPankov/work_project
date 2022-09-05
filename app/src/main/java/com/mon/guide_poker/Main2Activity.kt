package com.mon.guide_poker
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.isVisible
import androidx.navigation.NavController
import com.mon.guide_poker.databinding.ActivityMain2Binding


class Main2Activity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var rhig: ActivityMain2Binding
    lateinit var rjrvjwefcw:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rhig = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(rhig.root)

        rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
        rhig.appBarMain2.toolbar.isVisible = false


        Handler(Looper.getMainLooper()).postDelayed({
            rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            rhig.appBarMain2.toolbar.isVisible = true
        },4000)

        setSupportActionBar(rhig.appBarMain2.toolbar)

        val drawerLayout: DrawerLayout = rhig.drawerLayout
        val navView: NavigationView = rhig.navView

         rjrvjwefcw = findNavController(R.id.nav_host_fragment_content_main2)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_slideshow
            ), drawerLayout
        )

        setupActionBarWithNavController(rjrvjwefcw, appBarConfiguration)
        navView.setupWithNavController(rjrvjwefcw)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.I_article -> {
                    efjciwehf = 0
                    rjrvjwefcw.navigate(R.id.action_nav_home_to_nav_slideshow)
                    rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                    rhig.appBarMain2.toolbar.isVisible = false
                }
                R.id.II_article -> {
                    efjciwehf = 1
                    rjrvjwefcw.navigate(R.id.action_nav_home_to_nav_slideshow)
                    rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                    rhig.appBarMain2.toolbar.isVisible = false
                }
                R.id.III_article -> {
                    efjciwehf = 2
                    rjrvjwefcw.navigate(R.id.action_nav_home_to_nav_slideshow)
                    rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                    rhig.appBarMain2.toolbar.isVisible = false
                }
                R.id.IV_article -> {
                    efjciwehf = 3
                    rjrvjwefcw.navigate(R.id.action_nav_home_to_nav_slideshow)
                    rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                    rhig.appBarMain2.toolbar.isVisible = false

                }
                R.id.V_article -> {
                    efjciwehf = 4
                    rjrvjwefcw.navigate(R.id.action_nav_home_to_nav_slideshow)
                    rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                    rhig.appBarMain2.toolbar.isVisible = false
                }
                R.id.VI_article -> {
                   this.finish()
                }
}
            true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main2, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main2)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
    override fun onBackPressed(){
        super.onBackPressed()

            rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
            rhig.appBarMain2.toolbar.isVisible = true
       }
    }
