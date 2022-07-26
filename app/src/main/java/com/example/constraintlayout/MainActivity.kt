package com.example.constraintlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val boxOne = findViewById<TextView>(R.id.boxOne)
        val boxTwo = findViewById<TextView>(R.id.boxTwo)
        val boxThree = findViewById<TextView>(R.id.boxThree)
        val boxFour = findViewById<TextView>(R.id.boxFour)
        val boxFive = findViewById<TextView>(R.id.boxFive)

        val clickables : List<View> =
            listOf(
                boxOne, boxTwo, boxThree, boxFour,boxFive
            )

        for(item in clickables){
            item.setOnClickListener{makeColored(it)} //instance of the view
        }
    }

    private fun makeColored(view: View){
        when(view.id){
            R.id.boxOne -> view.setBackgroundColor(Color.BLUE)
            R.id.boxTwo -> view.setBackgroundColor(Color.RED)
            R.id.boxThree -> view.setBackgroundColor(Color.GREEN)
            R.id.boxFour -> view.setBackgroundColor(Color.CYAN)
            R.id.boxFive -> view.setBackgroundColor(Color.MAGENTA)
        }
    }
}