package com.example.my_coffee_shop

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    protected fun setupBottomNavigation(currentActivity: AppCompatActivity) {
        val navHome = findViewById<LinearLayout>(R.id.nav_home)
        val navSearch = findViewById<LinearLayout>(R.id.nav_search)
        val navNotifications = findViewById<LinearLayout>(R.id.nav_notifications)
        val navFavorites = findViewById<LinearLayout>(R.id.nav_favorites)
        val navProfile = findViewById<LinearLayout>(R.id.nav_profile)

        navHome?.setOnClickListener {
            if (currentActivity !is MainActivity9) {
                startActivity(Intent(this, MainActivity9::class.java))
                finish()
            }
        }
        navSearch?.setOnClickListener {
            if (currentActivity !is MainActivity11) {
                startActivity(Intent(this, MainActivity11::class.java))
                finish()
            }
        }
        navNotifications?.setOnClickListener {
            if (currentActivity !is MainActivity12) {
                startActivity(Intent(this, MainActivity12::class.java))
                finish()
            }
        }
        navFavorites?.setOnClickListener {
            if (currentActivity !is MainActivity13) {
                startActivity(Intent(this, MainActivity13::class.java))
                finish()
            }
        }
        navProfile?.setOnClickListener {
            if (currentActivity !is MainActivity14) {
                startActivity(Intent(this, MainActivity14::class.java))
                finish()
            }
        }
    }
}
