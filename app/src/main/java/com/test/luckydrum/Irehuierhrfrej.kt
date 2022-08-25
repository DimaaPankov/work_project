package com.test.luckydrum

import android.animation.ObjectAnimator
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView

enum class IndexFargment{
    FRAGMENT,FRAGMENT4X4,FRAGMENT6X6
}

class Gewihf(val indexFargment: IndexFargment) {
    private var firstStap = true
    private var clickSlot: TextView? = null
    private var clickSlot2: TextView? = null
    private var fieldSize2 = 0
    private var _context: Context? = null

    fun init(context: Context){
    _context = context
    }

    fun distroy(){
        _context = null
    }

    fun erhfieeee(view1: TextView, view2: TextView, fieldSize: Int) {



            if (firstStap) {
                val animator = ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0F)
                animator.duration = 100
                animator.start()
                Handler(Looper.getMainLooper()).postDelayed({
                    val animatorPost = ObjectAnimator.ofFloat(view1, View.SCALE_Y, 1F)
                    animator.duration = 100
                    animatorPost.start()
                }, 100)
                //здесь мы  нажатие
                clickSlot = view1
                clickSlot2 = view2
                firstStap = false
            } else {
                //openCard
                val animator = ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0F)
                animator.duration = 100
                animator.start()
                Handler(Looper.getMainLooper()).postDelayed({
                    val animatorPost = ObjectAnimator.ofFloat(view1, View.SCALE_Y, 1F)
                    animator.duration = 100
                    animatorPost.start()

                }, 100)

                //closeCards
                if (view1.text == clickSlot?.text) {

                    Handler(Looper.getMainLooper()).postDelayed({
                        val animator1 =
                            ObjectAnimator.ofFloat(clickSlot, View.ALPHA, 0F)
                        animator1.duration = 200
                        animator1.start()
                        val animator2 =
                            ObjectAnimator.ofFloat(clickSlot2, View.ALPHA, 0F)
                        animator2.duration = 200
                        animator2.start()

                        val animator3 =
                            ObjectAnimator.ofFloat(view1, View.ALPHA, 0F)
                        animator3.duration = 200
                        animator3.start()
                        val animator4 =
                            ObjectAnimator.ofFloat(view2, View.ALPHA, 0F)
                        animator4.duration = 200
                        animator4.start()
                        fieldSize2++
                        if (fieldSize2 == fieldSize) {
                            when(indexFargment) {
                             IndexFargment.FRAGMENT ->   (_context as MainActivity).navController.navigate(R.id.action_gameFragment_to_finishFragment)
                             IndexFargment.FRAGMENT4X4 ->   (_context as MainActivity).navController.navigate(R.id.action_gameFragment4x4_to_finishFragment)
                             IndexFargment.FRAGMENT6X6 ->   (_context as MainActivity).navController.navigate(R.id.action_gameFragment6x6_to_finishFragment)
                            }
                            fieldSize2 = 0
                            indexGo = 2
                        }
                    }, 500)
                } else {
                    Handler(Looper.getMainLooper()).postDelayed({
                        val animator = ObjectAnimator.ofFloat(clickSlot, View.SCALE_Y, 0F)
                        animator.duration = 100
                        animator.start()

                        Handler(Looper.getMainLooper()).postDelayed({
                            val animator =
                                ObjectAnimator.ofFloat(clickSlot2, View.SCALE_Y, 1F)
                            animator.duration = 100
                            animator.start()
                        }, 100)

                        val animator2 = ObjectAnimator.ofFloat(view1, View.SCALE_Y, 0F)
                        animator2.duration = 100
                        animator2.start()

                        Handler(Looper.getMainLooper()).postDelayed({
                            val animator2 =
                                ObjectAnimator.ofFloat(view2, View.SCALE_Y, 1F)
                            animator2.duration = 100
                            animator2.start()
                        }, 100)

                    }, 500)
                }
                firstStap = true

        }


    }

}