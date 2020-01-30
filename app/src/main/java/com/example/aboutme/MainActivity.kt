package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        done_btn.setOnClickListener {
            var aka = nickName.text
            nickname_test.visibility = View.VISIBLE
            nickname_test.text = aka
            nickName.visibility = View.GONE
            done_btn.visibility = View.GONE
        }
    }
}
