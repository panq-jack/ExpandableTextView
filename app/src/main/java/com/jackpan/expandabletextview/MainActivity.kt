package com.jackpan.expandabletextview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.jackpan.sdk.expandabletextview.ExpandableTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val expandableTextView: ExpandableTextView = findViewById(R.id.expandableTextView)
        expandableTextView.changeListener = object : ExpandableTextView.ChangeListener {
            override fun onStateChange(state: ExpandableTextView.State) {
                Log.d("jp", "state: $state")
            }
        }
    }
}