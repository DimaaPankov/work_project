package com.template.jjsdjkg.jdsgfjhs

import android.animation.ObjectAnimator
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.template.kfdkl.fjshbvfjhjv
import com.template.view.DataBasePreferences
import com.template.view.dsjh
import java.text.DecimalFormat



class dlhafdlhfskldafjk (val djhgdl: fjshbvfjhjv) {
    var hdjghklsd = 0
    val dagfjkjakdj = 1.1F
    val dgh = 0.9F
    val jdaghkjsdh = 1F
    var jdahg = 0
    var dklghklsdhklhsdlhs = mutableListOf<MutableList<Int>>()
    var dlhgklsd = mutableListOf<Int>()
    var klhdglksdkgdkj = false
    var khsfilkdajskfjas = 0
    var jdgahjldmhag = 0
    var kdhashal = 0
    var hdaakjhfjdkhf = 0
    var kjdhjhdsjkghdjka = 0
    var djkdhgjkdh = 0
    var dlmhgkjdshg = 0
    var lkshfl = 0
    var klhsf = 0
    var klshf = 0



    fun djkglgljm(jkdgkjds: dskhgdhklgsdjkjgkd){
        kldagkldagodal = jkdgkjds

        kldagkldagodal!!.oplajdf()
        kldagkldagodal!!.sklhflskf()
        kldagkldagodal!!.sldlgjk()
        kldagkldagodal!!.klshflsjd()
        kldagkldagodal!!.jshf()
        kldagkldagodal!!.kslfj()
    }
//sdfvdsvadd .

    fun djkghjd(dlng: ImageView,
                jskf: ImageView,
                dfak: ImageView,
                jfls:ImageView,
                dajhfakj:ImageView,
                jskgfkjas:ImageView,
                ksfjfjkljvd:View,
                jksgfj:Int,
                ksfgjkdahk:Int,
                sjhdsalhdk:Int,
                djkghsdjk:Float,
                lkghklds: Float,
                kshkglsjd:Long){

        jfls.setImageResource(jksgfj)
        dajhfakj.setImageResource(ksfgjkdahk)
        jskgfkjas.setImageResource(sjhdsalhdk)

        val oklhdagklshdkgs = ObjectAnimator.ofFloat(ksfjfjkljvd, View.TRANSLATION_Y,
            - ksfjfjkljvd.height.toFloat() + djkghsdjk + ((lkghklds - djkghsdjk)))
        oklhdagklshdkgs.duration = 0
        oklhdagklshdkgs.start()

        Handler(Looper.getMainLooper()).postDelayed({
            val oklghlkshdkghsg = ObjectAnimator.ofFloat(ksfjfjkljvd, View.TRANSLATION_Y,0
                .toFloat())
            oklghlkshdkghsg.duration = 3000
            oklghlkshdkghsg.start()

        }, kshkglsjd)
        Handler(Looper.getMainLooper()).postDelayed({
            dlng.setImageResource(jksgfj)
            jskf.setImageResource(ksfgjkdahk)
            dfak.setImageResource(sjhdsalhdk)
        },kshkglsjd+500)
    }

    fun dkgajlsdksgld(ksgkg:Int, hjsgjhfga:Boolean){
        djhgdl.rflhgkls(ksgkg,hjsgjhfga)
    }

    fun sgfhgah() = djhgdl.sdkjg()
    fun sfshfa():Int = djhgdl.kdshvk()

    fun jksgfhjdsg(dskkfhkfkl: Int) = djhgdl.dlhgoks(dskkfhkfkl)
    private var kldagkldagodal: dskhgdhklgsdjkjgkd? = null


    fun jdkgajkdsh(){
        kldagkldagodal = null
    }
    fun djkagfkjdshf(){
        djhgdl.sdlgh()
        jdgahjldmhag = djhgdl.dlgh()[0]
        kdhashal = djhgdl.dlgh()[1]
        hdaakjhfjdkhf = djhgdl.dlgh()[2]
        kjdhjhdsjkghdjka = djhgdl.dlgh()[3]
        djkdhgjkdh = djhgdl.dlgh()[4]
        dlmhgkjdshg = djhgdl.dlgh()[5]
        lkshfl = djhgdl.dlgh()[6]
        klhsf = djhgdl.dlgh()[7]
        klshf = djhgdl.dlgh()[8]
    }

