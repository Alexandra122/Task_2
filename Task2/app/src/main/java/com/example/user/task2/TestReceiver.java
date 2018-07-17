package com.example.user.task2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.Log;
import android.widget.Toast;

public class TestReceiver extends BroadcastReceiver {
    public TestReceiver(){

}

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("API123",""+intent.getAction());

        if(intent.getAction().equals("com.example.user.task2.CUSTOM_INTENT"))
            Toast.makeText(context, "Bine ati venit!", Toast.LENGTH_LONG).show();




    }}


