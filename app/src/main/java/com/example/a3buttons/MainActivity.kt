package com.example.a3buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var ettost:EditText
    lateinit var ettext:EditText
    lateinit var etnew:EditText
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)
        button3=findViewById(R.id.button3)
        ettost=findViewById(R.id.ettost)
        ettext=findViewById(R.id.ettextview)
        etnew=findViewById(R.id.etnewactivity)
        textView=findViewById(R.id.textView)

        button.setOnClickListener {
            Toast.makeText(this,"${ettost.text}",Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener {
            textView.text=ettext.text
        }

        button3.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            intent.putExtra("input","${etnew.text}")
            startActivity(intent)
        }
    }
}