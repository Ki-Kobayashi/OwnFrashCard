package com.example.ownfrashcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ownfrashcard.const.Consts
import kotlinx.android.synthetic.main.activity_word_list.*

class WordListActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_word_list)

                initView()
        }

        private fun initView() {
                buttonAddWord.setOnClickListener{
                        val intent = Intent(this, EditActivity::class.java).apply {
                                putExtra(Consts.IntentKey.KEY_EDIT_STATUS, getString(R.string.title_add_new_word))
                        }
                        startActivity(intent)
                }
                buttonBack.setOnClickListener { finish() }
        }

}