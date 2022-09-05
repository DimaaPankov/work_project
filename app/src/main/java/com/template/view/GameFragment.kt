package com.template.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.template.R
import com.template.databinding.FragmentGameBinding
import com.template.gamepresenter.GamePresenter
import com.template.gamepresenter.GameViewApi


class GameFragment : Fragment(), GameViewApi {
    var clicable = true
    val presenter = GamePresenter(Model)

    lateinit var binding: FragmentGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentGameBinding.inflate(layoutInflater)

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
            binding.Bspin.isClickable = false
            binding.IVback.isClickable = false
            binding.Bbet.isClickable = false
                binding.Bspin.visibility = View.INVISIBLE
                presenter.setSlots()
                binding.TVslot1.text = presenter.getSlots()[0]
                binding.TVslot2.text = presenter.getSlots()[1]
                binding.TVslot3.text = presenter.getSlots()[2]
                binding.TVslot4.text = presenter.getSlots()[3]
                binding.TVslot5.text = presenter.getSlots()[4]
                binding.TVslot6.text = presenter.getSlots()[5]
                binding.TVslot7.text = presenter.getSlots()[6]
                binding.TVslot8.text = presenter.getSlots()[7]
                binding.TVslot9.text = presenter.getSlots()[8]
                binding.betCount.text = presenter.getBet().toString()
                binding.betCount.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.white
                    )
                )

                if ((presenter.getMainCont() >= presenter.getBet())
                ) {
                    binding.Mlayout.setTransition(R.id.start, R.id.End)
                    binding.Mlayout.transitionToEnd()
                    presenter.setMainCount(presenter.getBet(), false)
                    binding.betCount.text = presenter.getMainCont().toString()
                    presenter.win {
                        Handler(Looper.getMainLooper()).postDelayed({
                            presenter.setMainCount(presenter.winBet, true)
                            val directions =
                                GameFragmentDirections.actionGameFragmentToAnimationVinFragment(
                                    arrayOf(
                                        presenter.getSlots()[0],
                                        presenter.getSlots()[1],
                                        presenter.getSlots()[2],
                                        presenter.getSlots()[3],
                                        presenter.getSlots()[4],
                                        presenter.getSlots()[5],
                                        presenter.getSlots()[6],
                                        presenter.getSlots()[7],
                                        presenter.getSlots()[8],
                                    )  /* presenter.getSlots()*/,
                                    presenter.betCountXXX,
                                    presenter.winBet,
                                    booleanArrayOf(
                                        presenter.winLine1,
                                        presenter.winLine2,
                                        presenter.winLine3
                                    )
                                )
                            findNavController().navigate(directions)

                        }, 3000)
                    }
                } else {
                    (requireActivity() as MainActivity).navController.navigate(R.id.action_gameFragment_to_newCoinsFragment)
                    presenter.minus = true
                }
            Handler(Looper.getMainLooper()).postDelayed({
                binding.Bspin.isClickable = true
                binding.IVback.isClickable = true
                binding.Bbet.isClickable = true                                        },3000)

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

                binding.betCount.text = presenter.getMainCont().toString()
                binding.betCountMinus.text = presenter.getBet().toString()
            }
        }





