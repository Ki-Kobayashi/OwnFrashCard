package com.example.ownfrashcard

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
        private val TAG = this::class.java.simpleName
        private var mBgColorCode = 0


        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

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
                imageButtonTest.setOnClickListener { }
                imageButtonWordEdit.setOnClickListener { clickWordEditBtn() }

                buttonBgDark.setOnClickListener(this)
                buttonBgDarkBlue.setOnClickListener(this)
                buttonBgWhite.setOnClickListener(this)
                buttonBgPink.setOnClickListener(this)
                buttonBgGreen.setOnClickListener(this)
                buttonBgYellow.setOnClickListener(this)
        }


        private fun clickTestBtn() {
//                val intent = Intent(this@MainActivity, )
        }

        private fun clickWordEditBtn() {
                // ★TODO:applyを使用してスッキリと書く
                val intent = Intent(this, EditActivity::class.java).apply {
//                        putExtra(Consts.IntentKey.KEY_BG_COLOR, "someting")
                }
                startActivity(intent)
        }

        override fun onClick(v: View) {
//                TODO:背景色を変える処理
                val  btn = v as Button
                var intBgColor = 0
                when (btn) {
                        buttonBgDarkBlue -> intBgColor = R.color.bg_blue
                        buttonBgDark -> intBgColor = R.color.bg_dark
                        buttonBgWhite -> intBgColor = R.color.bg_white
                        buttonBgPink -> intBgColor = R.color.bg_pink
                        buttonBgGreen -> intBgColor = R.color.bg_green
                        buttonBgYellow -> intBgColor = R.color.bg_yellow
                }
                ConstraintLayoutMain.setBackgroundResource(intBgColor)
//                mBgColorCode = p0.background.
        }
}