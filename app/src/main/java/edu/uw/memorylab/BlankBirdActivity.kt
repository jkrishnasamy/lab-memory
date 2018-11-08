package edu.uw.memorylab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class BlankBirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blank_bird)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
