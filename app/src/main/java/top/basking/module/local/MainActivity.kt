package top.basking.module.local

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import top.basking.module.demo.DemoString

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val demoText = findViewById<TextView>(R.id.demoText);
        demoText.text = DemoString().a
    }
}