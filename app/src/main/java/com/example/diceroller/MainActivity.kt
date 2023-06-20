package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val mainActivityView: LinearLayout = binding.root
        val diceButton: Button = binding.rollButton
        val diceImageView: ImageView = binding.actionImageVector

        diceButton.setText(R.string.letsRoll)
        diceButton.setOnClickListener {
            rollDice(diceImageView)
        }

        setContentView(mainActivityView)
    }

    private fun rollDice(diceImageView: ImageView) {

        val imageResource = when (
            Random.nextInt(1, 7)
        ) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImageView.setImageResource(imageResource)
    }
}