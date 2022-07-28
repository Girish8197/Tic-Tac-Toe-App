package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        play.setOnClickListener{
            if(player_one.text.isEmpty() || player_two.text.isEmpty()){
                Toast.makeText(this,"Enter Name",Toast.LENGTH_SHORT).show()
            }
            else
            {
                startActivity(
                    Intent(this,MainActivity2::class.java)
                    .putExtra("playerone",player_one.text.toString())
                    .putExtra("playertwo",player_two.text.toString())
                )
            }
        }
    }
}