package com.orewjgbioerbj.view

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.os.ParcelFileDescriptor
import android.view.View
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.isVisible
import androidx.viewpager2.widget.ViewPager2
import com.orewjgbioerbj.pdf.PDFAdaptereee
import com.orewjgbioerbj.R
import com.orewjgbioerbj.databinding.PdfActivityqqaBinding
import com.orewjgbioerbj.db.SheredPreference
import java.io.File
import java.io.InputStream


class InfoActivityeee : AppCompatActivity() {
    lateinit var eug9iurgio: ViewPager2
    var reuwgiourwo: ParcelFileDescriptor? = null
    var rsgurwg: PDFAdaptereee? = null
    lateinit var binding: PdfActivityqqaBinding
    private var egirwe0giw:Long = 0

    override fun onBackPressed() {
        if (egirwe0giw+2000 > System.currentTimeMillis()) {
            super.onBackPressed()
        } else {
            Toast.makeText(getBaseContext(), "Press the back button twice to exit", Toast.LENGTH_SHORT).show();
        }
        egirwe0giw = System.currentTimeMillis()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PdfActivityqqaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.CVgoTestwqwqlok.setOnClickListener {
            startActivity(Intent(this, TestActivityeee::class.java))
        }

        if(SheredPreference(this).get()){
           binding.CVgoTestwqwqlok.isVisible = false
            SheredPreference(this).set(false)
        }else{
            binding.FLWelkomTutorial.isVisible = false
            binding.CVgoTestwqwqlok.isVisible = true
        }

        binding.IVsendwqwqlok.setOnClickListener{
            val browserIntent: Intent= Intent(Intent.ACTION_VIEW, Uri
                .parse("https://casino.ru/wp-content/uploads/kazino_style.pdf"));
            startActivity(browserIntent)
        }



        window.apply {
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            statusBarColor = Color.TRANSPARENT
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        eug9iurgio = findViewById(R.id.pageViewPagerwqwqlok)

        with(eug9iurgio) {
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 3
        }


        val aewfwuawe98f = resources.getDimensionPixelOffset(R.dimen.pageMargin)
        val weay9fyea = resources.getDimensionPixelOffset(R.dimen.offset)



        eug9iurgio.setPageTransformer { page, position ->
            val waeufjwou = page.parent.parent as ViewPager2
            val eaug9uea = position * -(2 * weay9fyea + aewfwuawe98f)
            if (waeufjwou.orientation == ViewPager2.ORIENTATION_HORIZONTAL) {
                if (ViewCompat.getLayoutDirection(waeufjwou) == ViewCompat.LAYOUT_DIRECTION_RTL) {
                    page.translationX = -eaug9uea
                } else {
                    page.translationX = eaug9uea
                }
            } else {
                page.translationY = eaug9uea
            }
        }

        euas9gvuea(getFile())

    }


    fun euas9gvuea(pdfFile : File){
        try {
            eug9iurgio.visibility = View.VISIBLE
            binding.baseProgressBarwqwqlok.visibility = View.GONE

            reuwgiourwo = ParcelFileDescriptor.open(pdfFile, ParcelFileDescriptor.MODE_READ_ONLY)
            rsgurwg = PDFAdaptereee(reuwgiourwo!!, this@InfoActivityeee)
            eug9iurgio.adapter = rsgurwg

        }catch (e: Exception){
            pdfFile.delete()
        }
    }

    fun getFile() : File{
        val ewhifge = assets.open("kazino_style.pdf")
        return File(filesDir.absolutePath + "kazino_style.pdf").apply {
            efueif(ewhifge)
        }
    }

    fun File.efueif(inputStream: InputStream) {
        this.outputStream().use { fileOut ->
            inputStream.copyTo(fileOut)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        reuwgiourwo?.close()
        rsgurwg?.weaufyhef()

    }
}