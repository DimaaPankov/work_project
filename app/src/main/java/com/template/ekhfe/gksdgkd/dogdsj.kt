package com.template.ekhfe.gksdgkd

import android.animation.ObjectAnimator
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import com.template.ekhfe.kfhaskf.adigkhdg
import com.template.R
import com.template.ksafsa.codg
import java.text.DecimalFormat


class dogdsj (val adgljad: adigkhdg) {
    var djgg = 0
    val djggjvd = 1.1F
    val skf = 0.9F
    val dgjsd = 1F
    var dgjdj = 0
    var dagj = false
    var dgjs = 0
    var djgaaf = 0
    var jdgda = 0
    var sflad = 0


    fun dkaga(salf: GameViewApi){
        adlgjdja = salf

       adlgjdja!!.adkfhakf()
       adlgjdja!!.dfks()
       adlgjdja!!.sfsjjj()
       adlgjdja!!.clickSpin()
       adlgjdja!!.adkljjlj()
}

    fun djgdagld(dnkgd: ImageView, dgaljd:ImageView, djlsd:View, asla:Int,
                 dajgda:Float, asfjsa: Float, saffj:Long){

        dgaljd.setImageResource(asla)


        val djklajdf = ObjectAnimator.ofFloat(djlsd, View.TRANSLATION_Y,
            - djlsd.height.toFloat() + dajgda + ((asfjsa - dajgda)))
        djklajdf.duration = 0
        djklajdf.start()

        Handler(Looper.getMainLooper()).postDelayed({
            val dshd = ObjectAnimator.ofFloat(djlsd, View.TRANSLATION_Y,0 //viewLine.height - (imgView.height*8)
                .toFloat())
            dshd.duration = 3000
            dshd.start()

        }, saffj)
        Handler(Looper.getMainLooper()).postDelayed({
            dnkgd.setImageResource(asla)
        },saffj+500)
    }

fun dgkhd(bet:Int, minusOrPlus:Boolean){
adgljad.setMainCount(bet,minusOrPlus)
}

fun sdgjd() = adgljad.getBet()
fun fjfa():Int = adgljad.getMainCount()

fun dsfj(sfjs: Int) = adgljad.setBet(sfjs)
private var adlgjdja: GameViewApi? = null


fun distroy(){
adlgjdja = null
}
fun fsn(){
adgljad.setSlot()
    djgaaf = adgljad.getSlot()[0]
    jdgda = adgljad.getSlot()[1]
    sflad = adgljad.getSlot()[2]
}



private fun fkas(sf:Int, sfja: Int, sofjsa:Int):Boolean{
if(( sf == sfja) and (sfja == sofjsa)) {
    when(sf ) {
        R.drawable.strawberry -> {
            dgjdj = 2
            djgg = djgg+sdgjd()
            dgjs += dgjdj
        }
        R.drawable.seven2 -> {
            dgjdj = 3
            djgg = djgg+sdgjd()*2
            dgjs += dgjdj
        }
        R.drawable.cherry -> {
            dgjdj = 5
            djgg = djgg+sdgjd()*5
            dgjs += dgjdj
        }
    }
    dgkhd(djgg,true)
    dgkhd(adgljad.getBet(),false)
}
          return ( sf ==  sfja) and ( sfja ==  sofjsa)
}

    fun sfjakj(skf:ImageView, sjflsja:ImageView, skff:ImageView, skfjs: TextView,
               dffhdaj: TextView, sgjsd: TextView, sdgjd: TextView, dfdk:View
               , dkvvdk:View, dkjds:TextView){
        if (fkas(adgljad.getSlot()[0], adgljad.getSlot()[1], adgljad.getSlot()[2])) {
            Handler(Looper.getMainLooper()).postDelayed({
                jvdks( skf)
                jvdks( sjflsja)
                jvdks( skff)
                hsdgkjds(dfdk)
            }, 5000)
            Handler(Looper.getMainLooper()).postDelayed({
                sogjd(dkvvdk, skfjs, dkjds, sdgjd)
            },7000)

        }
    }

    fun sogjd(dgjs:View, kdkd:TextView, fkghs: TextView, sdsds:TextView) {
        var dfdkjf = 500
        sdsds.text = "${dgjdj}X BET"
            val dkfhdf = ObjectAnimator.ofFloat(dgjs, View.Y, 400F)
            dkfhdf.duration = 500
            dkfhdf.start()
            val jsgkjs = ObjectAnimator.ofFloat(dgjs, View.ALPHA, 1F)
            jsgkjs.duration = 500
            jsgkjs.start()
         val adkgjfakd = (codg.getMainCount().toFloat()/100F)
         var kdskdjfs = 0F
        repeat(100){
            dfdkjf += 20
            Handler(Looper.getMainLooper()).postDelayed({
                kdskdjfs += adkgjfakd
                kdkd.text = DecimalFormat("#0.00").format(kdskdjfs)
                if(it == 19){
                    fkghs.text = codg.getMainCount().toString()
                }
            }, dfdkjf.toLong())
        }
    }

        private fun hsdgkjds(kfsgks: View) {
            var gdskgd = true
            var sdkg = 0L

            repeat(10) {
                sdkg = sdkg + 500

                Handler(Looper.getMainLooper()).postDelayed({
                    if (gdskgd) {
                        kfsgks.isVisible = true
                        gdskgd = false

                    } else {
                        kfsgks.isVisible = false
                        gdskgd = true
                    }
                }, sdkg)

            }
        }

    private fun jvdks(rrkh: ImageView) {
        var godjg = 0L
        var dkksd = true
        repeat(20) {
            godjg = godjg + 250
            Handler(Looper.getMainLooper()).postDelayed({
            if(dkksd){
           //     animationSmile(betCount, betCountSmile, TVvin)
                val kdghd = ObjectAnimator.ofFloat(rrkh, View.SCALE_X, djggjvd,)
                kdghd.duration = 250
                kdghd.start()
                val kdgkd = ObjectAnimator.ofFloat(rrkh, View.SCALE_Y, djggjvd)
                kdgkd.duration = 250
                kdgkd.start()
                dkksd = false

            }else {
                if(it != 19){
          //      animationSmile(betCount, betCountSmile, TVvin)
                val dkgdkg = ObjectAnimator.ofFloat(rrkh, View.SCALE_X, skf,)
                dkgdkg.duration = 250
                dkgdkg.start()
                val dgjkldsjfd = ObjectAnimator.ofFloat(rrkh, View.SCALE_Y, skf)
                dgjkldsjfd.duration = 250
                dgjkldsjfd.start()
                dkksd = true
                } else {
           //         animationSmile(betCount, betCountSmile, TVvin)
                    val kdgkdsgk = ObjectAnimator.ofFloat(rrkh, View.SCALE_X, dgjsd)
                    kdgkdsgk.duration = 250
                    kdgkdsgk.start()
                    val aljgdajga = ObjectAnimator.ofFloat(rrkh, View.SCALE_Y, dgjsd)
                    aljgdajga.duration = 250
                    aljgdajga.start()
                }
            }
          },godjg)

        }}

}
