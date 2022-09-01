package com.example2.a1xbetproject.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example2.a1xbetproject.UserAdapter
import com.example2.a1xbetproject.adapter.sportsevent.SportEventModel
import com.example2.a1xbetproject.mainactivity.DataBasePreferences
import com.test.luckydrum.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    val binding by lazy { FragmentMainBinding.inflate(layoutInflater)}
    val data = listOf<SportEventModel>(
        SportEventModel("Атлетик Бильбао - Мальорка","1.52","6.71","1.47"),
        SportEventModel("Копенгаген - Трабзонспор","2.74","2.82","3.56"),
        SportEventModel("Рейдженерс - ПСВ","2.25","3.56","2.84"),
        SportEventModel("Буде-Глимт - Динамо 3г","2.21","3.70","3.30"),
        SportEventModel("Амкал - Зоркий","3.74","4.31","1.85"),
        SportEventModel("Лестер - Манчестер Юн","1.92","3.70","4.70"),
        SportEventModel("Болония - Салеретиана","3.54","3.98","2.14"),
        SportEventModel("Атланта - Тоино","1.79","4.00","1.85"),
        SportEventModel("ЦСК - Металург","2.37","4.31","3.00"),
        SportEventModel("Беларусская Д - Хофетайм","1.67","4.80","4.80"),
        SportEventModel("Слуцк - Арсенал Дзержинск","1.94","4.30","3.85"),
        SportEventModel("Сочи - Сибирь","2.80","4.00","2.50"),

     )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         binding.TVbalans.text = "\uD83E\uDE99${DataBasePreferences(requireContext()).getBalansFloate().toString()}"

        val adapter = UserAdapter(object : UserAdapter.OnUserClickListener{
            override fun onClick(film: SportEventModel) {
                val directions = MainFragmentDirections.actionMainFragmentToDeteilFragment(
                        film.titleEvent,film.xBet1,film.xBet2,film.xBet3
                        )

                findNavController().navigate(directions)
            }
        },data)

         binding.RVmain.adapter = adapter



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}