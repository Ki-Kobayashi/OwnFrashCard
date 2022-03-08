package com.example.ownfrashcard.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ownfrashcard.R
import com.example.ownfrashcard.const.Consts
import com.example.ownfrashcard.databinding.ActivityEditBinding
import com.example.ownfrashcard.models.Word
import io.realm.Realm
import io.realm.RealmConfiguration

class EditActivity : AppCompatActivity() {
        private val TAG = EditActivity::class.java.simpleName
        private lateinit var building: ActivityEditBinding

//        private lateinit var mRealm: Realm
        private var mStatus = ""

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)

                building = ActivityEditBinding.inflate(layoutInflater)
                setContentView(building.root)

                initView()
        }

        override fun onResume() {
                super.onResume()
                val realmConf = RealmConfiguration.Builder()
                        .schema(setOf(Word::class))
                        .build()
//                mRealm = Realm.open(realmConf)
        }

        override fun onPause() {
                super.onPause()
//                mRealm.close()
        }

        private fun initView() {
                building.ConstraintLayoutEdit.setBackgroundResource(bgColorCode)

                mStatus = intent.extras!!.getString(Consts.IntentKey.KEY_EDIT_STATUS)!!
                building.textViewStatus.text = mStatus

                building.imageButtonRegister.setOnClickListener {
                        if (mStatus == getString(R.string.title_add_new_word)) {
                                addNewWord()
                        } else {
                                changeWord()
                        }

                }
        }

        private fun changeWord() {
                TODO("Not yet implemented")
        }

        private fun addNewWord() {
//                mRealm.writeBlocking {
//                        copyToRealm(Word().apply {
//                                strQuestion = editTextQuestion.text.toString()
//                                strAnswer = editTextAnswer.text.toString()
//                        })
//                }
        }


}