package edu.uw.memorylab

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById(R.id.btnBlank)!!.setOnClickListener { startActivity(Intent(this@MainActivity, BlankActivity::class.java)) }

        findViewById(R.id.btnProgress)!!.setOnClickListener { startActivity(Intent(this@MainActivity, ProgressActivity::class.java)) }

        findViewById(R.id.btnBird)!!.setOnClickListener { startActivity(Intent(this@MainActivity, BirdActivity::class.java)) }

    }
}
