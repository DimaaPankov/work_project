package com.template.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible

import androidx.navigation.fragment.findNavController
import com.template.R
import com.template.databinding.FragmentGameBinding
import com.template.presenter.gamepresenter.GamePresenter
import com.template.presenter.gamepresenter.GameViewApi


class GameFragment : Fragment(), GameViewApi {
    var clicable = true
    val presenter = GamePresenter(Model)
    val binding by lazy { FragmentGameBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireContext() as MainActivity).goBack = {
            findNavController().navigate(R.id.action_gameFragment_to_mainFragment)
        }

        presenter.init(this)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root

    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.distroy()
    }


    override fun clickSpin() {

        binding.Bspin.setOnClickListener {
            presenter.setSlots()
            binding.Bspin.isClickable = false
            binding.IVback.isClickable = false
            binding.Vline.isVisible = false

                if ((presenter.getMainCont() >= presenter.getBet())
                ) {
            presenter.animateSlotLine(binding.TVslot58q,binding.TVslot1, binding.LLline1,presenter.lastSlot1,0)
            presenter.animateSlotLine(binding.TVslot59q,binding.TVslot2,binding.LLline2,presenter.lastSlot2,1000)
            presenter.animateSlotLine(binding.TVslot60q,binding.TVslot3,binding.LLline3,presenter.lastSlot3,2000)
            presenter.setMainCount(presenter.getBet(), false)
            binding.TVbalans.text = presenter.getMainCont().toString()
            presenter.animationVin( binding.TVslot1, binding.TVslot2, binding.TVslot3,binding.betCount,
                                     binding.betCountSmile,binding.TVvin,binding.TVxxx,binding.Vline,
                                                                   binding.CVresult,binding.TVbalans)
                } else {
                    (requireActivity() as MainActivity).navController.navigate(R.id.action_gameFragment_to_newCoinsFragment)
                    presenter.minus = true
                }
            Handler(Looper.getMainLooper()).postDelayed({
                binding.Bspin.isClickable = true
                binding.IVback.isClickable = true },5000)
        }
    }

            override fun clickBack() {
                binding.IVback.setOnClickListener {
                    (requireActivity() as MainActivity).navController.navigate(R.id.action_gameFragment_to_mainFragment)
                }
            }

            override fun clickBet() {
                binding.Bbet.setOnClickListener {
                    presenter.setBet(0)//BET = 0
                    (requireActivity() as MainActivity).navController.navigate(R.id.action_gameFragment_to_betFragment)
                }
            }
            override fun showData() {
                binding.TVbalans.text = Model.getMainCount().toString()
                binding.betCountMinus.text = Model.getBet().toString()
                presenter.setSlots()
                binding.TVslot1.setImageResource(Model.slots.random())
                binding.TVslot2.setImageResource(Model.slots.random())
                binding.TVslot3.setImageResource(Model.slots.random())
                binding.TVslot4.setImageResource(Model.slots.random())
                binding.TVslot5.setImageResource(Model.slots.random())
                binding.TVslot6.setImageResource(Model.slots.random())
                binding.TVslot7.setImageResource(Model.slots.random())
                binding.TVslot8.setImageResource(Model.slots.random())
                binding.TVslot9.setImageResource(Model.slots.random())
                binding.TVslot10.setImageResource(Model.slots.random())
                binding.TVslot11.setImageResource(Model.slots.random())
                binding.TVslot12.setImageResource(Model.slots.random())
                binding.TVslot13.setImageResource(Model.slots.random())
                binding.TVslot14.setImageResource(Model.slots.random())
                binding.TVslot15.setImageResource(Model.slots.random())
                binding.TVslot16.setImageResource(Model.slots.random())
                binding.TVslot17.setImageResource(Model.slots.random())
                binding.TVslot18.setImageResource(Model.slots.random())
                binding.TVslot19.setImageResource(Model.slots.random())
                binding.TVslot20.setImageResource(Model.slots.random())
                binding.TVslot21.setImageResource(Model.slots.random())
                binding.TVslot22.setImageResource(Model.slots.random())
                binding.TVslot23.setImageResource(Model.slots.random())
                binding.TVslot24.setImageResource(Model.slots.random())
                binding.TVslot25.setImageResource(Model.slots.random())
                binding.TVslot26.setImageResource(Model.slots.random())
                binding.TVslot27.setImageResource(Model.slots.random())
                binding.TVslot28.setImageResource(Model.slots.random())
                binding.TVslot29.setImageResource(Model.slots.random())
                binding.TVslot30.setImageResource(Model.slots.random())
                binding.TVslot31.setImageResource(Model.slots.random())
                binding.TVslot32.setImageResource(Model.slots.random())
                binding.TVslot33.setImageResource(Model.slots.random())
                binding.TVslot34.setImageResource(Model.slots.random())
                binding.TVslot35.setImageResource(Model.slots.random())
                binding.TVslot36.setImageResource(Model.slots.random())
                binding.TVslot37.setImageResource(Model.slots.random())
                binding.TVslot38.setImageResource(Model.slots.random())
                binding.TVslot39.setImageResource(Model.slots.random())
                binding.TVslot40.setImageResource(Model.slots.random())
                binding.TVslot41.setImageResource(Model.slots.random())
                binding.TVslot42.setImageResource(Model.slots.random())
                binding.TVslot43.setImageResource(Model.slots.random())
                binding.TVslot44.setImageResource(Model.slots.random())
                binding.TVslot45.setImageResource(Model.slots.random())
                binding.TVslot46.setImageResource(Model.slots.random())
                binding.TVslot47.setImageResource(Model.slots.random())
                binding.TVslot48.setImageResource(Model.slots.random())
                binding.TVslot49.setImageResource(Model.slots.random())
                binding.TVslot50.setImageResource(Model.slots.random())
                binding.TVslot52.setImageResource(Model.slots.random())
                binding.TVslot53.setImageResource(Model.slots.random())
                binding.TVslot54.setImageResource(Model.slots.random())
                binding.TVslot55.setImageResource(Model.slots.random())
                binding.TVslot55.setImageResource(Model.slots.random())
                binding.TVslot56.setImageResource(Model.slots.random())
                binding.TVslot57.setImageResource(Model.slots.random())
                binding.TVslot58.setImageResource(Model.slots.random())
                binding.TVslot59.setImageResource(Model.slots.random())
                binding.TVslot1q.setImageResource(Model.slots.random())
                binding.TVslot2q.setImageResource(Model.slots.random())
                binding.TVslot3q.setImageResource(Model.slots.random())
                binding.TVslot4q.setImageResource(Model.slots.random())
                binding.TVslot5q.setImageResource(Model.slots.random())
                binding.TVslot6q.setImageResource(Model.slots.random())
                binding.TVslot7q.setImageResource(Model.slots.random())
                binding.TVslot8q.setImageResource(Model.slots.random())
                binding.TVslot9q.setImageResource(Model.slots.random())
                binding.TVslot10q.setImageResource(Model.slots.random())
                binding.TVslot11q.setImageResource(Model.slots.random())
                binding.TVslot12q.setImageResource(Model.slots.random())
                binding.TVslot13q.setImageResource(Model.slots.random())
                binding.TVslot14q.setImageResource(Model.slots.random())
                binding.TVslot15q.setImageResource(Model.slots.random())
                binding.TVslot16q.setImageResource(Model.slots.random())
                binding.TVslot17q.setImageResource(Model.slots.random())
                binding.TVslot18q.setImageResource(Model.slots.random())
                binding.TVslot19q.setImageResource(Model.slots.random())
                binding.TVslot20q.setImageResource(Model.slots.random())
                binding.TVslot21q.setImageResource(Model.slots.random())
                binding.TVslot22q.setImageResource(Model.slots.random())
                binding.TVslot23q.setImageResource(Model.slots.random())
                binding.TVslot24q.setImageResource(Model.slots.random())
                binding.TVslot25q.setImageResource(Model.slots.random())
                binding.TVslot26q.setImageResource(Model.slots.random())
                binding.TVslot27q.setImageResource(Model.slots.random())
                binding.TVslot28q.setImageResource(Model.slots.random())
                binding.TVslot29q.setImageResource(Model.slots.random())
                binding.TVslot30q.setImageResource(Model.slots.random())
                binding.TVslot31q.setImageResource(Model.slots.random())
                binding.TVslot32q.setImageResource(Model.slots.random())
                binding.TVslot33q.setImageResource(Model.slots.random())
                binding.TVslot34q.setImageResource(Model.slots.random())
                binding.TVslot35q.setImageResource(Model.slots.random())
                binding.TVslot36q.setImageResource(Model.slots.random())
                binding.TVslot37q.setImageResource(Model.slots.random())
                binding.TVslot38q.setImageResource(Model.slots.random())
                binding.TVslot39q.setImageResource(Model.slots.random())
                binding.TVslot40q.setImageResource(Model.slots.random())
                binding.TVslot41q.setImageResource(Model.slots.random())
                binding.TVslot42q.setImageResource(Model.slots.random())
                binding.TVslot43q.setImageResource(Model.slots.random())
                binding.TVslot44q.setImageResource(Model.slots.random())
                binding.TVslot45q.setImageResource(Model.slots.random())
                binding.TVslot46q.setImageResource(Model.slots.random())
                binding.TVslot47q.setImageResource(Model.slots.random())
                binding.TVslot48q.setImageResource(Model.slots.random())
                binding.TVslot49q.setImageResource(Model.slots.random())
                binding.TVslot50q.setImageResource(Model.slots.random())
                binding.TVslot52q.setImageResource(Model.slots.random())
                binding.TVslot53q.setImageResource(Model.slots.random())
                binding.TVslot54q.setImageResource(Model.slots.random())
                binding.TVslot55q.setImageResource(Model.slots.random())
                binding.TVslot55q.setImageResource(Model.slots.random())
                binding.TVslot56q.setImageResource(Model.slots.random())
                binding.TVslot57q.setImageResource(Model.slots.random())
                binding.TVslot58q.setImageResource(presenter.lastSlot1)
                binding.TVslot59q.setImageResource(presenter.lastSlot2)
                binding.TVslot60q.setImageResource(presenter.lastSlot3)
            }

    override fun clickOk() {
        binding.Bok.setOnClickListener {
            binding.CVresult.alpha = 0F
            binding.CVresult.y = -600F
        }
    }
}






