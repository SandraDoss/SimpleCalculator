package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etFirstNo: EditText=findViewById(R.id.etFirstNo)
        val etSecondNo: EditText=findViewById(R.id.etSecondNo)
        val etResult: EditText=findViewById(R.id.etResult)

        val btAdd: Button = findViewById(R.id.btAdd)
        val btSub: Button = findViewById(R.id.btSub)
        val btMul: Button = findViewById(R.id.btMul)
        val btDiv: Button = findViewById(R.id.btDiv)
        val btMod: Button = findViewById(R.id.btMod)

        btAdd.setOnClickListener{
            var firstNo = etFirstNo.text.toString().toInt()
            var secondNo = etSecondNo.text.toString().toInt()
            etResult.setText((firstNo + secondNo).toString())
        }

        btSub.setOnClickListener{
            var firstNo = etFirstNo.text.toString().toInt()
            var secondNo = etSecondNo.text.toString().toInt()
            etResult.setText((firstNo - secondNo).toString())

        }

        btMul.setOnClickListener{
            var firstNo = etFirstNo.text.toString().toInt()
            var secondNo = etSecondNo.text.toString().toInt()
            etResult.setText((firstNo * secondNo).toString())

        }

        btDiv.setOnClickListener{
            var firstNo = etFirstNo.text.toString().toInt()
            var secondNo = etSecondNo.text.toString().toInt()
            etResult.setText((firstNo / secondNo).toString())

        }

        btMod.setOnClickListener{
            var firstNo = etFirstNo.text.toString().toInt()
            var secondNo = etSecondNo.text.toString().toInt()
            etResult.setText((firstNo % secondNo).toString())

        }

    }
}