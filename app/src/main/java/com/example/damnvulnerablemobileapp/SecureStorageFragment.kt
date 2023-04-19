package com.example.damnvulnerablemobileapp

import android.content.Context
import android.content.SharedPreferences

class SimpleStorage(context: Context) {

    private val sharedPreferences: SharedPreferences

    init {
        sharedPreferences = context.getSharedPreferences("simple_preferences", Context.MODE_PRIVATE)
    }

    fun saveCredentials(username: String, password: String) {
        sharedPreferences.edit().apply {
            putString("username", username)
            putString("password", password)
            apply()
        }
    }

    fun getCredentials(): Pair<String?, String?> {
        val username = sharedPreferences.getString("username", null)
        val password = sharedPreferences.getString("password", null)
        return Pair(username, password)
    }

}
