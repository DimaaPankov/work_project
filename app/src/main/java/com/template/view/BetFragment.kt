package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.template.R
import com.template.jjsdjkg.kdhajf.dlhgjds
import com.template.jjsdjkg.kdhajf.kdhlgds
import com.template.databinding.FragmentBetBinding

class BetFragment : Fragment(), kdhlgds {

    lateinit var jdbajkg: FragmentBetBinding
    val jkdabgjmbsd = dlhgjds(dsjh)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        jdbajkg = FragmentBetBinding.inflate(layoutInflater)
        jkdabgjmbsd.init(this)
        (requireContext() as MainActivity).goBack = {findNavController().navigate(R.id.action_betFragment_to_gameFragment)}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return jdbajkg.root
    }

    override fun onDestroy() {
        super.onDestroy()
        jkdabgjmbsd.distroy()
    }
    override fun dlgjklsf() {
        jdbajkg.Button0.setOnClickListener {
            jkdabgjmbsd.dkghksdj()
            jdbajkg.Input.text = jkdabgjmbsd.doikjgsfldjg
        }

        jdbajkg.Button1.setOnClickListener {
            jkdabgjmbsd.hdkgjsfdlkg()
            jdbajkg.Input.text = jkdabgjmbsd.doikjgsfldjg
        }
        jdbajkg.Button2.setOnClickListener {
            jkdabgjmbsd.dkjgksdjgolsd()
            jdbajkg.Input.text = jkdabgjmbsd.doikjgsfldjg
        }
        jdbajkg.Button3.setOnClickListener {
            jkdabgjmbsd.dljgsdlj()
            jdbajkg.Input.text = jkdabgjmbsd.doikjgsfldjg
        }
        jdbajkg.Button4.setOnClickListener {
            jkdabgjmbsd.kjdsmhgjfsd()
            jdbajkg.Input.text = jkdabgjmbsd.doikjgsfldjg
        }
        jdbajkg.Button5.setOnClickListener {
            jkdabgjmbsd.jdsghjshdgjhg()
            jdbajkg.Input.text = jkdabgjmbsd.doikjgsfldjg
        }
        jdbajkg.Button6.setOnClickListener {
            jkdabgjmbsd.gdggfsjhdgf()
            jdbajkg.Input.text = jkdabgjmbsd.doikjgsfldjg
        }
        jdbajkg.Button7.setOnClickListener {
            jkdabgjmbsd.jdgkfsjdhgjsk()
            jdbajkg.Input.text = jkdabgjmbsd.doikjgsfldjg
        }
        jdbajkg.Button8.setOnClickListener {
            jkdabgjmbsd.djoghusdjh()
            jdbajkg.Input.text = jkdabgjmbsd.doikjgsfldjg
        }
        jdbajkg.Button9.setOnClickListener {
            jkdabgjmbsd.djghjsdhjgd()
            jdbajkg.Input.text = jkdabgjmbsd.doikjgsfldjg
        }
        jdbajkg.ButtonEquals.setOnClickListener {
            jkdabgjmbsd.dolghoslkdgjs()
            (requireActivity() as MainActivity).navController.navigate(R.id.action_betFragment_to_gameFragment)
        }
    }}