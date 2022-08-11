package com.example2.phoneshopemvp.view.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import coil.load

import com.example2.phoneshopemvp.databinding.FragmentMainBinding
import com.example2.phoneshopemvp.network.models.JsonData
import com.example2.phoneshopemvp.network.repository.DataImpl
import com.example2.phoneshopemvp.presenter.mainpresenter.MainPresenter
import com.example2.phoneshopemvp.presenter.mainpresenter.MainViewApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class MainFragment() : Fragment(),MainViewApi {

    val binding by lazy { FragmentMainBinding.inflate(layoutInflater) }
    val presenter = MainPresenter(DataImpl)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter.init(this)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root


    }


     override fun setContent() {
    lifecycleScope.launchWhenCreated {
       withContext(Dispatchers.IO) {
           presenter.setData()
        }
        withContext(Dispatchers.Main) {
        binding.tvBSTitle1.text = presenter?.data?.bestSeller?.getOrNull(0)?.title
        binding.tvBSTitle2.text = presenter?.data?.bestSeller?.getOrNull(1)?.title
        binding.tvBSTitle3.text = presenter?.data?.bestSeller?.getOrNull(2)?.title
        binding.tvBSTitle4.text = presenter?.data?.bestSeller?.getOrNull(3)?.title

        binding.imgBSImage1.load(presenter?.data?.bestSeller?.getOrNull(0)?.picture)
        binding.imgBSImage2.load(presenter?.data?.bestSeller?.getOrNull(1)?.picture)
        binding.imgBSImage3.load(presenter?.data?.bestSeller?.getOrNull(2)?.picture)
        binding.imgBSImage4.load(presenter?.data?.bestSeller?.getOrNull(3)?.picture)

        binding.tvBSPriceWithoutDiscount1.text =
            presenter?.data?.bestSeller?.getOrNull(0)?.discount_price.toString()
        binding.tvBSPriceWithoutDiscount2.text =
            presenter?.data?.bestSeller?.getOrNull(1)?.discount_price.toString()
        binding.tvBSPriceWithoutDiscount3.text =
            presenter?.data?.bestSeller?.getOrNull(2)?.discount_price.toString()
        binding.tvBSPriceWithoutDiscount4.text =
            presenter?.data?.bestSeller?.getOrNull(3)?.discount_price.toString()

        //discount price
        binding.tvBSDiscountPrice1.text =
            presenter?.data?.bestSeller?.getOrNull(0)?.discount_price.toString()
        binding.tvBSDiscountPrice2.text =
            presenter?.data?.bestSeller?.getOrNull(1)?.discount_price.toString()
        binding.tvBSDiscountPrice3.text =
            presenter?.data?.bestSeller?.getOrNull(2)?.discount_price.toString()
        binding.tvBSDiscountPrice4.text =
            presenter?.data?.bestSeller?.getOrNull(3)?.discount_price.toString()

        //image hot silers
        binding.imgHT.load(presenter?.data?.home_store?.get(presenter.index)?.picture)
        binding.tvHTtitle.text = presenter?.data?.home_store?.get(presenter.index)?.title
        binding.tvHSsubtitle.text = presenter?.data?.home_store?.get(presenter.index   )?.subtitle
            binding.info.visibility = View.VISIBLE
    }
    }}

    override fun setClick() {
      binding.TVseeMore.setOnClickListener {
          presenter.setIndexHotSilers()
          binding.imgHT.load(presenter?.data?.home_store?.get(presenter.index)?.picture)
          binding.tvHTtitle.text = presenter?.data?.home_store?.get(presenter.index)?.title
          binding.tvHSsubtitle.text = presenter?.data?.home_store?.get(presenter.index)?.subtitle
      }

        binding.imgHT.setOnClickListener {
            setArgsAndGoSecondFragment(presenter?.data?.home_store?.get(presenter.index)?.picture!!,
                presenter?.data?.home_store?.get(presenter.index)?.title!!,
               "250"
            )
        }

        binding.imgBSImage1.setOnClickListener{
            setArgsAndGoSecondFragment(presenter?.data?.bestSeller?.getOrNull(0)?.picture!!,
                presenter?.data?.bestSeller?.getOrNull(0)?.title!!,
                presenter?.data?.bestSeller?.getOrNull(0)?.price_without_discount.toString()!!,)}
        binding.imgBSImage2.setOnClickListener{
            setArgsAndGoSecondFragment(presenter?.data?.bestSeller?.getOrNull(1)?.picture!!,
                presenter?.data?.bestSeller?.getOrNull(1)?.title!!,
                presenter?.data?.bestSeller?.getOrNull(1)?.price_without_discount.toString()!!,)
        }
        binding.imgBSImage3.setOnClickListener{
            setArgsAndGoSecondFragment(presenter?.data?.bestSeller?.getOrNull(2)?.picture!!,
                presenter?.data?.bestSeller?.getOrNull(2)?.title!!,
                presenter?.data?.bestSeller?.getOrNull(2)?.price_without_discount.toString()!!,)
        }
        binding.imgBSImage4.setOnClickListener{
            setArgsAndGoSecondFragment(presenter?.data?.bestSeller?.getOrNull(3)?.picture!!,
                presenter?.data?.bestSeller?.getOrNull(3)?.title!!,
                presenter?.data?.bestSeller?.getOrNull(3)?.price_without_discount.toString()!!,)
        }

    }

    private fun setArgsAndGoSecondFragment(imgUrl:String,title:String,price:String){
        val discription = MainFragmentDirections
            .actionMainFragmentToDetailsFragment(imgUrl,title,price)
        findNavController().navigate(discription)
    }

}