package com.mehdi.blockchainandroid.Application;

import android.app.Application;

import com.mehdi.blockchainandroid.Application.Dagger.Components.AppComponent;
import com.mehdi.blockchainandroid.Application.Dagger.Components.DaggerAppComponent;
import com.mehdi.blockchainandroid.Application.Dagger.Modules.AppModule;
import com.mehdi.blockchainandroid.Application.Dagger.Modules.NetworkModule;

public class BlockchainApplication  extends Application
{
    private AppComponent appComponent;

    public void onCreate()
    {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                // list of modules that are part of this component need to be created here too
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .build();
    }
}
