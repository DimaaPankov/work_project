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
import rirf.irjewf.jgeigbuhbd.databinding.FragmentResultBinding

import rirf.irjewf.jgeigbuhbd.erbuvjhbhebhbv
import rirf.irjewf.jgeigbuhbd.rebjvbhehrv
import rirf.irjewf.jgeigbuhbd.wevgkjbwvjubvkj



class ehrfhwrej : Fragment() {

    lateinit var binding: FragmentResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentResultBinding.inflate(layoutInflater)

        binding.tvTrue.text = "TRUE ${wevgkjbwvjubvkj}"
        binding.tvFalse.text = "FALSE ${rebjvbhehrv}"

        Handler(Looper.getMainLooper()).postDelayed({},500)
        val animator1 = ObjectAnimator.ofFloat(binding.imageView2 , View.SCALE_X, 0.5F)
        animator1.duration = 1500
        animator1.start()

        val animator2 = ObjectAnimator.ofFloat(binding.imageView2, View.SCALE_Y, 0.5F)
        animator2.duration = 1500
        animator2.start()

        val animator3 = ObjectAnimator.ofFloat(binding.imageView2, View.Y, 500F)
        animator3.duration = 1500
        animator3.start()

        val animator4 = ObjectAnimator.ofFloat(binding.imageView2, View.Y, 700F)
        animator4.duration = 0
        animator4.start()

        object : CountDownTimer(5000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                erbuvjhbhebhbv.deuhwe.navigate(R.id.action_resultFragment_to_qestionFragment)
                wevgkjbwvjubvkj = 0
                rebjvbhehrv = 0
            }
        }.start()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root



    }

}