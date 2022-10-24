package com.divyansh.cbsepercentcalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var subject1: EditText = findViewById(R.id.sub1)
        var subject2 : EditText = findViewById(R.id.sub2)
        var subject3 :EditText = findViewById(R.id.sub3)

        var subject4: EditText = this.findViewById(R.id.subj4)
        var subject5 : EditText = this.findViewById(R.id.subj5)

        var btn : Button = findViewById(R.id.btton)
        var result:TextView = findViewById(R.id.output)

        btn.setOnClickListener {
            if(subject1.text.toString().isEmpty() != true && subject2.text.toString().isEmpty() != true
                &&  subject3.text.toString().isEmpty() != true && subject4.text.toString().isEmpty() != true
                && subject5.text.toString().isEmpty() != true){

                var comput = ( subject1.text.toString().toInt() + subject2.text.toString().toInt() + subject3.text.toString().toInt()
                + subject4.text.toString().toInt() + subject5.text.toString().toInt()) / 5

                result.setText(comput.toString())


            }
            else{
                result.setText("please fill all input fields")
            }
        }


    }
}