    private fun dokghskld():Boolean {

      var  kjjsgfajkmf = false

        var djlghjds = mutableListOf(
            mutableListOf<Int>(),
            mutableListOf<Int>(),
            mutableListOf<Int>(),
            mutableListOf<Int>(),
            mutableListOf<Int>(),
            mutableListOf<Int>(),
            mutableListOf<Int>(),
            mutableListOf<Int>(),
            mutableListOf<Int>()
        )

        val jsjkgfkj = mutableListOf(
            djhgdl.dlgh()[0],
            djhgdl.dlgh()[1],
            djhgdl.dlgh()[2],
            djhgdl.dlgh()[3],
            djhgdl.dlgh()[4],
            djhgdl.dlgh()[5],
            djhgdl.dlgh()[6],
            djhgdl.dlgh()[7],
            djhgdl.dlgh()[8]
        )
        dklghklsdhklhsdlhs =  djlghjds
        dlhgklsd = jsjkgfkj
        for (i in 0..djlghjds.size - 1) {
            for (src in 0..dlhgklsd.size - 1) {
                if (dlhgklsd[i] == dlhgklsd[src] && i != src) {
                    djlghjds[i].add(src)
                }
            }
        }
      var iii = 0

        for(i in dklghklsdhklhsdlhs){
            if(i.size >=2){
                kjjsgfajkmf = true
            }
        }

        if(kjjsgfajkmf) {

               for (i in djlghjds) {
                   if(i.size != 0) {
                       when (i.size + 1) {
                           3 -> {
                               jdahg = jdahg + 2
                               hdjghklsd = hdjghklsd + sgfhgah() * 2
                               khsfilkdajskfjas += jdahg
                               iii = iii+2
                           }
                           4 -> {
                               jdahg = jdahg + 3
                               hdjghklsd = hdjghklsd + sgfhgah() * 3
                               khsfilkdajskfjas += jdahg
                               iii = iii+2
                           }
                           5 -> {
                               jdahg = jdahg + 1
                               hdjghklsd = hdjghklsd + sgfhgah() * 1
                               khsfilkdajskfjas += jdahg
                               iii = iii+2
                           }
                       }
                   }

           }
            jdahg = (jdahg.toFloat()/2).toInt()
        dkgajlsdksgld(hdjghklsd,true)
            dkgajlsdksgld(djhgdl.sdkjg(),false)
        }
        return kjjsgfajkmf
    }

    fun djkaghjdks(sjfhjkahfak :  MutableList<ImageView>, jkdagjkfhads: TextView, dojaghkjdahf: TextView
                   , sjgfkjdhsfokhfd:View, kakdlhfkldj:TextView){

        if (dokghskld()) {

            Handler(Looper.getMainLooper()).postDelayed({
                for (i in 0..dklghklsdhklhsdlhs.size - 1) {
                        if(dklghklsdhklhsdlhs[i].size >= 2){
                            jsdjksgd(sjfhjkahfak[i])

                    }}

            }, 5000)
            Handler(Looper.getMainLooper()).postDelayed({
                jdjksghjsd(sjgfkjdhsfokhfd, jkdagjkfhads, kakdlhfkldj, dojaghkjdahf)
            },7000)

            Handler(Looper.getMainLooper()).postDelayed({
                jdahg = 0
                hdjghklsd = 0

            },8000)
        }
    }


    fun jdjksghjsd(jdlhjf:View, djagf:TextView, odajsgja: TextView, ajgsfj:TextView) {

        var uifsfga = 500
        ajgsfj.text = "${jdahg + 2}X BET"
        val jskgfj = ObjectAnimator.ofFloat(jdlhjf, View.Y, 400F)
        jskgfj.duration = 500
        jskgfj.start()
        val uiusfgajf = ObjectAnimator.ofFloat(jdlhjf, View.ALPHA, 1F)
        uiusfgajf.duration = 500
        uiusfgajf.start()
        val hhas = (dsjh.kdshvk().toFloat()/100F)
        var jdhjv = 0F
        repeat(100){
            uifsfga += 20
            Handler(Looper.getMainLooper()).postDelayed({
                jdhjv += hhas
                djagf.text = DecimalFormat("#0.00").format(jdhjv)
                if(it == 19){
                    odajsgja.text = dsjh.kdshvk().toString()
                }
            }, uifsfga.toLong())
        }
    }



    private fun jsdjksgd(view2: ImageView) {
        var jksgfj = 0L
        var jjsgfjk = true
        repeat(20) {
            jksgfj = jksgfj + 250
            Handler(Looper.getMainLooper()).postDelayed({
                if(jjsgfjk){
                    val kjsfgj = ObjectAnimator.ofFloat(view2, View.SCALE_X, dagfjkjakdj,)
                    kjsfgj.duration = 250
                    kjsfgj.start()
                    val slfjh = ObjectAnimator.ofFloat(view2, View.SCALE_Y, dagfjkjakdj)
                    slfjh.duration = 250
                    slfjh.start()
                    jjsgfjk = false

                }else {
                    if(it != 19){
                        val kslfh = ObjectAnimator.ofFloat(view2, View.SCALE_X, dgh,)
                        kslfh.duration = 250
                        kslfh.start()
                        val jgfjakfgjka = ObjectAnimator.ofFloat(view2, View.SCALE_Y, dgh)
                        jgfjakfgjka.duration = 250
                        jgfjakfgjka.start()
                        jjsgfjk = true
                    } else {
                        val jjskgfjkga = ObjectAnimator.ofFloat(view2, View.SCALE_X, jdaghkjsdh)
                        jjskgfjkga.duration = 250
                        jjskgfjkga.start()
                        val jsajkf = ObjectAnimator.ofFloat(view2, View.SCALE_Y, jdaghkjsdh)
                        jsajkf.duration = 250
                        jsajkf.start()
                    }
                }
            },jksgfj)

        }}

    fun kmdagjfhfhlskhska(_context: Context, balans:Int){
        DataBasePreferences(_context).jdlhgl(balans)
    }

    fun kjshfjkhsdjhfj(_context:Context) = DataBasePreferences(_context).dhklg()
}

