package com.example.constraintlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
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
        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)

        val clickables : List<View> =
            listOf(
                boxOne, boxTwo, boxThree, boxFour,boxFive,
                redButton, greenButton, yellowButton
            )

        for(item in clickables){
            item.setOnClickListener{makeColored(it)} //instance of the view
        }
    }

    private fun makeColored(view: View){
        val boxThree = findViewById<TextView>(R.id.boxThree)
        val boxFour = findViewById<TextView>(R.id.boxFour)
        val boxFive = findViewById<TextView>(R.id.boxFive)

        when(view.id){
            R.id.boxOne -> view.setBackgroundColor(Color.BLUE)
            R.id.boxTwo -> view.setBackgroundColor(Color.RED)
            R.id.boxThree -> view.setBackgroundColor(Color.GREEN)
            R.id.boxFour -> view.setBackgroundColor(Color.CYAN)
            R.id.boxFive -> view.setBackgroundColor(Color.MAGENTA)

            //Boxes using custom colors for background
            R.id.red_button -> boxThree.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxFour.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFive.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}