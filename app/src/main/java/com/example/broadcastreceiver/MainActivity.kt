package com.example.broadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var airplaneModeReceiver: BroadcastReceiver? = null
    private var networkcheck:NetworkChech? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Instantiate the receiver
        airplaneModeReceiver = BroadcastReceiver();
        networkcheck = NetworkChech();



//         Register the receiver
        val intentFilter = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(airplaneModeReceiver, it)

        }

        val networkIntentFilter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        registerReceiver(networkcheck, networkIntentFilter)
    }

    override fun onPause() {
        super.onPause()
//        unregisterReceiver(airplaneModeReceiver)
    }
}