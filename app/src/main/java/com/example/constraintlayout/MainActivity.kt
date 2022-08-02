package com.example.constraintlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.constraintlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // If appears in red line, 1. didn't define in build.grade 2. didn't wrap the content using layout in activity_main.xml
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
//        val boxOne = findViewById<TextView>(R.id.boxOne)
//        val boxTwo = findViewById<TextView>(R.id.boxTwo)
//        val boxThree = findViewById<TextView>(R.id.boxThree)
//        val boxFour = findViewById<TextView>(R.id.boxFour)
//        val boxFive = findViewById<TextView>(R.id.boxFive)
//        val redButton = findViewById<Button>(R.id.red_button)
//        val greenButton = findViewById<Button>(R.id.green_button)
//        val yellowButton = findViewById<Button>(R.id.yellow_button)

        val clickables : List<View> =
            listOf(
                binding.boxOne, binding.boxTwo, binding.boxThree, binding.boxFour,binding.boxFive,
                binding.redButton, binding.greenButton, binding.yellowButton
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

            //Boxes using custom colors for background
            R.id.red_button -> binding.boxThree.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> binding.boxFour.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> binding.boxFive.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}