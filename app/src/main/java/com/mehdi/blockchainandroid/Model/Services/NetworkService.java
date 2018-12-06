package com.mehdi.blockchainandroid.Model.Services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

import com.mehdi.blockchainandroid.Application.BlockchainApplication;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

public class NetworkService extends BroadcastReceiver
{
    //@Inject EventBus eventBus;

    @Override
    public void onReceive(Context context, Intent intent)
    {
        // Activity activity = (Activity) context;
        BlockchainApplication app = (BlockchainApplication) context.getApplicationContext();
        //app.getAppComponent().inject(this);

        try
        {
            if (isOnline(context))
            {
                Toast.makeText(context, "Network Available", Toast.LENGTH_LONG).show();

            } else {

                Toast.makeText(context, "Network Not Available" , Toast.LENGTH_LONG).show();

            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private boolean isOnline(Context context)
    {
        try
        {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = cm.getActiveNetworkInfo();
            return (netInfo != null && netInfo.isConnected());
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }
}