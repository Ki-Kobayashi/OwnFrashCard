package com.example.ownfrashcard.models

import io.realm.RealmObject

/**
 * Created by K.Kobayashi on 2022/03/01.
 */
open class Word: RealmObject {
        var strQuestion: String = ""
        var strAnswer: String =""
}