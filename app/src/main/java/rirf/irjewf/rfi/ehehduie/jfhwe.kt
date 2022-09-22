package rirf.irjewf.rfi.ehehduie

import android.os.Bundle
import android.os.CountDownTimer

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import rirf.irjewf.rfi.R
import rirf.irjewf.rfi.databinding.FragmentQestionBinding
import rirf.irjewf.rfi.ehcuewcgyuw
import rirf.irjewf.rfi.falseAnswerSize
import rirf.irjewf.rfi.trueAnswerSize

import rirf.irjewf.rfi.edud2u8d.rejigfujerigjr

class qestionFragment : Fragment() {
    val binding by lazy{FragmentQestionBinding.inflate(layoutInflater)}
    lateinit var quizViewModel: rejigfujerigjr
    var actionFragment = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           setView()
        setClickListner()
    }

    private fun setClickListner(){
        binding.btnTrue.setOnClickListener {
            clickTrue()
        }

        binding.btnFalse.setOnClickListener {
            clickFalse()
        }

        binding.TVinfo.setOnClickListener {
             binding.CVinfo.isVisible = true
        }
        binding.Bok.setOnClickListener {
            binding.CVinfo.isVisible = false
        }
        binding.Bplay.setOnClickListener {
            binding.CLmain.isVisible = false
            binding.btnTrue.isVisible = true
            binding.btnFalse.isVisible = true
        }
    }

    private fun setView(){
        binding.CVinfo.isVisible = false
        binding.btnTrue.isVisible = false
        binding.btnFalse.isVisible = false

        quizViewModel = ViewModelProvider(this).get(rejigfujerigjr::class.java)
        binding.tvQestion.setText(quizViewModel.rhfurf().textResId)
        binding.imageQestion.setImageResource(quizViewModel.rhfurf().imageResId)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root


    }

    private fun clickTrue() {
        quizViewModel.rehfueryfhurh()
        binding.imageQestion.setImageResource(quizViewModel.rhfurf().imageResId)
        binding.tvQestion.setText(quizViewModel.rhfurf().textResId)

        if (quizViewModel.ujfireugireyu()) {
            trueAnswerSize++
            binding.imageQestion.isVisible = false
            binding.frameLayout.setBackgroundColor(resources.getColor(R.color.teal_200))
            binding.tvQestion.isVisible = false
            binding.background.setBackgroundColor(resources.getColor(R.color.teal_200))
            binding.btnTrue.isVisible = false
            binding.btnFalse.isVisible = false
            binding.textViewTRUE.isVisible = true

        } else {
        falseAnswerSize++
        binding.imageQestion.isVisible = false
        binding.frameLayout.setBackgroundColor(resources.getColor(R.color.red))
        binding.tvQestion.isVisible = false
        binding.background.setBackgroundColor(resources.getColor(R.color.red))
        binding.btnTrue.isVisible = false
        binding.btnFalse.isVisible = false
        binding.textViewFALSE.isVisible = true

    }

        wejhfifhewuewfhuhfweu(1000L)

}



    private fun clickFalse() {


        quizViewModel.rehfueryfhurh()

        binding.imageQestion.setImageResource(quizViewModel.rhfurf().imageResId)
        binding.tvQestion.setText(quizViewModel.rhfurf().textResId)

        if (!quizViewModel.ujfireugireyu()) {
           trueAnswerSize++
            binding.imageQestion.isVisible = false
            binding.frameLayout.setBackgroundColor(resources.getColor(R.color.teal_200))
            binding.tvQestion.isVisible =  false
            binding.background.setBackgroundColor(resources.getColor(R.color.teal_200))
            binding.btnTrue.isVisible = false
            binding.btnFalse.isVisible = false
            binding.textViewTRUE.isVisible = true
        } else {
            falseAnswerSize++
            binding.imageQestion.isVisible = false
            binding.frameLayout.setBackgroundColor(resources.getColor(R.color.red))
            binding.tvQestion.isVisible =  false
            binding.background.setBackgroundColor(resources.getColor(R.color.red))
            binding.btnTrue.isVisible = false
            binding.btnFalse.isVisible = false
            binding.textViewFALSE.isVisible = true


        }
      wejhfifhewuewfhuhfweu(1000L)

            }





    private fun wejhfifhewuewfhuhfweu(sec:Long ){

        object : CountDownTimer(sec, 1000) {
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {
                if(actionFragment) {
                    ehcuewcgyuw.deuhwe.navigate(R.id.action_qestionFragment_to_resultFragment)
                } else {
                    binding.imageQestion.isVisible = true
                    binding.frameLayout.setBackgroundColor(resources.getColor(R.color.black))
                    binding.tvQestion.isVisible = true
                    binding.background.setBackgroundColor(resources.getColor(R.color.black))
                    binding.btnTrue.isVisible = true
                    binding.btnFalse.isVisible = true
                    binding.textViewTRUE.isVisible = false
                    binding.textViewFALSE.isVisible = false
                }


                if(quizViewModel.efjdhfh == 11) {
                    actionFragment = true
                }



            }
        }.start()

        if(actionFragment){
            object : CountDownTimer(5000, 1000) {
                override fun onTick(millisUntilFinished: Long) {}

                override fun onFinish() {
                    ehcuewcgyuw.deuhwe.navigate(R.id.action_resultFragment_to_qestionFragment)
                   trueAnswerSize = 0
                   falseAnswerSize = 0
                }
            }.start()
        }

    }
    }
