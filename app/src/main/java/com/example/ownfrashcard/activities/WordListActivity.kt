package com.example.ownfrashcard.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ownfrashcard.R
import com.example.ownfrashcard.const.Consts
import com.example.ownfrashcard.databinding.ActivityWordListBinding

class WordListActivity : AppCompatActivity() {
        private val TAG = this::class.java.simpleName
        private lateinit var building: ActivityWordListBinding

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)

                building = ActivityWordListBinding.inflate(layoutInflater)
                setContentView(building.root)

                initView()
        }

        private fun initView() {
                //背景色の設定
                Log.d(TAG,  "-----------${bgColorCode}")
                building.ConstraintLayoutWordList.setBackgroundResource(bgColorCode)

                building.buttonAddWord.setOnClickListener{
                        val intent = Intent(this, EditActivity::class.java).apply {
                                putExtra(Consts.IntentKey.KEY_EDIT_STATUS, getString(R.string.title_add_new_word))
                        }
                        startActivity(intent)
                }
                building.buttonBack.setOnClickListener { finish() }
        }

}