package com.example.sloaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_month_calendar.*
import kotlinx.android.synthetic.main.activity_signin.*

class MonthCalendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_month_calendar)

        move_goal_module.setOnClickListener { // 목표관리 모듈
            val nextIntent = Intent(this, DailyCoachingActivity::class.java)
            startActivity(nextIntent) // 회원 가입창으로 전환
        }
    }
}