package com.himanshu.myrelativelayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.himanshu.myrelativelayout.R

class MainActivity : AppCompatActivity() {
    //variable declaration started
    var tvNumber: TextView? = null
    var btnPlus: Button? = null
    var btnMinus: Button? = null
    var btnMul: Button? = null
    var btnDiv: Button? = null
    var number = 0
    lateinit var etInputNum: EditText
    var btnClear: Button? = null
    var btnOk: Button? = null

    //variable declaration ended

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNumber = findViewById(R.id.tvNumber)
        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnMinus)
        btnMul = findViewById(R.id.btnMul)
        btnDiv = findViewById(R.id.btnDiv)
        etInputNum = findViewById(R.id.etInputNum)
        btnClear = findViewById(R.id.btnClear)
        btnOk = findViewById(R.id.btnOk)


        btnPlus?.setOnClickListener {
            number += 2
            tvNumber?.text = number.toString()
        }
        btnMinus?.setOnClickListener {
            number -= 2
            tvNumber?.text = number.toString()
        }
        btnMul?.setOnClickListener {
            number *= 2
            tvNumber?.text = number.toString()
        }
        btnDiv?.setOnClickListener {
            number /= 2
            tvNumber?.text = number.toString()
        }
        /*btnOk?.setOnClickListener {
            var intent= Intent(this, MainActivity::class.java)
            intent.putExtra("number",etInputNum?.text.toString())
        }*/
        btnOk?.setOnClickListener {
            number = Integer.parseInt(etInputNum.text.toString())
            /* val text= etInputNum.toString()
             val numValue= text.toInt()
             tvNumber?.text= numValue.toString()
             println(number)
             */
            tvNumber?.text = (etInputNum.text.toString().toInt()).toString()
        }
        btnClear?.setOnClickListener {
            //var intent= Intent(this,MainActivity::class.java)
            tvNumber?.text = 0.toString()
            number = 0
           etInputNum?.text= Editable.Factory.getInstance().newEditable("")
            /*startActivity(intent)
            finish()*/
        }
    }
}