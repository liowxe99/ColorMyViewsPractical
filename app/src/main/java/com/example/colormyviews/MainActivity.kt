package com.example.colormyviews

import android.annotation.SuppressLint
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
    @SuppressLint("ResourceType")
    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.image_one)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.image_two)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.image_three)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.image_four)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.image_five)
            R.id.constraint_layout -> view.setBackgroundColor(0xFF00FF00.toInt())
        }
    }
    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout
            )
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }

        }


    }
}
