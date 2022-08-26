package rirf.irjewf.rfi.ehehduie

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import rirf.irjewf.rfi.ehcuewcgyuw
import ru.skillbranch.testnaeblana.R
import ru.skillbranch.testnaeblana.databinding.FragmentStartBinding


class j4efur3fyh : Fragment(){
lateinit var binding:FragmentStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        object : CountDownTimer(4000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                ehcuewcgyuw.deuhwe.navigate(R.id.action_startFragment_to_qestionFragment)
            }
        }.start()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(layoutInflater)
        return binding.root


    }




}