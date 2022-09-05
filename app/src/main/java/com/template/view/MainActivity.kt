package com.template.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.template.R

class MainActivity : AppCompatActivity() {

    lateinit var navController:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
    }
}
/*                        CLASS

class BetFragment : Fragment(), BetViewApi {

    lateinit var binding:FragmentBentBinding
    val presnter = BetPresnter(Model)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentBentBinding.inflate(layoutInflater)
        presnter.init(this)
        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return binding.root
        }

    override fun onDestroy() {
        super.onDestroy()
        presnter.distroy()
    }
    override fun clickListner() {
        binding.Button0.setOnClickListener {
            presnter.click0()
            }

        binding.Button1.setOnClickListener {
        presnter.click1()
        }
        binding.Button2.setOnClickListener {
        presnter.click2()
        }
        binding.Button3.setOnClickListener {
            presnter.click3()
        }
        binding.Button4.setOnClickListener {
            presnter.click4()
        }
        binding.Button5.setOnClickListener {
            presnter.click5()
        }
        binding.Button6.setOnClickListener {
            presnter.click6()
        }
        binding.Button7.setOnClickListener {
            presnter.click7()
        }
        binding.Button8.setOnClickListener {
            presnter.click8()
        }
        binding.Button9.setOnClickListener {
            presnter.click9()
        }
        binding.ButtonEquals.setOnClickListener {
            presnter.clickEquels()
            (requireActivity() as MainActivity).navController.navigate(R.id.action_bentFragment_to_gameFragment)

    }
}}

                                               ACTIVITY


<androidx.appcompat.widget.LinearLayoutCompat xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_marginEnd="5dp"

    android:layout_marginBottom="5dp"
    android:orientation="vertical"
    tools:context=".view.BetFragment">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:background="#252525"
        android:gravity="bottom"
        android:orientation="vertical"
        android:padding="30dp">

        <TextView
            android:id="@+id/iconText"
            android:layout_width="358dp"
            android:layout_height="wrap_content"
            android:layout_marginBottom="50dp"
            android:gravity="center"
            android:text="BET"
            android:textColor="#CDDC39"
            android:textSize="50sp"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/Input"
            android:layout_width="358dp"
            android:layout_height="wrap_content"
            android:layout_marginBottom="50dp"
            android:text="0"
            android:textColor="#CDDC39"
            android:textSize="50sp"
            android:textStyle="bold" />

    </LinearLayout>

    <TableLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#252525"
        android:stretchColumns="*">


        <TableRow>

            <androidx.appcompat.widget.AppCompatButton
                android:id="@+id/Button_1"
                android:layout_width="wrap_content"
                android:layout_height="90dp"
                android:backgroundTint="#CDDC39"
                android:text="1"
                android:textSize="20sp" />

            <androidx.appcompat.widget.AppCompatButton
                android:id="@+id/Button_2"
                android:layout_width="wrap_content"
                android:layout_height="90dp"
                android:backgroundTint="#CDDC39"
                android:text="2"
                android:textSize="20sp" />

            <androidx.appcompat.widget.AppCompatButton
                android:id="@+id/Button_3"
                android:layout_width="wrap_content"
                android:layout_height="90dp"
                android:backgroundTint="#CDDC39"
                android:text="3"
                android:textSize="20sp" />


        </TableRow>

        <TableRow>

            <androidx.appcompat.widget.AppCompatButton
                android:id="@+id/Button_4"
                android:layout_width="wrap_content"
                android:layout_height="90dp"
                android:backgroundTint="#CDDC39"
                android:text="4"
                android:textSize="20sp" />

            <androidx.appcompat.widget.AppCompatButton
                android:id="@+id/Button_5"
                android:layout_width="wrap_content"
                android:layout_height="90dp"
                android:backgroundTint="#CDDC39"
                android:text="5"
                android:textSize="20sp" />

            <androidx.appcompat.widget.AppCompatButton
                android:id="@+id/Button_6"
                android:layout_width="wrap_content"
                android:layout_height="90dp"
                android:backgroundTint="#CDDC39"
                android:text="6"
                android:textSize="20sp" />


        </TableRow>

        <TableRow>

            <androidx.appcompat.widget.AppCompatButton
                android:id="@+id/Button_7"
                android:layout_width="wrap_content"
                android:layout_height="90dp"
                android:backgroundTint="#CDDC39"
                android:text="7"
                android:textSize="20sp" />

            <androidx.appcompat.widget.AppCompatButton
                android:id="@+id/Button_8"
                android:layout_width="wrap_content"
                android:layout_height="90dp"
                android:backgroundTint="#CDDC39"
                android:text="8"
                android:textSize="20sp" />

            <androidx.appcompat.widget.AppCompatButton
                android:id="@+id/Button_9"
                android:layout_width="wrap_content"
                android:layout_height="90dp"
                android:backgroundTint="#CDDC39"
                android:text="9"
                android:textSize="20sp" />


        </TableRow>

        <TableRow>


            <androidx.appcompat.widget.AppCompatButton
                android:id="@+id/Button_0"
                android:layout_width="0dp"
                android:layout_height="90dp"
                android:layout_weight="2"
                android:backgroundTint="#CDDC39"
                android:text="0"
                android:textSize="20sp" />


            <androidx.appcompat.widget.AppCompatButton
                android:id="@+id/Button_equals"
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_marginEnd="5dp"
                android:layout_marginBottom="5dp"
                android:layout_marginStart="5dp"
                android:layout_weight="1"
                android:background="@color/teal_200"
                android:text="bet"
                android:textColor="#546E7A"
                android:textSize="20sp" />

        </TableRow>
    </TableLayout>


 */