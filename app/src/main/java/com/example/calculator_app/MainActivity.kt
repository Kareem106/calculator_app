package com.example.calculator_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.coroutines.coroutineContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val click=findViewById<Button>(R.id.Sum)
        val first=findViewById<TextView>(R.id.First_num)
        val second=findViewById<TextView>(R.id.Second_num)


        click.setOnClickListener {
            if (first.text.isEmpty() || second.text.isEmpty()) {
                Toast.makeText(baseContext, "there are an empty field !", Toast.LENGTH_SHORT).show()
            } else {
                var result: Double? = first.text.toString().toDouble() + second.text.toString().toDouble()
                Toast.makeText(baseContext, result.toString(), Toast.LENGTH_SHORT).show()
            }
        }

    }

}