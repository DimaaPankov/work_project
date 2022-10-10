package com.template.presenter.gamepresenter

import android.animation.ObjectAnimator
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.template.model.DataApi
import com.template.view.DataBasePreferences
import com.template.view.Model
import java.text.DecimalFormat



class GamePresenter (val data: DataApi) {
    var winBet = 0
    val SIZE_SLOTS_MAX = 1.1F
    val SIZE_SLOTS_MIN = 0.9F
    val SIZE_SLOTS_DEFUELT = 1F
    var xBetCount = 0
    var indexList = mutableListOf<MutableList<Int>>()
    var srcList = mutableListOf<Int>()
    var minus = false
    var betCountXXX = 0
    var lastSlot1 = 0
    var lastSlot2 = 0
    var lastSlot3 = 0
    var lastSlot4 = 0
    var lastSlot5= 0
    var lastSlot6 = 0
    var lastSlot7 = 0
    var lastSlot8 = 0
    var lastSlot9 = 0



    fun init(_view: GameViewApi){
        context = _view

        context!!.showData()
        context!!.clickBack()
        context!!.clickBet()
        context!!.clickSpin()
        context!!.clickInfo()
        context!!.clickOk()
    }
//sdfvdsvadd .

    fun animateSlotLine(start1: ImageView,
                        start2: ImageView,
                        start3: ImageView,
                        finish1:ImageView,
                        finish2:ImageView,
                        finish3:ImageView,
                        viewLine:View,
                        res1:Int,
                        res2:Int,
                        res3:Int,
                        height:Float, heightConteiner: Float, time:Long){

        finish1.setImageResource(res1)
        finish2.setImageResource(res2)
        finish3.setImageResource(res3)

        val animator333 = ObjectAnimator.ofFloat(viewLine, View.TRANSLATION_Y,
            - viewLine.height.toFloat() + height + ((heightConteiner - height)))
        animator333.duration = 0
        animator333.start()

        Handler(Looper.getMainLooper()).postDelayed({
            val animator333 = ObjectAnimator.ofFloat(viewLine, View.TRANSLATION_Y,0
                .toFloat())
            animator333.duration = 3000
            animator333.start()

        }, time)
        Handler(Looper.getMainLooper()).postDelayed({
            start1.setImageResource(res1)
            start2.setImageResource(res2)
            start3.setImageResource(res3)
        },time+500)
    }

    fun setMainCount(bet:Int,minusOrPlus:Boolean){
        data.setMainCount(bet,minusOrPlus)
    }

    fun getBet() = data.getBet()
    fun getMainCont():Int = data.getMainCount()

    fun setBet(int: Int) = data.setBet(int)
    private var context: GameViewApi? = null


    fun distroy(){
        context = null
    }
    fun setSlots(){
        data.setSlot()
        lastSlot1 = data.getSlot()[0]
        lastSlot2 = data.getSlot()[1]
        lastSlot3 = data.getSlot()[2]
        lastSlot4 = data.getSlot()[3]
        lastSlot5 = data.getSlot()[4]
        lastSlot6 = data.getSlot()[5]
        lastSlot7 = data.getSlot()[6]
        lastSlot8 = data.getSlot()[7]
        lastSlot9 = data.getSlot()[8]
    }

