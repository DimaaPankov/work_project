package com.template.animationpresenter

import android.animation.ObjectAnimator
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView

class AnimationPresenter () {

    private var context: AnimationViewApi? = null
    fun init(_view: AnimationViewApi?){
        context = _view
        context!!.setData()
        context!!.startAnimation()
    }

     fun animationVin(view1: TextView, view11: TextView, view2: TextView, view22: TextView,
                             view3: TextView, view33: TextView, viewLine: View,betCount:TextView,
                             betCountSmile:TextView,TVvin:TextView,TVxxx:TextView){




        animationSlot(view11, view1,betCount,betCountSmile,TVvin)
        animationSlot(view22, view2,betCount,betCountSmile,TVvin)
        animationSlot(view33, view3,betCount,betCountSmile,TVvin)
        animationLine(viewLine,betCount,TVxxx)



    }

    private fun animationLine(viewLine:View,betCount:TextView,TVxxx: TextView){
        var visibility = true
        var timer = 0L

        //binding.betCount
      //  betCount.setTextColor(ContextCompat.getColor(requireContext(), R.color.red))

        repeat(25) {
            timer = timer + 500

            Handler(Looper.getMainLooper()).postDelayed({
                if (visibility) {
                    viewLine.visibility = View.VISIBLE
                    TVxxx.visibility = View.VISIBLE
                    visibility = false

                } else {
                    viewLine.visibility = View.INVISIBLE
                    TVxxx.visibility = View.INVISIBLE
                    visibility = true
                }
            }, timer)

        }
    }

   private fun animationSmile(betCount:TextView,betCountSmile:TextView,TVvin:TextView){
        var visibility = true
        var timer = 0L

//binding.betCount
       // betCount.setTextColor(ContextCompat.getColor(requireContext(), R.color.red))

        repeat(29) {
            timer = timer + 500

            Handler(Looper.getMainLooper()).postDelayed({
                if (visibility) {
                    //binding.betCountSmile
                    betCountSmile.visibility = View.VISIBLE
                    // binding.betCount
                    betCount.visibility = View.VISIBLE
                    // binding.TVvin
                    TVvin.visibility = View.VISIBLE

                    visibility = false
                } else {
                    //binding.betCountSmile
                    betCountSmile.visibility = View.INVISIBLE
                    //binding.betCount
                    betCount.visibility = View.INVISIBLE
                    //binding.TVvin
                    TVvin.visibility = View.INVISIBLE
                    visibility = true


                }
            }, timer)

        }
    }

    private fun animationSlot(view1: TextView, view2: TextView,betCount:TextView,betCountSmile:TextView,TVvin:TextView) {
        var timer = 0L


       animationSmile(betCount,betCountSmile,TVvin)

        val animator111 = ObjectAnimator.ofFloat(view2, View.SCALE_X, 0.7F)
        animator111.duration = 500
        animator111.start()
        val animator222 = ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.7F)
        animator222.duration = 500
        animator222.start()


        Handler(Looper.getMainLooper()).postDelayed({


            repeat(10){

                Handler(Looper.getMainLooper()).postDelayed({
                    view1.scaleY = 0.7F
                    val animator1 = ObjectAnimator.ofFloat(view2, View.SCALE_X, 0F)
                    animator1.duration = 100
                    animator1.start()
                }, timer)

                Handler(Looper.getMainLooper()).postDelayed({
                    val animator2 = ObjectAnimator.ofFloat(view1, View.SCALE_X, 0.7F)
                    animator2.duration = 100
                    animator2.start()
                }, timer+100)
                Handler(Looper.getMainLooper()).postDelayed({
                    val animator11 = ObjectAnimator.ofFloat(view1, View.SCALE_X, 0F)
                    animator11.duration = 100
                    animator11.start()
                }, timer+200)
                Handler(Looper.getMainLooper()).postDelayed({
                    val animator22 = ObjectAnimator.ofFloat(view2, View.SCALE_X, 0.7F)
                    animator22.duration = 100
                    animator22.start()
                }, timer+300)/**/
                timer+=400
            }
        },500)
    }




    fun distroy(){
        context = null

    }



}