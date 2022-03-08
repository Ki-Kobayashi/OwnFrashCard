package com.example.ownfrashcard.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ownfrashcard.R
import com.example.ownfrashcard.const.Consts
import com.example.ownfrashcard.databinding.ActivityMainBinding
import java.security.SecureRandom
import kotlin.random.Random

var bgColorCode = R.color.bg_white

class MainActivity : AppCompatActivity(), View.OnClickListener {
        private val TAG = this::class.java.simpleName
        private lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)

                binding = ActivityMainBinding.inflate(layoutInflater)
                setContentView(binding.root)
                initView()
        }

        override fun onResume() {
                super.onResume()
        }

        override fun onPause() {
                super.onPause()
        }

        /**
         * Viewの初期化
         */
        private fun initView() {

                for (i in 1..5) {
                        val rndSecNum = SecureRandom().nextInt(5)
                        Log.d(TAG, "----------${i}回目：${rndSecNum}")
                }

                binding.imageButtonTest.setOnClickListener { }
                binding.imageButtonWordEdit.setOnClickListener { clickWordEditBtn() }

                binding.buttonBgDark.setOnClickListener(this)
                binding.buttonBgDarkBlue.setOnClickListener(this)
                binding.buttonBgWhite.setOnClickListener(this)
                binding.buttonBgPink.setOnClickListener(this)
                binding.buttonBgGreen.setOnClickListener(this)
                binding.buttonBgYellow.setOnClickListener(this)
        }

        private fun clickWordEditBtn() {
                // ★TODO:applyを使用してスッキリと書く
                val intent = Intent(this, WordListActivity::class.java)
                startActivity(intent)
        }

        override fun onClick(v: View) {
//                TODO:背景色を変える処理
                val  btn = v as Button
//                var intBgColor = 0
                when (btn) {
                        binding.buttonBgDarkBlue -> bgColorCode = R.color.bg_blue
                        binding.buttonBgDark -> bgColorCode = R.color.bg_dark
                        binding.buttonBgWhite -> bgColorCode = R.color.bg_white
                        binding.buttonBgPink -> bgColorCode = R.color.bg_pink
                        binding.buttonBgGreen -> bgColorCode = R.color.bg_green
                        binding.buttonBgYellow -> bgColorCode = R.color.bg_yellow
                }
                binding.ConstraintLayoutMain.setBackgroundResource(bgColorCode)
//                mBgColorCode = p0.background.
        }
}