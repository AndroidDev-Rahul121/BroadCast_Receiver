package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastReceiver:BroadcastReceiver() {

 override fun onReceive(context: Context, intent: Intent) {
  if (intent.action == Intent.ACTION_AIRPLANE_MODE_CHANGED) {
   val isAirplaneModeOn = intent.getBooleanExtra("state", false)

//    Handle the airplane mode state change here
   if (isAirplaneModeOn) {
    // Airplane mode is turned on
    Toast.makeText(context, "Airplane mode is ON", Toast.LENGTH_SHORT).show()

   }
   else {
    // Airplane mode is turned off
    Toast.makeText(context, "Airplane mode is OFF", Toast.LENGTH_SHORT).show()

   }


  }
 }



}