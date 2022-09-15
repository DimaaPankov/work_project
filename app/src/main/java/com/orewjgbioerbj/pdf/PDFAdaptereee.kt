package com.orewjgbioerbj.pdf

import android.content.Context
import android.graphics.Bitmap
import android.graphics.pdf.PdfRenderer
import android.os.ParcelFileDescriptor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.orewjgbioerbj.R


class PDFAdaptereee(ividsss: ParcelFileDescriptor, ehvddd : Context) : RecyclerView.Adapter<PDFAdaptereee.aejvhev>() {

    private var wejfj: PdfBitmapPooleee? = null
    private val sajvfijdv: PdfRenderer = PdfRenderer(ividsss)

    init {
        wejfj = PdfBitmapPooleee(sajvfijdv, Bitmap.Config.ARGB_8888,
            ehvddd.resources.displayMetrics.densityDpi)
    }

    override fun getItemCount(): Int = sajvfijdv.pageCount

    override fun onBindViewHolder(holder: aejvhev, position: Int) {
        holder.wejfhv(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): aejvhev {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pdf_page_itemqqa, parent, false)
        return aejvhev(view)
    }

    fun weaufyhef() {
        sajvfijdv.close()
        wejfj?.fewiujue?.clear()
    }


    inner class aejvhev(val view: View) : RecyclerView.ViewHolder(view) {



        fun wejfhv(pagePosition: Int) {
            val ewviyuvwei = view.findViewById<ImageView>(R.id.pageImgViewwqwqlok)
            ewviyuvwei.setImageBitmap(wejfj!!.aef9ue(pagePosition))
            wejfj!!.wafue90(pagePosition)
    }
}
}



