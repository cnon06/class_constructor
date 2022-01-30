package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class sino ( var ad: String,var soyad: String)
{

    init
    {
        for (i in 1..10) println("index: "+i)

        println("Constructor içerisinden: "+ this.ad)
        println("Constructor içerisinden: "+ this.soyad)
    }

   // var ad=ad;
   // var soyad = soyad;

    fun bastir()
    {
        println("Adınız ve soyadınız: $ad $soyad")
    }


}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ad_soyad = sino("Sinan","ALAGÖZ")
        ad_soyad.bastir()
    }
}