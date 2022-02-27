package com.example.ownfrashcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ownfrashcard.const.Consts
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {
        private val TAG = EditActivity::class.java.simpleName
        private var mStatus = ""

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_edit)

                initView()
<<<<<<< HEAD
        }

        override fun onResume() {
                super.onResume()
        }

        override fun onPause() {
                super.onPause()
        }

=======
        }

        override fun onResume() {
                super.onResume()
        }

        override fun onPause() {
                super.onPause()
        }

>>>>>>> develop
        private fun initView() {
                ConstraintLayoutEdit.setBackgroundResource(bgColorCode)

                mStatus = intent.extras!!.getString(Consts.IntentKey.KEY_EDIT_STATUS)!!
                textViewStatus.text = mStatus

                imageButtonRegister.setOnClickListener{
                        if (mStatus == getString(R.string.title_add_new_word)){
                                addNewWord()
                        } else{
                                changeWord()
                        }

                }
        }

        private fun changeWord() {
<<<<<<< HEAD

        }

        private fun addNewWord() {

=======
                TODO("Not yet implemented")
        }

        private fun addNewWord() {
                TODO("Not yet implemented")
>>>>>>> develop
        }


}