package com.abdullahturkak.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun topla( vieW : View ){
        var a=editText.text.toString().toIntOrNull()
        var b=editText1.text.toString().toIntOrNull()
        if (a== null || b==null){
            label.text="Sayi Girmeyi Unutmayınız."

        }
        else {
            var sonuc = a+b
            label.text="sonuç:${sonuc}"
        }

    }

    fun tamamınıtopla( vieW : View ){

        var a=editText.text.toString().toIntOrNull()
        var b=editText1.text.toString().toIntOrNull()
        var sayi1 :Int = editText.text.toString().toInt()
        var sayi2 :Int = editText1.text.toString().toInt()
            var x = 1
        for(x in sayi1..sayi2+1){
            var sonuc1 = sayi1+x
            var sonuc: Int = sonuc1
            sayi1++
            println(sonuc)
            label.text="sonuç:${sonuc}"
        }

    }



    fun asalmı( vieW : View ){
        var sayi1=editText.text.toString().toIntOrNull()
        var sayi2=editText1.text.toString().toIntOrNull()
        if (sayi1== null || sayi2==null){
            sonucu.text="Sayi Girmeyi Unutmayınız."

        }
        else {
            var sonuc = sayi1+sayi2
            sonucu.text="sonuç:${sonuc}"
        }

    }


    fun cıkar ( vieW : View ){
        var a=editText.text.toString().toIntOrNull()
        var b=editText1.text.toString().toIntOrNull()
        if (a== null || b==null){
            sonucu.text="Sayi Girmeyi Unutmayınız."

        }
        else {
            var sonuc = a-b
            label.text="sonuç:${sonuc}"
        }

    }
    fun carp ( vieW : View ){
        var a=editText.text.toString().toDoubleOrNull()
        var b=editText1.text.toString().toDoubleOrNull()
        if (a== null || b==null){
            sonucu.text="Sayi Girmeyi Unutmayınız."

        }
        else {
            var sonuc = a*b
            label.text="sonuç:${sonuc}"
        }

    }
    fun bol ( vieW : View ){
        var a=editText.text.toString().toDoubleOrNull()
        var b=editText1.text.toString().toDoubleOrNull()
        if (a== null || b==null){
            sonucu.text="Sayi Girmeyi Unutmayınız."

        }
        else {
            var sonuc = a/b
            label.text="sonuç:${sonuc}"
        }
    }
}