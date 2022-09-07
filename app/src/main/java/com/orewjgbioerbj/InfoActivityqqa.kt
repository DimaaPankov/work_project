package com.orewjgbioerbj

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.os.ParcelFileDescriptor
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.R
import com.example.databinding.PdfActivityqqaBinding
import java.io.File
import java.io.InputStream


class InfoActivityqqa : AppCompatActivity() {
    lateinit var pageViewPager: ViewPager2
    var parcelFileDescriptor: ParcelFileDescriptor? = null
    var pdfAdapterqqa: PDFAdapterqqa? = null
    lateinit var binding: PdfActivityqqaBinding
    private var back_pressed:Long = 0

    override fun onBackPressed() {
        if (back_pressed+2000 > System.currentTimeMillis()) {
            super.onBackPressed()
        } else {
            Toast.makeText(getBaseContext(), "Press the back button twice to exit", Toast.LENGTH_SHORT).show();
        }
        back_pressed = System.currentTimeMillis()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PdfActivityqqaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.IVsend.setOnClickListener{
            val browserIntent: Intent= Intent(Intent.ACTION_VIEW, Uri
                .parse("https://casino.ru/wp-content/uploads/kniga-vse-o-kazino.pdf"));
            startActivity(browserIntent)
        }



        window.apply {
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            statusBarColor = Color.TRANSPARENT
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        pageViewPager = findViewById(R.id.pageViewPager)

        with(pageViewPager) {
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 3
        }


        val pageMarginPx = resources.getDimensionPixelOffset(R.dimen.pageMargin)
        val offsetPx = resources.getDimensionPixelOffset(R.dimen.offset)



        pageViewPager.setPageTransformer { page, position ->
            val viewPager = page.parent.parent as ViewPager2
            val offset = position * -(2 * offsetPx + pageMarginPx)
            if (viewPager.orientation == ViewPager2.ORIENTATION_HORIZONTAL) {
                if (ViewCompat.getLayoutDirection(viewPager) == ViewCompat.LAYOUT_DIRECTION_RTL) {
                    page.translationX = -offset
                } else {
                    page.translationX = offset
                }
            } else {
                page.translationY = offset
            }
        }

        initPdfViewer(getFile())

    }


    fun initPdfViewer(pdfFile : File){
        try {
            pageViewPager.visibility = View.VISIBLE
            binding.baseProgressBar.visibility = View.GONE

            parcelFileDescriptor = ParcelFileDescriptor.open(pdfFile, ParcelFileDescriptor.MODE_READ_ONLY)
            pdfAdapterqqa = PDFAdapterqqa(parcelFileDescriptor!!, this@InfoActivityqqa)
            pageViewPager.adapter = pdfAdapterqqa

        }catch (e: Exception){
            pdfFile.delete()
        }
    }

    fun getFile() : File{
        val inputStream = assets.open("kniga-vse-o-kazino.pdf")
        return File(filesDir.absolutePath + "kniga-vse-o-kazino.pdf").apply {
            copyInputStreamToFile(inputStream)
        }
    }

    fun File.copyInputStreamToFile(inputStream: InputStream) {
        this.outputStream().use { fileOut ->
            inputStream.copyTo(fileOut)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        parcelFileDescriptor?.close()
        pdfAdapterqqa?.e8uvewyuiv()

    }
}