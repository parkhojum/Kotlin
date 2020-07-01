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

            Log.e("메인화면", "에러 로그 찍어보기")}

            secondBtn.setOnClickListener {
                Toast.makeText(this, "둘째 버튼 눌림", Toast.LENGTH_SHORT).show()
                Log.d("메인화면", "둘째 버튼 눌림")



        }
        // 토스트띄우기 버튼이 눌리면
        showToastBtu.setOnClickListener {
            //EditText에 입력된 내용을 받자
            //대입값이 String이면 변수 타입도 자동으로 String으로 결정됨.
            val inputContent = inputcontentEdt.text.toString()

            Toast.makeText(this, inputContent, Toast.LENGTH_SHORT).show()




//            상수(val) 변수(var) 의 차이
//            val input : String
//            input = "테스트"
//            input = "테스트2"
//           var



            //10은 정수. 정수를 num1에 대입.=> num1은 Int로 결정
            // (예시)val num1 = 10
        }

        ageBtn.setOnClickListener {

            //입력한 나이를 Int로 저장하자.
            val inputAge = ageEdt.text.toString().toInt()

            //나이가 60이상이면 "어르신 입니다." 토스트
            if(inputAge >= 60) {
                Toast.makeText(this, "어르신 입니다.", Toast.LENGTH_SHORT).show()
            }

            //입력된 나이값ㅇ[ 따라 다른 처리 when
            when (inputAge){
                33 -> {Toast.makeText(this,"나랑 동갑이다", Toast.LENGTH_SHORT).show()}
                20-> {Toast.makeText(this,"스무살이다.", Toast.LENGTH_SHORT).show()}
//                in 10..19 -> {Toast.makeText(this,"10대다.", Toast.LENGTH_SHORT).show()}
                else -> {Toast.makeText(this, "아무해당 없는 나이", Toast.LENGTH_SHORT).show()}
            }
        }

    }
}