package rirf.irjewf.rfi.edud2u8d

import androidx.lifecycle.ViewModel
import rirf.irjewf.rfi.R
import rirf.irjewf.rfi.wefjdec.qwduqed


class rejigfujerigjr(): ViewModel() {
    var efjdhfh  = 0
    val fuiruigurguie = listOf(
        qwduqed(R.string.XXI, R.drawable.xvi, false),
        qwduqed(R.string.Americans, R.drawable.amerecans_pokers, true),
        qwduqed(R.string.difrient_game, R.drawable.difrent_game, true),
        qwduqed(R.string.people, R.drawable.people, true),
        qwduqed(R.string.five_mastchi, R.drawable.five_masthi, false),
        qwduqed(R.string.sochial_status, R.drawable.pokers_social_status, true)
    )


    fun rhfurf(): qwduqed {
        return fuiruigurguie[efjdhfh]

    }
   fun rehfueryfhurh(){
       if(efjdhfh<fuiruigurguie.size-1){
           efjdhfh++
       }else{
           efjdhfh = 0
       }
   }

    fun ujfireugireyu() = if(efjdhfh!=0)fuiruigurguie[efjdhfh-1].answer else fuiruigurguie[efjdhfh].answer
}



