package rirf.irjewf.rfi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import rirf.irjewf.rfi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var huercvy: ActivityMainBinding
    lateinit var deuhwe: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        huercvy = ActivityMainBinding.inflate(layoutInflater)
        setContentView(huercvy.root)
        ehcuewcgyuw = this
        deuhwe = Navigation.findNavController(this, R.id.nav_host_fragment)

    }

    var goBack = {}

    override fun onBackPressed() {
        goBack()
    }
    }