package com.dev.utils.uploaddemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dev.utils.network.DemoNetworkActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this, DemoNetworkActivity::class.java))
    }
}
