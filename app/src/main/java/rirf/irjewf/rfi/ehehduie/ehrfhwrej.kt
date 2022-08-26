package rirf.irjewf.rfi.ehehduie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.skillbranch.testnaeblana.databinding.FragmentResultBinding
import rirf.irjewf.rfi.falseAnswerSize
import rirf.irjewf.rfi.trueAnswerSize


class ehrfhwrej : Fragment() {

    lateinit var binding: FragmentResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentResultBinding.inflate(layoutInflater)

        binding.tvTrue.text = "TRUE ${trueAnswerSize.toString()}"
        binding.tvFalse.text = "FALSE ${falseAnswerSize.toString()}"

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root

    }

}