    private fun checkLine():Boolean {

      var  winOrFail = false

        var _indexList = mutableListOf(
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

        val _srcList = mutableListOf(
            data.getSlot()[0],
            data.getSlot()[1],
            data.getSlot()[2],
            data.getSlot()[3],
            data.getSlot()[4],
            data.getSlot()[5],
            data.getSlot()[6],
            data.getSlot()[7],
            data.getSlot()[8]
        )
        indexList =  _indexList
        srcList = _srcList
        for (i in 0.._indexList.size - 1) {
            for (src in 0..srcList.size - 1) {
                if (srcList[i] == srcList[src] && i != src) {
                    _indexList[i].add(src)
                }
            }
        }


        for(i in indexList){
            if(i.size >=2){
                winOrFail = true
            }
        }

        var iii = 0

        if(winOrFail) {

            for(i in _indexList){
            when(i.size+1 ) {
               3 -> {
                    xBetCount = xBetCount+2
                    winBet = winBet+getBet()*2
                    betCountXXX += xBetCount
                   ++iii
                }
                4 -> {
                    xBetCount = xBetCount+3
                    winBet = winBet+getBet()*3
                    betCountXXX += xBetCount
                    ++iii

                }
               5 -> {
                    xBetCount = xBetCount+5
                    winBet = winBet+getBet()*5
                    betCountXXX += xBetCount
                   ++iii

               }
            }
            }
            xBetCount = (xBetCount.toFloat()/2).toInt()
        setMainCount(winBet,true)
            setMainCount(data.getBet(),false)
        }
        return winOrFail
    }

    fun animationSlots(imgList :  MutableList<ImageView>, betCount: TextView,TVxxx: TextView
                       , cardView:View, balans:TextView){

        if (checkLine()) {
         //   betCountXXX =  (betCountXXX.toFloat() / ( betCountXXX.toFloat() / betCountXXX.toFloat())).toInt()
            Handler(Looper.getMainLooper()).postDelayed({
                for (i in 0..indexList.size - 1) {
                    //for (src in 0..indexList[i].size-1) {
                        if(indexList[i].size >= 2){
                            animationSlot(imgList[i])
                  //          indexList.remove(indexList[i])
                        //}
                    }}

            }, 5000)
            Handler(Looper.getMainLooper()).postDelayed({
                aimationWinResult(cardView, betCount, balans, TVxxx)
            },7000)

            Handler(Looper.getMainLooper()).postDelayed({
                xBetCount = 0
            },8000)
        }
    }


    fun aimationWinResult(view:View,result:TextView,balans: TextView,xBet:TextView) {

        var time = 500
        xBet.text = "${xBetCount}X BET"
        val animator = ObjectAnimator.ofFloat(view, View.Y, 400F)
        animator.duration = 500
        animator.start()
        val animator2 = ObjectAnimator.ofFloat(view, View.ALPHA, 1F)
        animator2.duration = 500
        animator2.start()
        val partResult = (Model.getMainCount().toFloat()/100F)
        var plusResult = 0F
        repeat(100){
            time += 20
            Handler(Looper.getMainLooper()).postDelayed({
                plusResult += partResult
                result.text = DecimalFormat("#0.00").format(plusResult)
                if(it == 19){
                    balans.text = Model.getMainCount().toString()
                }
            }, time.toLong())
        }
    }



    private fun animationSlot( view2: ImageView) {
        var timer = 0L
        var visibility = true
        repeat(20) {
            timer = timer + 250
            Handler(Looper.getMainLooper()).postDelayed({
                if(visibility){
                    val animator111 = ObjectAnimator.ofFloat(view2, View.SCALE_X, SIZE_SLOTS_MAX,)
                    animator111.duration = 250
                    animator111.start()
                    val animator222 = ObjectAnimator.ofFloat(view2, View.SCALE_Y, SIZE_SLOTS_MAX)
                    animator222.duration = 250
                    animator222.start()
                    visibility = false

                }else {
                    if(it != 19){
                        val animator111 = ObjectAnimator.ofFloat(view2, View.SCALE_X, SIZE_SLOTS_MIN,)
                        animator111.duration = 250
                        animator111.start()
                        val animator222 = ObjectAnimator.ofFloat(view2, View.SCALE_Y, SIZE_SLOTS_MIN)
                        animator222.duration = 250
                        animator222.start()
                        visibility = true
                    } else {
                        val animator111 = ObjectAnimator.ofFloat(view2, View.SCALE_X, SIZE_SLOTS_DEFUELT)
                        animator111.duration = 250
                        animator111.start()
                        val animator222 = ObjectAnimator.ofFloat(view2, View.SCALE_Y, SIZE_SLOTS_DEFUELT)
                        animator222.duration = 250
                        animator222.start()
                    }
                }
            },timer)

        }}

    fun saveBalanseInDataBase(_context: Context,balans:Int){
        DataBasePreferences(_context).setBalans(balans)
    }

    fun getBalansInDataBase(_context:Context){
        Model.setMainCount(DataBasePreferences(_context).getBalans())
    }


}

/*fun animationSlots(
    listView:List<ImageView>,
    betCount: TextView, TVxxx: TextView,
    cardView: View, balans: TextView,
) {

    val srcList = mutableListOf(
        data.getSlot()[0],
        data.getSlot()[1],
        data.getSlot()[2],
        data.getSlot()[3],
        data.getSlot()[4],
        data.getSlot()[5],
        data.getSlot()[6],
        data.getSlot()[7],
        data.getSlot()[8]
    )

    var iList = 0
    var indexList = mutableListOf(
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
    Handler(Looper.getMainLooper()).postDelayed({
        for(i in 0..listView.size - 1 ) {
            for (src in 0..srcList.size-1) {
                if (srcList[i] == srcList[src] &&
                    i != src
                ) {
                    indexList[i].add(src)
                    if (indexList[i].size >= 2) {
                        animationSlot(listView[i])
                        if(i == listView.size-1) {

                        }
                    }
                }
            }

        }

    }, 5000)


    Handler(Looper.getMainLooper()).postDelayed({
        xBetCount = 0
    }, 8000)
}
 */