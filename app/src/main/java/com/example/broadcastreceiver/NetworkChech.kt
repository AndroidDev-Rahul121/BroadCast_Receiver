package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class NetworkChech:BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {

        if (isNetworkAvailable(context)) {
            // Internet connection is available
            Toast.makeText(context, "Internet connection is ON", Toast.LENGTH_SHORT).show()
        } else {
            // Internet connection is not available
            Toast.makeText(context, "Internet connection is OFF", Toast.LENGTH_SHORT).show()
        }
    }
}

private fun isNetworkAvailable(context: Context): Boolean {
    val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val networkInfo = connectivityManager.activeNetworkInfo
    return networkInfo != null && networkInfo.isConnected
}

