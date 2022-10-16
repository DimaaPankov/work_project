package com.template.view

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible

import com.template.sfjhsf
import com.template.R
import com.template.databinding.FragmentGameBinding
import com.template.presenter.gamepresenter.ejhdsgfd
import com.template.presenter.gamepresenter.jdjlghd


class ishfidogj : Fragment(), jdjlghd {
    var ujsfh = 0
    var ioksjff = 0
    var sfk = true

    val sfkusif = ejhdsgfd(sdngklds)
    val fsosfgj by lazy { FragmentGameBinding.inflate(layoutInflater) }
    private var iodsjgd:Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireContext() as MainActivity).iokhf = {exitAppPlusToast()}

        sfkusif.eklfk(this)
        fsosfgj.CVone.alpha = 0F
        fsosfgj.CVthree.alpha = 0F
        fsosfgj.Bblue.alpha = 0F
        fsosfgj.Bred.alpha = 0F
        fsosfgj.CVtwo.alpha = 0F
       fsosfgj.TVbalans.text = jmdgjd(requireContext()).klhf().toString()

        ioksjff = sfjhsf.getRamdomBonus()
        fsosfgj.IVbonus.setImageResource(ioksjff)

        fsosfgj.Bblue.setOnClickListener {
            clickBonus()
            ujsfh = R.drawable.lil_1
        }

        fsosfgj.Bred.setOnClickListener {
            clickBonus()
            ujsfh =  R.drawable.lil_2
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return fsosfgj.root

    }

    override fun onDestroy() {
        super.onDestroy()
        sfkusif.shlflsfldks()
    }



    override fun iod() {
        fsosfgj.TVinfo.setOnClickListener {
            (requireActivity() as MainActivity).iokfh.navigate(R.id.action_gameFragment_to_infoFragment)
        }
    }

    override fun ksfjpsgsg() {

        fsosfgj.Bspin.setOnClickListener {
         //   presenter.setSlots()
            fsosfgj.Bspin.isClickable = false
            fsosfgj.Vline1.isVisible = false
            fsosfgj.Vline2.isVisible = false
            fsosfgj.Vline3.isVisible = false


            if ((sfkusif.oklsfjhsflhsfk() >= sfkusif.ofsjsfhklfj())
                ) {
                    val heidht = fsosfgj.TVslot1.height.toFloat()
                    val heidhtConteiner = fsosfgj.constraintLayout .height.toFloat()

                    sfkusif.sahfjdfhdkj(
                        fsosfgj.TVslot52q,
                        fsosfgj.TVslot55q,
                        fsosfgj.TVslot58q,
                        fsosfgj.TVslot1,
                        fsosfgj.TVslot4,
                        fsosfgj.TVslot7,
                        fsosfgj.LLline1,
                        sfkusif.fhgdfh,
                        sfkusif.dfds,
                        sfkusif.dfdfffg,
                        heidht,
                        heidhtConteiner,
                0)

                    sfkusif.sahfjdfhdkj(
                        fsosfgj.TVslot53q,
                        fsosfgj.TVslot56q,
                        fsosfgj.TVslot59q,
                        fsosfgj.TVslot2,
                        fsosfgj.TVslot5,
                        fsosfgj.TVslot8,
                        fsosfgj.LLline2,
                        sfkusif.dfdggdsds,
                        sfkusif.dfdsgd,
                        sfkusif.ffdhghdff,
                        heidht,
                        heidhtConteiner,1000)

                    sfkusif.sahfjdfhdkj(
                        fsosfgj.TVslot54q,
                        fsosfgj.TVslot57q,
                        fsosfgj.TVslot60q,
                        fsosfgj.TVslot3,
                        fsosfgj.TVslot6,
                        fsosfgj.TVslot9,
                        fsosfgj.LLline3,
                        sfkusif.fasfa,
                        sfkusif.asfas,
                        sfkusif.dgfdggjjjjl,
                        heidht,
                        heidhtConteiner,2000)

            sfkusif.sjofhjfs(sfkusif.ofsjsfhklfj(), false)
            fsosfgj.TVbalans.text = sfkusif.oklsfjhsflhsfk().toString()

            sfkusif.sjkgfjkhsf( fsosfgj.TVslot1, fsosfgj.TVslot2, fsosfgj.TVslot3,fsosfgj.betCount,
                                     fsosfgj.betCountSmile,fsosfgj.TVvin,fsosfgj.TVxxx,fsosfgj.Vline1,
                                      fsosfgj.CVresult,fsosfgj.TVbalans,1,{
                    fsosfgj.CVone.isClickable = true
                    fsosfgj.CVthree.isClickable = true
                    fsosfgj.Bblue.isClickable = true
                    fsosfgj.Bred.isClickable = true
                    val animator1 = ObjectAnimator.ofFloat(fsosfgj.CVone, View.ALPHA, 1F)
                    animator1.duration = 500
                    animator1.start()
                    val animator2 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.ALPHA, 1F)
                    animator2.duration = 500
                    animator2.start()
                    val animator3 = ObjectAnimator.ofFloat(fsosfgj.Bblue, View.ALPHA, 1F)
                    animator3.duration = 500
                    animator3.start()
                    val animator4 = ObjectAnimator.ofFloat(fsosfgj.Bred, View.ALPHA, 1F)
                    animator4.duration = 500
                    animator4.start()                })

            sfkusif.sjkgfjkhsf( fsosfgj.TVslot4, fsosfgj.TVslot5, fsosfgj.TVslot6,fsosfgj.betCount,
                        fsosfgj.betCountSmile,fsosfgj.TVvin,fsosfgj.TVxxx,fsosfgj.Vline2,
                        fsosfgj.CVresult,fsosfgj.TVbalans,2,{
                    fsosfgj.CVone.isClickable = true
                    fsosfgj.CVthree.isClickable = true
                    fsosfgj.Bblue.isClickable = true
                    fsosfgj.Bred.isClickable = true
                    val animator1 = ObjectAnimator.ofFloat(fsosfgj.CVone, View.ALPHA, 1F)
                    animator1.duration = 500
                    animator1.start()
                    val animator2 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.ALPHA, 1F)
                    animator2.duration = 500
                    animator2.start()
                    val animator3 = ObjectAnimator.ofFloat(fsosfgj.Bblue, View.ALPHA, 1F)
                    animator3.duration = 500
                    animator3.start()
                    val animator4 = ObjectAnimator.ofFloat(fsosfgj.Bred, View.ALPHA, 1F)
                    animator4.duration = 500
                    animator4.start()})

            sfkusif.sjkgfjkhsf( fsosfgj.TVslot7, fsosfgj.TVslot8, fsosfgj.TVslot9,fsosfgj.betCount,
                        fsosfgj.betCountSmile,fsosfgj.TVvin,fsosfgj.TVxxx,fsosfgj.Vline3,
                        fsosfgj.CVresult,fsosfgj.TVbalans,3,{

                    fsosfgj.CVone.isClickable = true
                    fsosfgj.CVthree.isClickable = true
                    fsosfgj.Bblue.isClickable = true
                    fsosfgj.Bred.isClickable = true

                    val animator1 = ObjectAnimator.ofFloat(fsosfgj.CVone, View.ALPHA, 1F)
                    animator1.duration = 500
                    animator1.start()
                    val animator2 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.ALPHA, 1F)
                    animator2.duration = 500
                    animator2.start()
                    val animator3 = ObjectAnimator.ofFloat(fsosfgj.Bblue, View.ALPHA, 1F)
                    animator3.duration = 500
                    animator3.start()
                    val animator4 = ObjectAnimator.ofFloat(fsosfgj.Bred, View.ALPHA, 1F)
                    animator4.duration = 500
                    animator4.start()
                })



                } else {
                    (requireActivity() as MainActivity).iokfh.navigate(R.id
                        .action_gameFragment_to_newCoinsFragment)

                    sfkusif.tsrd = true
                }
            Handler(Looper.getMainLooper()).postDelayed({
                fsosfgj.Bspin.isClickable = true },5000)
            /*
            DataBasePreferences(requireContext()).setBalans(presenter.getMainCont()+
                    presenter.betCountXXX)*/
            sfkusif.yuhgfjsfhios(requireContext(),sfkusif.oklsfjhsflhsfk()+
                    sfkusif.sfdgf)
            sfkusif.shkflkjdk()
        }


    }

            override fun skhf() {
              //  binding.IVback.setOnClickListener {
              //      (requireActivity() as MainActivity).navController.navigate(R.id.action_gameFragment_to_mainFragment)
              //  }
            }

            override fun ikfhj() {
                fsosfgj.Bbet.setOnClickListener {
                    sfkusif.kjsfhjshfkl(0)//BET = 0
                    (requireActivity() as MainActivity).iokfh.navigate(R.id.action_gameFragment_to_betFragment)
                }
            }
            override fun khfs() {
                fsosfgj.TVbalans.text = sdngklds.dd().toString()
                fsosfgj.betCountMinus.text = sdngklds.hadkjfhds().toString()
                sfkusif.shkflkjdk()
                fsosfgj.TVslot1.setImageResource(sfkusif.dfdfffg)
                fsosfgj.TVslot2.setImageResource(sfkusif.ffdhghdff)
                fsosfgj.TVslot3.setImageResource(sfkusif.dgfdggjjjjl)
                fsosfgj.TVslot4.setImageResource(sfkusif.dfds)
                fsosfgj.TVslot5.setImageResource(sfkusif.dfdsgd)
                fsosfgj.TVslot6.setImageResource(sfkusif.asfas)
                fsosfgj.TVslot7.setImageResource(sfkusif.dfdfffg)
                fsosfgj.TVslot8.setImageResource(sfkusif.ffdhghdff)
                fsosfgj.TVslot9.setImageResource(sfkusif.dgfdggjjjjl)
                fsosfgj.TVslot10.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot11.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot12.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot13.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot14.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot15.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot16.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot17.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot18.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot19.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot20.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot21.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot22.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot23.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot24.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot25.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot26.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot27.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot28.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot29.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot30.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot31.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot32.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot33.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot34.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot35.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot36.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot37.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot38.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot39.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot40.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot41.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot42.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot43.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot44.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot45.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot46.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot47.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot48.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot49.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot50.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot52.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot53.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot54.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot55.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot55.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot56.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot57.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot58.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot59.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot1q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot2q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot3q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot4q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot5q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot6q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot7q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot8q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot9q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot10q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot11q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot12q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot13q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot14q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot15q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot16q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot17q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot18q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot19q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot20q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot21q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot22q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot23q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot24q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot25q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot26q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot27q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot28q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot29q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot30q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot31q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot32q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot33q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot34q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot35q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot36q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot37q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot38q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot39q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot40q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot41q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot42q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot43q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot44q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot45q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot46q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot47q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot48q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot49q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot50q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot51q.setImageResource(sdngklds.jksgfj.random())
                fsosfgj.TVslot52q.setImageResource(sfkusif.dfdfffg)
                fsosfgj.TVslot53q.setImageResource(sfkusif.ffdhghdff)
                fsosfgj.TVslot54q.setImageResource(sfkusif.dgfdggjjjjl)
                fsosfgj.TVslot55q.setImageResource(sfkusif.dfds)
                fsosfgj.TVslot56q.setImageResource(sfkusif.dfdsgd)
                fsosfgj.TVslot57q.setImageResource(sfkusif.asfas)
                fsosfgj.TVslot58q.setImageResource(sfkusif.dfdfffg)
                fsosfgj.TVslot59q.setImageResource(sfkusif.ffdhghdff)
                fsosfgj.TVslot60q.setImageResource(sfkusif.dgfdggjjjjl)
            }

    override fun fsfofi() {
        fsosfgj.Bok.setOnClickListener {
            fsosfgj.CVresult.alpha = 0F
            fsosfgj.CVresult.y = -600F
        }
    }
    private fun exitAppPlusToast(){  if (iodsjgd+2000 > System.currentTimeMillis()) {
        (requireContext() as MainActivity).onBackPressed()
    } else {
        Toast.makeText(requireContext(), "Press the back button twice to exit", Toast.LENGTH_SHORT).show()
    }
        iodsjgd = System.currentTimeMillis()
    }

    fun clickBonus() {

        ioksjff = sfjhsf.getRamdomBonus()
        fsosfgj.IVbonus.setImageResource(ioksjff)

        if (sfk) {
            fsosfgj.IVbonus.setImageResource(sfjhsf.getRamdomBonus())
            Handler(Looper.getMainLooper()).postDelayed({
                val animator1 = ObjectAnimator.ofFloat(fsosfgj.CVtwo, View.TRANSLATION_Y, -600F)
                animator1.duration = 1000
                animator1.start()

                val animator2 = ObjectAnimator.ofFloat(fsosfgj.CVtwo, View.ALPHA, 0F)
                animator2.duration = 1000
                animator2.start()
            }, 500)

            sfjhsf.xBet = sfjhsf.xBet * 2
            sfkusif.dfda = sfjhsf.xBet
            fsosfgj.TVbalans.text = sfjhsf.xBet.toString()


            val animator1 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.TRANSLATION_Y, -600F)
            animator1.duration = 500
            animator1.start()

            val animator2 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.ALPHA, 0F)
            animator2.duration = 500
            animator2.start()

            val animator3 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.ROTATION, -50F)
            animator3.duration = 500
            animator3.start()

            val animator4 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.TRANSLATION_Y, -600F)
            animator4.duration = 500
            animator4.start()

            val animator5 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.TRANSLATION_X, -600F)
            animator5.duration = 500
            animator5.start()

            val animator6 = ObjectAnimator.ofFloat(fsosfgj.CVone, View.SCALE_X, 0.8F)
            animator6.duration = 0
            animator6.start()

            val animator7 = ObjectAnimator.ofFloat(fsosfgj.CVone, View.SCALE_Y, 0.8F)
            animator7.duration = 0
            animator7.start()

            val animator8 = ObjectAnimator.ofFloat(fsosfgj.CVone, View.SCALE_X, 1F)
            animator8.duration = 250
            animator8.start()

            val animator9 = ObjectAnimator.ofFloat(fsosfgj.CVone, View.SCALE_Y, 1F)
            animator9.duration = 250
            animator9.start()

            Handler(Looper.getMainLooper()).postDelayed({
                val animator1 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.TRANSLATION_Y, 600F)
                animator1.duration = 0
                animator1.start()

                val animator2 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.ALPHA, 1F)
                animator2.duration = 0
                animator2.start()

                val animator3 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.ROTATION, 0F)
                animator3.duration = 0
                animator3.start()

                val animator4 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.TRANSLATION_Y, 0F)
                animator4.duration = 0
                animator4.start()

                val animator5 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.TRANSLATION_X, 0F)
                animator5.duration = 0
                animator5.start()
                fsosfgj.IVbonusThree.setImageResource(ioksjff)

                if (ioksjff !== ujsfh) {

                    sfjhsf.xBet = sfjhsf.xBet * 2
                    fsosfgj.TVbalans.text = sfjhsf.xBet.toString()

                } else {
                    val animator1 = ObjectAnimator.ofFloat(fsosfgj.CVone, View.ALPHA, 0F)
                    animator1.duration = 500
                    animator1.start()
                    val animator2 = ObjectAnimator.ofFloat(fsosfgj.CVthree, View.ALPHA, 0F)
                    animator2.duration = 500
                    animator2.start()
                    val animator3 = ObjectAnimator.ofFloat(fsosfgj.Bblue, View.ALPHA, 0F)
                    animator3.duration = 500
                    animator3.start()
                    val animator4 = ObjectAnimator.ofFloat(fsosfgj.Bred, View.ALPHA, 0F)
                    animator4.duration = 500
                    animator4.start()

                    fsosfgj.CVone.isClickable = false
                    fsosfgj.CVthree.isClickable = false
                    fsosfgj.Bblue.isClickable = false
                    fsosfgj.Bred.isClickable = false
                    //binding.TVbetWin.isClickable = false
                    Handler(Looper.getMainLooper()).postDelayed({
                        sfkusif.sifksjf(
                            fsosfgj.CVresult,fsosfgj.betCount,fsosfgj.TVbalans,
                            fsosfgj.TVxxx )
                        sfkusif.dfda = 0
                    },500)
                }
            }, 500)

            Handler(Looper.getMainLooper()).postDelayed({
            sfkusif.dfda = 0
            },2000)

        }
    }}


