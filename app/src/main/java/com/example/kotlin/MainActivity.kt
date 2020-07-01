package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        touhBtn.setOnClickListener {

            //tohcBtn이 눌리면 실행될 코드를 적는{}

            //Toast를 이용해 사용자에게 안내 메세지.

            Toast.makeText(this, "터치버튼을 눟렀습니다", Toast.LENGTH_SHORT).show()

            Log.d("메인화면", "터치화면 눌림")

            Log.e("메인화면", "에러 로그 찍어보기")

        }
    }
}