package com.scienstechnologies.kotlinapplication

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle:Bundle = intent.extras
        val id = bundle.get("id_value")
        val language = bundle.get("language")
        Log.d("stringValue", language.toString())
        Toast.makeText(applicationContext,id.toString()+" "+language,Toast.LENGTH_LONG).show()

         button2.setOnClickListener(){
            /* intent = Intent(this,ExplicitIntent::class.java)
             startActivity(intent)*/

             intent = Intent(Intent.ACTION_VIEW)
             intent.setData(Uri.parse("https://www.javatpoint.com/"))
             startActivity(intent)




         }

    }
}
