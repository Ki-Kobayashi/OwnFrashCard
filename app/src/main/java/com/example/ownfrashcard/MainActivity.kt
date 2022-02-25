package com.example.ownfrashcard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
        }

        private fun initView() {
                imageButtonTest.setOnClickListener { }
                imageButtonWordEdit.setOnClickListener { }
        }

        private fun clickTextBtn() {
                val intent = Intent(this::)
        }
}