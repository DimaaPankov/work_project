package rirf.irjewf.jgeigbuhbd.ijrghirtuhbju

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import rirf.irjewf.jgeigbuhbd.R
import rirf.irjewf.jgeigbuhbd.databinding.FragmentStartBinding
import rirf.irjewf.jgeigbuhbd.erbuvjhbhebhbv



class j4efur3fyh : Fragment(){
lateinit var binding: FragmentStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        object : CountDownTimer(3000, 2000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                erbuvjhbhebhbv.deuhwe.navigate(R.id.action_startFragment_to_qestionFragment)
            }
        }.start()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(layoutInflater)

        Handler(Looper.getMainLooper()).postDelayed({},500)
        val animator1 = ObjectAnimator.ofFloat(binding.imageView, View.SCALE_X, 0.5F)
        animator1.duration = 1500
        animator1.start()

        val animator2 = ObjectAnimator.ofFloat(binding.imageView, View.SCALE_Y, 0.5F)
        animator2.duration = 1500
        animator2.start()

        val animator3 = ObjectAnimator.ofFloat(binding.imageView, View.Y, 500F)
        animator3.duration = 1500
        animator3.start()

        val animator4 = ObjectAnimator.ofFloat(binding.imageView, View.Y, 700F)
        animator4.duration = 0
        animator4.start()

        val animator6 = ObjectAnimator.ofFloat(binding.imageView, View.ROTATION_X, 1080F)
        animator6.duration = 1500
        animator6.start()

        val animator5 = ObjectAnimator.ofFloat(binding.TVLogo, View.ALPHA, 1F)
        animator5.duration = 1500
        animator5.start()

        return binding.root


    }




}