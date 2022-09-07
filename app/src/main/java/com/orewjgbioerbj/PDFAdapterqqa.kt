package com.orewjgbioerbj

import android.content.Context
import android.graphics.Bitmap
import android.graphics.pdf.PdfRenderer
import android.os.ParcelFileDescriptor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.R


class PDFAdapterqqa(wegfivyrwgio: ParcelFileDescriptor, ewfhievhwuyi : Context) : RecyclerView.Adapter<PDFAdapterqqa.eiyewvuiyive>() {

    private var euv9oevuiopwvue: PdfBitmapPoolqqa? = null
    private val euv9ewyv: PdfRenderer = PdfRenderer(wegfivyrwgio)

    init {
        euv9oevuiopwvue = PdfBitmapPoolqqa(euv9ewyv, Bitmap.Config.ARGB_8888,
            ewfhievhwuyi.resources.displayMetrics.densityDpi)
    }

    override fun getItemCount(): Int = euv9ewyv.pageCount

    override fun onBindViewHolder(holder: eiyewvuiyive, position: Int) {
        holder.eu8evwy8wyve(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): eiyewvuiyive {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pdf_page_itemqqa, parent, false)
        return eiyewvuiyive(view)
    }

    fun e8uvewyuiv() {
        euv9ewyv.close()
        euv9oevuiopwvue?.evfujevoj?.clear()
    }


    inner class eiyewvuiyive(val view: View) : RecyclerView.ViewHolder(view) {



        fun eu8evwy8wyve(pagePosition: Int) {
            val ewviyuvwei = view.findViewById<ImageView>(R.id.pageImgView)
            ewviyuvwei.setImageBitmap(euv9oevuiopwvue!!.evjov(pagePosition))
            euv9oevuiopwvue!!.euvievop(pagePosition)
    }
}
}



