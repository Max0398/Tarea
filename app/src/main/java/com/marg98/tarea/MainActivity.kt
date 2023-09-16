package com.marg98.tarea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TextView y EditText
        var num1=findViewById<EditText>(R.id.txtEditNum1)
        var num2=findViewById<EditText>(R.id.txtEditNum2)
        var result=findViewById<TextView>(R.id.txtResultado)


        //Botones
        val btnSuma=findViewById<Button>(R.id.btnMas)
        val btnResta=findViewById<Button>(R.id.btnMenos)
        val btnDivision= findViewById<Button>(R.id.btnDivision)
        val btnMultiplicacion= findViewById<Button>(R.id.btnMultiplicacion)
        val btnLimpiar= findViewById<Button>(R.id.btnLimpiar)
        //

        btnLimpiar.setOnClickListener(){
            num1.text.clear()
            num2.text.clear()
            result.text="0.0"

        }

        btnSuma.setOnClickListener(){
            var n1=num1.text.toString()
            var n2=num2.text.toString()
            if(n1.isNotEmpty() && n2.isNotEmpty()){
                var resultado=(n1.toDouble()+n2.toDouble())
                result.text="$resultado"
            }else{
                result.text="Error Un Campo Esta Vacio"
            }

        }

        btnDivision.setOnClickListener(){

            if(num1.text.isNotEmpty() && num2.text.isNotEmpty()){
                var n1=num1.text.toString().toDouble()
                var n2=num2.text.toString().toDouble()

                when{
                    n1<n2->{
                        result.textSize=25F
                        result.text="Valor 1 Debe Ser Mayor a Valor 2"
                    }
                    n1>n2->{
                        var resultado= n1/n2
                        result.text="$resultado"
                    }
                }
            }


        }

        btnMultiplicacion.setOnClickListener(){
            if(num1.text.isNotEmpty() && num2.text.isNotEmpty()) {
                var n1 = num1.text.toString().toDouble()
                var n2 = num2.text.toString().toDouble()
                result.text=(n1 * n2).toString()
            }
        }

        btnResta.setOnClickListener(){
            if(num1.text.isNotEmpty() && num2.text.isNotEmpty()) {
                var n1 = num1.text.toString().toDouble()
                var n2 = num2.text.toString().toDouble()
                result.text = (n1 - n2).toString()
            }
        }


    }
}