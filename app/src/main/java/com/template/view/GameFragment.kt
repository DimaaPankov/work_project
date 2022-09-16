package com.template.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.template.R
import com.template.databinding.FragmentGameBinding
import com.template.gamepresenter.GamePresenter
import com.template.gamepresenter.GameViewApi


class GameFragment : Fragment(), GameViewApi {
    val presenter by lazy {GamePresenter(Model)}
    lateinit var binding: FragmentGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentGameBinding.inflate(layoutInflater)

        presenter.init(this)
        MainActivity.goBack = {
            findNavController().
            navigate(GameFragmentDirections.actionGameFragmentToMainFragment())
        }
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
                binding.TVslot1.setImageResource( presenter.getSlots()[0])
                binding.TVslot2.setImageResource( presenter.getSlots()[1])
                binding.TVslot3.setImageResource( presenter.getSlots()[2])
                binding.TVslot4.setImageResource( presenter.getSlots()[3])
                binding.TVslot5.setImageResource( presenter.getSlots()[4])
                binding.TVslot6.setImageResource( presenter.getSlots()[5])
                binding.TVslot7.setImageResource( presenter.getSlots()[6])
                binding.TVslot8.setImageResource( presenter.getSlots()[7])
                binding.TVslot9.setImageResource( presenter.getSlots()[8])
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
                                    ).toIntArray(),
                                    presenter.betCountXXX,
                                    presenter.winBet,
                                    booleanArrayOf(
                                        presenter.winLine1,
                                        presenter.winLine2,
                                        presenter.winLine3
                                    )
                                )
                            findNavController().navigate(directions)
                            DataBasePreferences(requireContext()).setBalans(presenter.getMainCont()+
                                    presenter.betCountXXX - 1)
                        }, 3000)

                    }
                } else {
                    (requireActivity() as MainActivity).navController.navigate(R.id
                        .action_gameFragment_to_newCoinsFragment)
                    presenter.minus = true
                }
            Handler(Looper.getMainLooper()).postDelayed({
                binding.Bspin.isClickable = true
                binding.IVback.isClickable = true
                binding.Bbet.isClickable = true},3000)
            DataBasePreferences(requireContext()).setBalans(presenter.getMainCont())
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





