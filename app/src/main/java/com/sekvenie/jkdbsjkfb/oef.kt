package com.sekvenie.jkdbsjkfb

import androidx.lifecycle.ViewModel
import com.sekvenie.App
import com.sekvenie.model.dksghdlslk.klfslks.egkhds
import com.sekvenie.R


enum class dksafbk{  LOADING,DONE,ERROR }

class egiokr(private val api: aosahf<egkhds>): ViewModel() {
    private var sifkh: List<egkhds>? = null
    private var fosfh: wrikghoi? = null
    private var fska: List<egkhds> = mutableListOf()
    private val fsik = mutableSetOf<String>()

    private fun sortingFilmsFromABC(){
        sifkh = sifkh?.sortedWith(compareBy(egkhds::bjgds))
    }

    fun ejpigf() = sifkh

    fun fikhl() = fska

    private fun efokhewu(){
        sifkh?.forEach { data ->
                fsik.add(data.djksf.eoglhfd)
        }
    }

    fun dkhsg(fifdkh: wrikghoi) {
        this.fosfh = fifdkh
        sdkghdsk()
    }

    private fun sdkghdsk() {
                    sifkh = api.sophgsd
                    efokhewu()
                    sortingFilmsFromABC()
                    fosfh?.eifkhdl(sifkh!!)
                    fosfh?.idskh(fsik)


    }

    fun eidgkhdil(esjfkewhd: String?){
            val erkgh = mutableListOf<egkhds>()
            sifkh?.forEach { data ->
                    if(data.djksf.eoglhfd == esjfkewhd){
                        erkgh.add(data)

                }
            }
            fska = erkgh
    }

    fun eofhe() {
        fosfh = null
    }

    fun adgik() {
        App.dsisdjhv?.navigate(R.id.action_mainFragment_to_detailFragment)
    }

}