package com.example.tictactoe

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    var turn: Boolean = false
    var count_one:Int = 0
    var count_two:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        playerone.text = intent.getStringExtra("playerone")
        playertwo.text = intent.getStringExtra("playertwo")

        clear.setOnClickListener {
            clear()
        }

        restart.setOnClickListener {
            if(count_one > count_two){
                Toast.makeText(this,playerone.text.toString()+" is the Winner",Toast.LENGTH_SHORT).show()
            }else
                if(count_one < count_two){
                    Toast.makeText(this,playertwo.text.toString()+" is the Winner",Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this,"Match drawed",Toast.LENGTH_SHORT).show()
                }
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        one.setOnClickListener {
            if(one.text == ""){
                if(turn == false){
                    one.text = "X"
                    turn = true
                }else{
                    one.text = "O"
                    turn = false
                }
            }
            if((one.text == "X" && two.text == "X" && three.text == "X")){
                one.setBackgroundColor(Color.parseColor("RED"))
                two.setBackgroundColor(Color.parseColor("RED"))
                three.setBackgroundColor(Color.parseColor("RED"))
                winner(one.text.toString())
            }else
                if((one.text == "X" && four.text == "X" && seven.text == "X")){
                    one.setBackgroundColor(Color.parseColor("RED"))
                    four.setBackgroundColor(Color.parseColor("RED"))
                    seven.setBackgroundColor(Color.parseColor("RED"))
                    winner(one.text.toString())
                }
                else
                    if((one.text == "X" && five.text == "X" && nine.text == "X")){
                        one.setBackgroundColor(Color.parseColor("RED"))
                        five.setBackgroundColor(Color.parseColor("RED"))
                        nine.setBackgroundColor(Color.parseColor("RED"))
                        winner(one.text.toString())
                    }

            if((one.text == "O" && two.text == "O" && three.text == "O")){
                one.setBackgroundColor(Color.parseColor("YELLOW"))
                two.setBackgroundColor(Color.parseColor("YELLOW"))
                three.setBackgroundColor(Color.parseColor("YELLOW"))
                winner(one.text.toString())
            }else
                if((one.text == "O" && four.text == "O" && seven.text == "O")){
                    one.setBackgroundColor(Color.parseColor("YELLOW"))
                    four.setBackgroundColor(Color.parseColor("YELLOW"))
                    seven.setBackgroundColor(Color.parseColor("YELLOW"))
                    winner(one.text.toString())
                }
                else
                    if((one.text == "O" && five.text == "O" && nine.text == "O")){
                        one.setBackgroundColor(Color.parseColor("YELLOW"))
                        five.setBackgroundColor(Color.parseColor("YELLOW"))
                        nine.setBackgroundColor(Color.parseColor("YELLOW"))
                        winner(one.text.toString())
                    }
        }

        two.setOnClickListener {
            if(two.text == ""){
                if(turn == false){
                    two.text = "X"
                    turn = true
                }else{
                    two.text = "O"
                    turn = false
                }
            }
            if((one.text == "X" && two.text == "X" && three.text == "X")){
                one.setBackgroundColor(Color.parseColor("RED"))
                two.setBackgroundColor(Color.parseColor("RED"))
                three.setBackgroundColor(Color.parseColor("RED"))
                winner(two.text.toString())
            } else
                if((two.text == "X" && five.text == "X" && eight.text == "X")){
                    two.setBackgroundColor(Color.parseColor("RED"))
                    five.setBackgroundColor(Color.parseColor("RED"))
                    eight.setBackgroundColor(Color.parseColor("RED"))
                    winner(two.text.toString())
                }
            if((one.text == "O" && two.text == "O" && three.text == "O")){
                one.setBackgroundColor(Color.parseColor("YELLOW"))
                two.setBackgroundColor(Color.parseColor("YELLOW"))
                three.setBackgroundColor(Color.parseColor("YELLOW"))
                winner(two.text.toString())
            } else
                if((two.text == "O" && five.text == "O" && eight.text == "O")){
                    two.setBackgroundColor(Color.parseColor("YELLOW"))
                    five.setBackgroundColor(Color.parseColor("YELLOW"))
                    eight.setBackgroundColor(Color.parseColor("YELLOW"))
                    winner(two.text.toString())
                }
        }
        three.setOnClickListener {
            if(three.text == ""){
                if(turn == false){
                    three.text = "X"
                    turn = true
                }else{
                    three.text = "O"
                    turn = false
                }
            }
            if((one.text == "X" && two.text == "X" && three.text == "X")){
                one.setBackgroundColor(Color.parseColor("RED"))
                two.setBackgroundColor(Color.parseColor("RED"))
                three.setBackgroundColor(Color.parseColor("RED"))
                winner(three.text.toString())
            }else
                if((nine.text == "X" && six.text == "X" && three.text == "X")){
                    nine.setBackgroundColor(Color.parseColor("RED"))
                    six.setBackgroundColor(Color.parseColor("RED"))
                    three.setBackgroundColor(Color.parseColor("RED"))
                    winner(three.text.toString())
                }
                else
                    if((three.text == "X" && five.text == "X" && seven.text == "X")){
                        three.setBackgroundColor(Color.parseColor("RED"))
                        five.setBackgroundColor(Color.parseColor("RED"))
                        seven.setBackgroundColor(Color.parseColor("RED"))
                        winner(three.text.toString())
                    }
            if((one.text == "O" && two.text == "O" && three.text == "O")){
                one.setBackgroundColor(Color.parseColor("YELLOW"))
                two.setBackgroundColor(Color.parseColor("YELLOW"))
                three.setBackgroundColor(Color.parseColor("YELLOW"))
                winner(three.text.toString())
            }else
                if((nine.text == "O" && six.text == "O" && three.text == "O")){
                    nine.setBackgroundColor(Color.parseColor("YELLOW"))
                    six.setBackgroundColor(Color.parseColor("YELLOW"))
                    three.setBackgroundColor(Color.parseColor("YELLOW"))
                    winner(three.text.toString())
                }
                else
                    if((three.text == "O" && five.text == "O" && seven.text == "O")){
                        three.setBackgroundColor(Color.parseColor("YELLOW"))
                        five.setBackgroundColor(Color.parseColor("YELLOW"))
                        seven.setBackgroundColor(Color.parseColor("YELLOW"))
                        winner(three.text.toString())
                    }
        }
        four.setOnClickListener {
            if(four.text == ""){
                if(turn == false){
                    four.text = "X"
                    turn = true
                }else{
                    four.text = "O"
                    turn = false
                }
            }
            if((four.text == "X" && five.text == "X" && six.text == "X")){
                four.setBackgroundColor(Color.parseColor("RED"))
                six.setBackgroundColor(Color.parseColor("RED"))
                five.setBackgroundColor(Color.parseColor("RED"))
                winner(four.text.toString())
            } else
                if((one.text == "X" && four.text == "X" && seven.text == "X")){
                    one.setBackgroundColor(Color.parseColor("RED"))
                    four.setBackgroundColor(Color.parseColor("RED"))
                    seven.setBackgroundColor(Color.parseColor("RED"))
                    winner(four.text.toString())
                }
            if((four.text == "O" && five.text == "O" && six.text == "O")){
                four.setBackgroundColor(Color.parseColor("YELLOW"))
                six.setBackgroundColor(Color.parseColor("YELLOW"))
                five.setBackgroundColor(Color.parseColor("YELLOW"))
                winner(four.text.toString())
            } else
                if((one.text == "O" && four.text == "O" && seven.text == "O")){
                    one.setBackgroundColor(Color.parseColor("YELLOW"))
                    four.setBackgroundColor(Color.parseColor("YELLOW"))
                    seven.setBackgroundColor(Color.parseColor("YELLOW"))
                    winner(four.text.toString())
                }
        }
        five.setOnClickListener {
            if(five.text == ""){
                if(turn == false){
                    five.text = "X"
                    turn = true
                }else{
                    five.text = "O"
                    turn = false
                }
            }
            if((one.text == "X" && five.text == "X" && nine.text == "X")){
                one.setBackgroundColor(Color.parseColor("RED"))
                five.setBackgroundColor(Color.parseColor("RED"))
                nine.setBackgroundColor(Color.parseColor("RED"))
                winner(five.text.toString())
            } else
                if((four.text == "X" && five.text == "X" && six.text == "X")){
                    four.setBackgroundColor(Color.parseColor("RED"))
                    six.setBackgroundColor(Color.parseColor("RED"))
                    five.setBackgroundColor(Color.parseColor("RED"))
                    winner(five.text.toString())
                } else
                    if((three.text == "X" && five.text == "X" && seven.text == "X")){
                        three.setBackgroundColor(Color.parseColor("RED"))
                        five.setBackgroundColor(Color.parseColor("RED"))
                        seven.setBackgroundColor(Color.parseColor("RED"))
                        winner(five.text.toString())
                    } else
                        if((two.text == "X" && five.text == "X" && eight.text == "X")){
                            two.setBackgroundColor(Color.parseColor("RED"))
                            five.setBackgroundColor(Color.parseColor("RED"))
                            eight.setBackgroundColor(Color.parseColor("RED"))
                            winner(five.text.toString())
                        }
            if((one.text == "O" && five.text == "O" && nine.text == "O")){
                one.setBackgroundColor(Color.parseColor("YELLOW"))
                five.setBackgroundColor(Color.parseColor("YELLOW"))
                nine.setBackgroundColor(Color.parseColor("YELLOW"))
                winner(five.text.toString())
            } else
                if((four.text == "O" && five.text == "O" && six.text == "O")){
                    four.setBackgroundColor(Color.parseColor("YELLOW"))
                    six.setBackgroundColor(Color.parseColor("YELLOW"))
                    five.setBackgroundColor(Color.parseColor("YELLOW"))
                    winner(five.text.toString())
                } else
                    if((three.text == "O" && five.text == "O" && seven.text == "O")){
                        three.setBackgroundColor(Color.parseColor("YELLOW"))
                        five.setBackgroundColor(Color.parseColor("YELLOW"))
                        seven.setBackgroundColor(Color.parseColor("YELLOW"))
                        winner(five.text.toString())
                    } else
                        if((two.text == "O" && five.text == "O" && eight.text == "O")){
                            two.setBackgroundColor(Color.parseColor("YELLOW"))
                            five.setBackgroundColor(Color.parseColor("YELLOW"))
                            eight.setBackgroundColor(Color.parseColor("YELLOW"))
                            winner(five.text.toString())
                        }



        }
        six.setOnClickListener {
            if(six.text == ""){
                if(turn == false){
                    six.text = "X"
                    turn = true
                }else{
                    six.text = "O"
                    turn = false
                }
            }
            if((three.text == "X" && six.text == "X" && nine.text == "X")){
                three.setBackgroundColor(Color.parseColor("RED"))
                six.setBackgroundColor(Color.parseColor("RED"))
                nine.setBackgroundColor(Color.parseColor("RED"))
                winner(six.text.toString())
            }else
                if((six.text == "X" && five.text == "X" && four.text == "X")){
                    six.setBackgroundColor(Color.parseColor("RED"))
                    five.setBackgroundColor(Color.parseColor("RED"))
                    four.setBackgroundColor(Color.parseColor("RED"))
                    winner(six.text.toString())
                }
            if((three.text == "O" && six.text == "O" && nine.text == "O")){
                three.setBackgroundColor(Color.parseColor("YELLOW"))
                six.setBackgroundColor(Color.parseColor("YELLOW"))
                nine.setBackgroundColor(Color.parseColor("YELLOW"))
                winner(six.text.toString())
            }else
                if((six.text == "O" && five.text == "O" && four.text == "O")){
                    six.setBackgroundColor(Color.parseColor("YELLOW"))
                    five.setBackgroundColor(Color.parseColor("YELLOW"))
                    four.setBackgroundColor(Color.parseColor("YELLOW"))
                    winner(six.text.toString())
                }
        }
        seven.setOnClickListener {
            if(seven.text == ""){
                if(turn == false){
                    seven.text = "X"
                    turn = true
                }else{
                    seven.text = "O"
                    turn = false
                }
            }
            if((one.text == "X" && four.text == "X" && seven.text == "X")){
                one.setBackgroundColor(Color.parseColor("RED"))
                four.setBackgroundColor(Color.parseColor("RED"))
                seven.setBackgroundColor(Color.parseColor("RED"))
                winner(seven.text.toString())
            }else
                if((seven.text == "X" && five.text == "X" && three.text == "X")){
                    seven.setBackgroundColor(Color.parseColor("RED"))
                    five.setBackgroundColor(Color.parseColor("RED"))
                    three.setBackgroundColor(Color.parseColor("RED"))
                    winner(seven.text.toString())
                }
                else
                    if((seven.text == "X" && eight.text == "X" && nine.text == "X")){
                        nine.setBackgroundColor(Color.parseColor("RED"))
                        eight.setBackgroundColor(Color.parseColor("RED"))
                        seven.setBackgroundColor(Color.parseColor("RED"))
                        winner(seven.text.toString())
                    }
            if((one.text == "O" && four.text == "O" && seven.text == "O")){
                one.setBackgroundColor(Color.parseColor("YELLOW"))
                four.setBackgroundColor(Color.parseColor("YELLOW"))
                seven.setBackgroundColor(Color.parseColor("YELLOW"))
                winner(seven.text.toString())
            }else
                if((seven.text == "O" && five.text == "O" && three.text == "O")){
                    seven.setBackgroundColor(Color.parseColor("YELLOW"))
                    five.setBackgroundColor(Color.parseColor("YELLOW"))
                    three.setBackgroundColor(Color.parseColor("YELLOW"))
                    winner(seven.text.toString())
                }
                else
                    if((eight.text == "O" && nine.text == "O" && seven.text == "O")){
                        nine.setBackgroundColor(Color.parseColor("YELLOW"))
                        eight.setBackgroundColor(Color.parseColor("YELLOW"))
                        seven.setBackgroundColor(Color.parseColor("YELLOW"))
                        winner(seven.text.toString())
                    }
        }
        eight.setOnClickListener {
            if(eight.text == ""){
                if(turn == false){
                    eight.text = "X"
                    turn = true
                }else{
                    eight.text = "O"
                    turn = false
                }
            }
            if((eight.text == "X" && five.text == "X" && two.text == "X")){
                two.setBackgroundColor(Color.parseColor("RED"))
                eight.setBackgroundColor(Color.parseColor("RED"))
                five.setBackgroundColor(Color.parseColor("RED"))
                winner(eight.text.toString())
            }else
                if((seven.text == "X" && eight.text == "X" && nine.text == "X")){
                    seven.setBackgroundColor(Color.parseColor("RED"))
                    eight.setBackgroundColor(Color.parseColor("RED"))
                    nine.setBackgroundColor(Color.parseColor("RED"))
                    winner(eight.text.toString())
                }
            if((eight.text == "O" && five.text == "O" && two.text == "O")){
                two.setBackgroundColor(Color.parseColor("YELLOW"))
                eight.setBackgroundColor(Color.parseColor("YELLOW"))
                five.setBackgroundColor(Color.parseColor("YELLOW"))
                winner(eight.text.toString())
            }else
                if((seven.text == "O" && eight.text == "O" && nine.text == "O")){
                    seven.setBackgroundColor(Color.parseColor("YELLOW"))
                    eight.setBackgroundColor(Color.parseColor("YELLOW"))
                    nine.setBackgroundColor(Color.parseColor("YELLOW"))
                    winner(eight.text.toString())
                }
        }
        nine.setOnClickListener {
            if(nine.text == ""){
                if(turn == false){
                    nine.text = "X"
                    turn = true
                }else{
                    nine.text = "O"
                    turn = false
                }
            }
            if((one.text == "X" && five.text == "X" && nine.text == "X")){
                one.setBackgroundColor(Color.parseColor("RED"))
                five.setBackgroundColor(Color.parseColor("RED"))
                nine.setBackgroundColor(Color.parseColor("RED"))
                winner(nine.text.toString())
            }else
                if((seven.text == "X" && eight.text == "X" && nine.text == "X")){
                    seven.setBackgroundColor(Color.parseColor("RED"))
                    eight.setBackgroundColor(Color.parseColor("RED"))
                    nine.setBackgroundColor(Color.parseColor("RED"))
                    winner(nine.text.toString())
                }
                else
                    if((three.text == "X" && six.text == "X" && nine.text == "X")){
                        nine.setBackgroundColor(Color.parseColor("RED"))
                        three.setBackgroundColor(Color.parseColor("RED"))
                        six.setBackgroundColor(Color.parseColor("RED"))
                        winner(nine.text.toString())
                    }
            if((one.text == "O" && five.text == "O" && nine.text == "O")){
                one.setBackgroundColor(Color.parseColor("YELLOW"))
                five.setBackgroundColor(Color.parseColor("YELLOW"))
                nine.setBackgroundColor(Color.parseColor("YELLOW"))
                winner(nine.text.toString())
            }else
                if((seven.text == "O" && eight.text == "O" && nine.text == "O")){
                    seven.setBackgroundColor(Color.parseColor("YELLOW"))
                    eight.setBackgroundColor(Color.parseColor("YELLOW"))
                    nine.setBackgroundColor(Color.parseColor("YELLOW"))
                    winner(nine.text.toString())
                }
                else
                    if((three.text == "O" && six.text == "O" && nine.text == "O")){
                        nine.setBackgroundColor(Color.parseColor("YELLOW"))
                        three.setBackgroundColor(Color.parseColor("YELLOW"))
                        six.setBackgroundColor(Color.parseColor("YELLOW"))
                        winner(nine.text.toString())
                    }
        }
    }
    private fun winner(name:String){
        if(name == "X"){
            Toast.makeText(this,playerone.text.toString()+" is the Winner", Toast.LENGTH_SHORT).show()
            count_one+=1
            count1.text = count_one.toString()
        }else{
            Toast.makeText(this,playertwo.text.toString()+" is the Winner", Toast.LENGTH_SHORT).show()
            count_two+=1
            count2.text = count_two.toString()
        }
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            clear()
        },2500)
    }
    private fun clear(){
        one.text = ""
        two.text = ""
        three.text = ""
        four.text = ""
        five.text = ""
        six.text = ""
        seven.text = ""
        eight.text = ""
        nine.text = ""
        one.setBackgroundColor(Color.parseColor("PURPLE"))
        two.setBackgroundColor(Color.parseColor("PURPLE"))
        three.setBackgroundColor(Color.parseColor("PURPLE"))
        four.setBackgroundColor(Color.parseColor("PURPLE"))
        five.setBackgroundColor(Color.parseColor("PURPLE"))
        six.setBackgroundColor(Color.parseColor("PURPLE"))
        seven.setBackgroundColor(Color.parseColor("PURPLE"))
        eight.setBackgroundColor(Color.parseColor("PURPLE"))
        nine.setBackgroundColor(Color.parseColor("PURPLE"))
    }
}