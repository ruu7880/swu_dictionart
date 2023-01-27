package com.example.wordbook.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.wordbook.databinding.ActivityMainBinding


class RegisterActivity : AppCompatActivity() {
    lateinit var registerBinding: ActivityMainBinding
    var DB:DBHelper?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        registerBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(registerBinding.root)
        DB = DBHelper(this)

        registerBinding.signin.setOnClickListener {
            val user = registerBinding.editID.text.toString()
            val pass = registerBinding.editPassword.text.toString()
            val repass = registerBinding.editPassword.text.toString()
            if (user == "" || pass == "" || repass == "") Toast.makeText(
                this@RegisterActivity,
                "회원번호를 전부 입력해주세요",
                Toast.LENGTH_SHORT
            ).show() else {
                if (pass == repass) {
                    val checkId = DB!!.checkUserid(user)
                    if (checkId == false) {
                        val insert = DB!!.insertData(user, pass)
                        if (insert == true) {
                            Toast.makeText(
                                this@RegisterActivity,
                                "가입되었습니다",
                                Toast.LENGTH_SHORT
                            ).show()
                            val intent = Intent(applicationContext, MainActivity::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(
                                this@RegisterActivity,
                                "비밀번호가 일치하지 않습니다",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    } else{
                        Toast.makeText(
                            this@RegisterActivity,
                            "이미 가입된 회원입니다",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } else {
                    Toast.makeText(
                        this@RegisterActivity,
                        "비밀번호가 일치하지 않습니다",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}