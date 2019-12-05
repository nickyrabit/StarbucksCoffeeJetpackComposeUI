package com.nickyrabit.starbucks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme
/**
 *
 * Nicholaus Legnard
 *
 *  (+255) 685 097 713
 *
 *  nickyrabit@gmail.com
 *
 *  nicky@nickylegnard.com
 *
 *  Instagram : @nicktabit
 *  Twitter : @nngailo
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
            // This is the main screen
                CoffeeDashboard()
            }
        }
    }
}
