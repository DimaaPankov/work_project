package com.wvhhvwaaaaa.fuevhgefui

import android.animation.ObjectAnimator
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class FjjscsPresenter () {

    private var ewjguv: eivghwerivhj? = null
    fun init(qfjq: eivghwerivhj?){
        ewjguv = qfjq
        ewjguv!!.wgjj()
        ewjguv!!.whgwhr()
    }

     fun gvidsjv(ejf: ImageView, ehf: TextView, wejgeih: ImageView, eufggue: TextView,
                 qwfjg: ImageView, gigeuujg: TextView, viewLine: View, betCount:TextView,
                 betCountSmile:TextView, TVvin:TextView, TVxxx:TextView){




        wgvijubv(ehf, ejf,betCount,betCountSmile,TVvin)
        wgvijubv(eufggue, wejgeih,betCount,betCountSmile,TVvin)
        wgvijubv(gigeuujg, qwfjg,betCount,betCountSmile,TVvin)
        qgju8weguueg(viewLine,betCount,TVxxx)



    }

    private fun qgju8weguueg(viewLine:View, betCount:TextView, TVxxx: TextView){
        var qfgiwgu = true
        var wguguei = 0L


        repeat(25) {
            wguguei = wguguei + 500

            Handler(Looper.getMainLooper()).postDelayed({
                if (qfgiwgu) {
                    viewLine.visibility = View.VISIBLE
                    TVxxx.visibility = View.VISIBLE
                    qfgiwgu = false

                } else {
                    viewLine.visibility = View.INVISIBLE
                    TVxxx.visibility = View.INVISIBLE
                    qfgiwgu = true
                }
            }, wguguei)

        }
    }

   private fun weig9ewug(agbibv:TextView, ewigejg:TextView, TVvin:TextView){
        var visibility = true
        var timer = 0L

        repeat(29) {
            timer = timer + 500

            Handler(Looper.getMainLooper()).postDelayed({
                if (visibility) {
                    //binding.betCountSmile
                    ewigejg.visibility = View.VISIBLE
                    // binding.betCount
                    agbibv.visibility = View.VISIBLE
                    // binding.TVvin
                    TVvin.visibility = View.VISIBLE

                    visibility = false
                } else {
                    //binding.betCountSmile
                    ewigejg.visibility = View.INVISIBLE
                    //binding.betCount
                    agbibv.visibility = View.INVISIBLE
                    //binding.TVvin
                    TVvin.visibility = View.INVISIBLE
                    visibility = true


                }
            }, timer)

        }
    }

    private fun wgvijubv(view1: TextView, view2: ImageView, betCount:TextView, betCountSmile:TextView, TVvin:TextView) {
        var timer = 0L


       weig9ewug(betCount,betCountSmile,TVvin)

        val gjebj = ObjectAnimator.ofFloat(view2, View.SCALE_X, 0.7F)
        gjebj.duration = 500
        gjebj.start()
        val wbjhw = ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.7F)
        wbjhw.duration = 500
        wbjhw.start()


        Handler(Looper.getMainLooper()).postDelayed({


            repeat(10){

                Handler(Looper.getMainLooper()).postDelayed({
                    view1.scaleY = 0.7F
                    val animator1 = ObjectAnimator.ofFloat(view2, View.SCALE_X, 0F)
                    animator1.duration = 100
                    animator1.start()
                }, timer)

                Handler(Looper.getMainLooper()).postDelayed({
                    val sbjihsdfbokj = ObjectAnimator.ofFloat(view1, View.SCALE_X, 0.7F)
                    sbjihsdfbokj.duration = 100
                    sbjihsdfbokj.start()
                }, timer+100)
                Handler(Looper.getMainLooper()).postDelayed({
                    val weigbrei0yb = ObjectAnimator.ofFloat(view1, View.SCALE_X, 0F)
                    weigbrei0yb.duration = 100
                    weigbrei0yb.start()
                }, timer+200)
                Handler(Looper.getMainLooper()).postDelayed({
                    val qweguw8b = ObjectAnimator.ofFloat(view2, View.SCALE_X, 0.7F)
                    qweguw8b.duration = 100
                    qweguw8b.start()
                }, timer+300)/**/
                timer+=400
            }
        },500)
    }




    fun distroy(){
        ewjguv = null

    }



}