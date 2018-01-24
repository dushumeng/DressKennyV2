package com.fcdream.kotlin.app.weather.bo

import android.content.Context
import android.widget.Toast

/**
 * Created by shmdu on 2018/1/24.
 */
open class Animal(name: String)

class Person(name: String, surname: String) : Animal(name) {
    val name: String = name
    var surname: String = surname
        get() = field.toUpperCase()
        set(value) {
            field = "Name:$value"
        }

    override fun toString(): String = name + surname
}

fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {

}