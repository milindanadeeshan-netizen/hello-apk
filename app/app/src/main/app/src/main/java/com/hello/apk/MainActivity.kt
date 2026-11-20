package com.hello.apk
​import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
​class MainActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
val textView = TextView(this).apply {
text = "Hello! මගේ පළවෙනි App එක වැඩ!"
textSize = 24f
gravity = Gravity.CENTER
}
setContentView(textView)
}
}
