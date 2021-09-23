package com.inflater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_display_message)

    findViewById<TextView>(R.id.textView).apply { text = intent.getStringExtra(EXTRA_MESSAGE) }
  }
}

