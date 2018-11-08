package edu.uw.memorylab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class BlankActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blank)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
