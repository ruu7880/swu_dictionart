package com.example.wordbook.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.wordbook.databinding.ActivityMainBinding
import com.example.wordbook.main.MainFragment

class MainActivity : AppCompatActivity() {
    lateinit var loginBinding: ActivityMainBinding
    var DB:DBHelper?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        loginBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(loginBinding.root)
        DB = DBHelper(this)

        loginBinding.loginbutton!!.setOnClickListener {
            val user = loginBinding.editID!!.text.toString()
            val pass = loginBinding.editPassword!!.text.toString()
            if (user ==""|| pass=="") Toast.makeText(
                this@MainActivity,
                "회원정보를 전부 입력해주세요",
                Toast.LENGTH_SHORT
            ).show() else{
                val checkUserpass = DB!!.checkUserid(user, pass)
                if (checkUserpass ==true){
                    Toast.makeText(this@MainActivity, "로그인 되었습니다", Toast.LENGTH_SHORT)
                        .show()
                    val intent = Intent(applicationContext, MainFragment::class.java)
                    startActivity(intent)
                }
                else {
                    Toast.makeText(this@MainActivity, "회원 정보가 존재하지 않습니다", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
        loginBinding.signin.setOnClickListener {
            val loginIntent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(loginIntent)
        }
    }
}