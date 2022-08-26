package com.example

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.example.databinding.FragmentAnimationVinBinding

class reiuqjvhoirFragment : Fragment(),
    cjeijcdckkkk {


    val uwjvcnvwnvw = ejdvciowjeicjcncncncncncn()
    private val oewjfcopjwev: reiuqjvhoirFragmentArgs by navArgs()
    lateinit var ejwpfvcjwepvpewkf: FragmentAnimationVinBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        ejwpfvcjwepvpewkf = FragmentAnimationVinBinding.inflate(layoutInflater)
        uwjvcnvwnvw.init(this)

    }


    override fun ioejfciewjf() {
        val listSlots = oewjfcopjwev.arraySlots
        ejwpfvcjwepvpewkf.domTVslot1.text = listSlots[0]
        ejwpfvcjwepvpewkf.domTVslot2.text = listSlots[1]
        ejwpfvcjwepvpewkf.domTVslot3.text = listSlots[2]
        ejwpfvcjwepvpewkf.domTVslot4.text = listSlots[3]
        ejwpfvcjwepvpewkf.domTVslot5.text = listSlots[4]
        ejwpfvcjwepvpewkf.domTVslot6.text = listSlots[5]
        ejwpfvcjwepvpewkf.domTVslot7.text = listSlots[6]
        ejwpfvcjwepvpewkf.domTVslot8.text = listSlots[7]
        ejwpfvcjwepvpewkf.domTVslot9.text = listSlots[8]
        ejwpfvcjwepvpewkf.domTVxxx.text = oewjfcopjwev.xBet.toString() + "X BET "
        ejwpfvcjwepvpewkf.dombetCount.text = oewjfcopjwev.win.toString()
    }

    override fun wiodvchjiwoedfhvciojwdiosvcjiwoerdjvciodwsjivokchjdisokvjhiofdsjviedsjvicerjdvs() {
        if (oewjfcopjwev.winLine[0]) {
            uwjvcnvwnvw.eowjciojcccc(
                ejwpfvcjwepvpewkf.domTVslot1,
                ejwpfvcjwepvpewkf.domTVslot11,
                ejwpfvcjwepvpewkf.domTVslot2,
                ejwpfvcjwepvpewkf.domTVslot22,
                ejwpfvcjwepvpewkf.domTVslot3,
                ejwpfvcjwepvpewkf.domTVslot33,
                ejwpfvcjwepvpewkf.domVTopHorisontal,
                ejwpfvcjwepvpewkf.dombetCount,
                ejwpfvcjwepvpewkf.dombetCountSmile,
                ejwpfvcjwepvpewkf.domTVvin,
                ejwpfvcjwepvpewkf.domTVxxx
            )
        }
        if (oewjfcopjwev.winLine[1]) {
            uwjvcnvwnvw.eowjciojcccc(
                ejwpfvcjwepvpewkf.domTVslot4, ejwpfvcjwepvpewkf.domTVslot44, ejwpfvcjwepvpewkf.domTVslot5,
                ejwpfvcjwepvpewkf.domTVslot55, ejwpfvcjwepvpewkf.domTVslot6, ejwpfvcjwepvpewkf.domTVslot66, ejwpfvcjwepvpewkf.domVCenterHorisontal,
                ejwpfvcjwepvpewkf.dombetCount, ejwpfvcjwepvpewkf.dombetCountSmile, ejwpfvcjwepvpewkf.domTVvin, ejwpfvcjwepvpewkf.domTVxxx
            )
        }
        if (oewjfcopjwev.winLine[2]) {
            uwjvcnvwnvw.eowjciojcccc(
                ejwpfvcjwepvpewkf.domTVslot7, ejwpfvcjwepvpewkf.domTVslot77, ejwpfvcjwepvpewkf.domTVslot8,
                ejwpfvcjwepvpewkf.domTVslot88, ejwpfvcjwepvpewkf.domTVslot9, ejwpfvcjwepvpewkf.domTVslot99, ejwpfvcjwepvpewkf.domVBottomHorisontal,
                ejwpfvcjwepvpewkf.dombetCount, ejwpfvcjwepvpewkf.dombetCountSmile, ejwpfvcjwepvpewkf.domTVvin, ejwpfvcjwepvpewkf.domTVxxx
            )
        }


        Handler(Looper.getMainLooper()).postDelayed({
            (requireActivity() as MainActivity).navController.navigate(
                R.id.action_animationVinFragment_to_gameFragment
            )
        }, 7000L)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ejwpfvcjwepvpewkf.root
    }

}



class ejdvciowjeicjcncncncncncn () {

    private var ioewhvcwehcihcwhivwhuviherh: cjeijcdckkkk? = null
    fun init(_view: cjeijcdckkkk?) {
        ioewhvcwehcihcwhivwhuviherh = _view
        ioewhvcwehcihcwhivwhuviherh!!.ioejfciewjf()
        ioewhvcwehcihcwhivwhuviherh!!.wiodvchjiwoedfhvciojwdiosvcjiwoerdjvciodwsjivokchjdisokvjhiofdsjviedsjvicerjdvs()
    }

    fun eowjciojcccc(
        view1: TextView, view11: TextView, view2: TextView, view22: TextView,
        view3: TextView, view33: TextView, viewLine: View, betCount: TextView,
        betCountSmile: TextView, TVvin: TextView, TVxxx: TextView
    ) {


        ewicwhjchcw(view11, view1, betCount)
        ewicwhjchcw(view22, view2, betCount)
        ewicwhjchcw(view33, view3, betCount)
        wodjvciwdjijvdijd(viewLine, betCount, TVxxx)


    }

    private fun wodjvciwdjijvdijd(ejfciewjfcc: View, betCount: TextView, TVxxx: TextView) {
        var visibility = true
        var timer = 0L

        repeat(25) {
            timer = timer + 500

            Handler(Looper.getMainLooper()).postDelayed({
                if (visibility) {
                    ejfciewjfcc.visibility = View.VISIBLE
                    TVxxx.visibility = View.VISIBLE
                    visibility = false

                } else {
                    ejfciewjfcc.visibility = View.INVISIBLE
                    TVxxx.visibility = View.INVISIBLE
                    visibility = true
                }
            }, timer)

        }
    }

    private fun ejoiwcjwdicjcd(e9jcj: TextView, ewocj: TextView, ekjcjwcaaa: TextView) {
        var visibility = true
        var timer = 0L

        repeat(29) {
            timer = timer + 500

            Handler(Looper.getMainLooper()).postDelayed({
                if (visibility) {
                    //binding.betCountSmile
                    ewocj.visibility = View.VISIBLE
                    // binding.betCount
                    e9jcj.visibility = View.VISIBLE
                    // binding.TVvin
                    ekjcjwcaaa.visibility = View.VISIBLE

                    visibility = false
                } else {
                    //binding.betCountSmile
                    ewocj.visibility = View.INVISIBLE
                    //binding.betCount
                    e9jcj.visibility = View.INVISIBLE
                    //binding.TVvin
                    ekjcjwcaaa.visibility = View.INVISIBLE
                    visibility = true


                }
            }, timer)

        }
    }

    private fun ewicwhjchcw(
        ecjjc: TextView,
        ecjjh: TextView,
        jcejc: TextView
    ) {
        ejoiwcjwdicjcd(ecjjc, ecjjh, jcejc)
    }

}
    interface cjeijcdckkkk {
        fun ioejfciewjf()
        fun wiodvchjiwoedfhvciojwdiosvcjiwoerdjvciodwsjivokchjdisokvjhiofdsjviedsjvicerjdvs()
    }

