package com.mehdi.blockchainandroid.Application.Dagger.Modules;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule
{
    Application mApplication;
    private Context context;

    public AppModule(Application application) {
        mApplication = application;
        context = application.getApplicationContext();
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }


    @Provides
    @Singleton
    Context providesContext() {
        return context;
    }
}
