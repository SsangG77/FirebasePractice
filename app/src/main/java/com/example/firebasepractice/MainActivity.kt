package com.example.firebasepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var auth:FirebaseAuth
    private lateinit var reference:DatabaseReference //실시간데이터베이스
    private lateinit var nickname:EditText
    private lateinit var loginBtn:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val auth = FirebaseAuth.getInstance()
        val reference = FirebaseDatabase.getInstance().reference

        var nickname = findViewById<EditText>(R.id.et)
        var loginBtn = findViewById<Button>(R.id.login_btn)

        loginBtn.setOnClickListener {
            //사용자가 입력한 텍스트를 변수에 담는다.
            var nickname_txt = nickname.text.toString()
        }
    }
}