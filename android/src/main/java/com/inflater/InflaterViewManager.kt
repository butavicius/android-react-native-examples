package com.inflater

import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp

const val EXTRA_MESSAGE = "Pabandykim is naujo"

class InflaterViewManager : ViewGroupManager<ViewGroup>() {
  override fun getName() = "InflaterView"
  private lateinit var context: ThemedReactContext

  override fun createViewInstance(reactContext: ThemedReactContext): ViewGroup {
    context = reactContext;
    val viewGroup =
      LayoutInflater.from(reactContext).inflate(R.layout.main_layout, null) as RelativeLayout

    val someTextView = viewGroup.findViewById<TextView>(R.id.textView2)
    val button = viewGroup.findViewById<Button>(R.id.buton)

    button.setOnClickListener { changeWord(someTextView) }
    return viewGroup;
  }

  fun changeWord(view: TextView): Unit {
    view.text = "I changed text"
    val intent = Intent(context, DisplayMessageActivity::class.java).apply {
      putExtra(EXTRA_MESSAGE, "Vat ir šitkaip va ir nahei")
    }
    startActivity(context, intent, null)
  }

  @ReactProp(name = "color")
  fun setColor(view: ViewGroup, color: String) {
    //Do something with prop
  }
}
