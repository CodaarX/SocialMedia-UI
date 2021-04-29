package com.decagon.userinterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Time

class MainActivity : AppCompatActivity() {
    /**
     * oncreate() call back method lunches when the application starts
     * it overrides the oncreate() method from the supper class
     * savedInstance state holds any data fro previous activity sessions if any
     * activity.main is set as view for the activity
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * switch1 listens fora click with setOnClick Listener
         * switch1 changes view to dark mode with AppCompactDeligate when clicked and attribute is set to isChecked
         * else activity is set to day mode
         */

        switch1.setOnClickListener {
           if(switch1.isChecked )
               AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
           else
               AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
}