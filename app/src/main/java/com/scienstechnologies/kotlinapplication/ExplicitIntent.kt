package com.scienstechnologies.kotlinapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_explicit_intent.*

class ExplicitIntent : AppCompatActivity() {

    val id:Int = 10
    val language:String = "Android"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)
        button.setOnClickListener(){

            intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("id_value",id)
            intent.putExtra("language",language)
            startActivity(intent)

        }

    }
}
