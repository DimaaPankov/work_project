package com.template.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.template.R
import com.template.databinding.FragmentGameBinding
import com.template.jjsdjkg.jdsgfjhs.dlhafdlhfskldafjk
import com.template.jjsdjkg.jdsgfjhs.dskhgdhklgsdjkjgkd


class GameFragment : Fragment(), dskhgdhklgsdjkjgkd {
    val presenter = dlhafdlhfskldafjk(dsjh)
    val binding by lazy { FragmentGameBinding.inflate(layoutInflater) }
    private var countMiliSecond:Long = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireContext() as MainActivity).goBack = {exitAppPlusToast()}

        presenter.djkglgljm(this)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root

    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.jdkgajkdsh()
    }

    override fun jshf() {
        binding.TVinfo.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id.action_gameFragment_to_infoFragment)
        }
    }

    override fun klshflsjd() {

        binding.Bspin.setOnClickListener {
         //   presenter.setSlots()
            binding.Bspin.isClickable = false



            if ((presenter.sfshfa() >= presenter.sgfhgah())
                ) {
                    val heidht = binding.TVslot1.height.toFloat()
                    val heidhtConteiner = binding.constraintLayout .height.toFloat()

                    presenter.djkghjd(
                        binding.TVslot52q,
                        binding.TVslot55q,
                        binding.TVslot58q,
                        binding.TVslot1,
                        binding.TVslot4,
                        binding.TVslot7,
                        binding.LLline1,
                        presenter.jdgahjldmhag,
                        presenter.kjdhjhdsjkghdjka,
                        presenter.lkshfl,
                        heidht,
                        heidhtConteiner,
                0)

                    presenter.djkghjd(
                        binding.TVslot53q,
                        binding.TVslot56q,
                        binding.TVslot59q,
                        binding.TVslot2,
                        binding.TVslot5,
                        binding.TVslot8,
                        binding.LLline2,
                        presenter.kdhashal,
                        presenter.djkdhgjkdh,
                        presenter.klhsf,
                        heidht,
                        heidhtConteiner,1000)

                    presenter.djkghjd(
                        binding.TVslot54q,
                        binding.TVslot57q,
                        binding.TVslot60q,
                        binding.TVslot3,
                        binding.TVslot6,
                        binding.TVslot9,
                        binding.LLline3,
                        presenter.hdaakjhfjdkhf,
                        presenter.dlmhgkjdshg,
                        presenter.klshf,
                        heidht,
                        heidhtConteiner,2000)

            presenter.dkgajlsdksgld(presenter.sgfhgah(), false)
            binding.TVbalans.text = presenter.sfshfa().toString()

                val listView = mutableListOf(binding.TVslot1, binding.TVslot2, binding.TVslot3,
                                              binding.TVslot4, binding.TVslot5, binding.TVslot6,
                                              binding.TVslot7, binding.TVslot8, binding.TVslot9
                )

                presenter.djkaghjdks( listView,binding.betCount,
                                     binding.TVxxx,binding.CVresult,binding.TVbalans,)

                } else {
                    (requireActivity() as MainActivity).navController.navigate(R.id
                        .action_gameFragment_to_newCoinsFragment)

                    presenter.klhdglksdkgdkj = true
                }
            Handler(Looper.getMainLooper()).postDelayed({
                binding.Bspin.isClickable = true },5000)

            presenter.kmdagjfhfhlskhska(requireContext(),presenter.sfshfa()+
                    presenter.khsfilkdajskfjas)
            presenter.djkagfkjdshf()
        }


    }

            override fun sklhflskf() {
             }


            override fun sldlgjk() {
                binding.Bbet.setOnClickListener {
                    presenter.jksgfhjdsg(0)//BET = 0
                    (requireActivity() as MainActivity).navController.navigate(R.id.action_gameFragment_to_betFragment)
                }
            }
            override fun oplajdf() {
                binding.TVbalans.text = presenter.kjshfjkhsdjhfj(this.requireContext()).toString()

                binding.betCountMinus.text = dsjh.sdkjg().toString()
                presenter.djkagfkjdshf()
                binding.TVslot1.setImageResource(presenter.lkshfl)
                binding.TVslot2.setImageResource(presenter.klhsf)
                binding.TVslot3.setImageResource(presenter.klshf)
                binding.TVslot4.setImageResource(presenter.kjdhjhdsjkghdjka)
                binding.TVslot5.setImageResource(presenter.djkdhgjkdh)
                binding.TVslot6.setImageResource(presenter.dlmhgkjdshg)
                binding.TVslot7.setImageResource(presenter.lkshfl)
                binding.TVslot8.setImageResource(presenter.klhsf)
                binding.TVslot9.setImageResource(presenter.klshf)
                binding.TVslot10.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot11.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot12.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot13.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot14.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot15.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot16.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot17.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot18.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot19.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot20.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot21.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot22.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot23.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot24.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot25.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot26.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot27.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot28.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot29.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot30.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot31.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot32.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot33.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot34.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot35.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot36.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot37.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot38.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot39.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot40.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot41.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot42.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot43.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot44.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot45.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot46.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot47.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot48.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot49.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot50.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot52.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot53.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot54.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot55.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot55.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot56.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot57.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot58.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot59.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot1q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot2q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot3q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot4q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot5q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot6q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot7q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot8q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot9q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot10q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot11q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot12q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot13q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot14q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot15q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot16q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot17q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot18q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot19q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot20q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot21q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot22q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot23q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot24q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot25q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot26q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot27q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot28q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot29q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot30q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot31q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot32q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot33q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot34q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot35q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot36q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot37q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot38q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot39q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot40q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot41q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot42q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot43q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot44q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot45q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot46q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot47q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot48q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot49q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot50q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot51q.setImageResource(dsjh.ipdkjgao.random())
                binding.TVslot52q.setImageResource(presenter.lkshfl)
                binding.TVslot53q.setImageResource(presenter.klhsf)
                binding.TVslot54q.setImageResource(presenter.klshf)
                binding.TVslot55q.setImageResource(presenter.kjdhjhdsjkghdjka)
                binding.TVslot56q.setImageResource(presenter.djkdhgjkdh)
                binding.TVslot57q.setImageResource(presenter.dlmhgkjdshg)
                binding.TVslot58q.setImageResource(presenter.lkshfl)
                binding.TVslot59q.setImageResource(presenter.klhsf)
                binding.TVslot60q.setImageResource(presenter.klshf)
            }

    override fun kslfj() {
        binding.Bok.setOnClickListener {
            binding.CVresult.alpha = 0F
            binding.CVresult.y = -600F
        }
    }
    private fun exitAppPlusToast(){
        if (countMiliSecond+2000 > System.currentTimeMillis())
        {
        (requireContext() as MainActivity).onBackPressed()
    } else {
             Toast.makeText(requireContext(),

                 "Press the back button twice to exit",

            Toast.LENGTH_SHORT).show()
    }
        countMiliSecond = System.currentTimeMillis()
    }
}






