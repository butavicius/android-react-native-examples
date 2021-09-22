package com.inflater

import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp

class InflaterViewManager : ViewGroupManager<ViewGroup>() {
  override fun getName() = "InflaterView"

  override fun createViewInstance(reactContext: ThemedReactContext): ViewGroup {
    val viewGroup =
      LayoutInflater.from(reactContext).inflate(R.layout.main_layout, null) as RelativeLayout
    val antras = viewGroup.findViewById<TextView>(R.id.textView2)

    val buton = viewGroup.findViewById<Button>(R.id.buton)

    buton.setOnClickListener { changeWord(antras) }
    return viewGroup;


  }

  fun changeWord(view: TextView): Unit {

    view.text = "Pakeicew"

  }

  @ReactProp(name = "color")
  fun setColor(view: ViewGroup, color: String) {
//    view.setBackgroundColor(Color.parseColor(color))

    Log.d("INFLATER", "Changin color")
  }
}
