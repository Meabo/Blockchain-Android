package com.mehdi.blockchainandroid.Application.Dagger.Components;

import com.mehdi.blockchainandroid.Application.Dagger.Modules.AppModule;
import com.mehdi.blockchainandroid.Application.Dagger.Modules.NetworkModule;
import com.mehdi.blockchainandroid.Model.Services.NetworkService;
import com.mehdi.blockchainandroid.UI.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class, NetworkModule.class})
@Singleton
public interface AppComponent
{
    void inject(MainActivity activity);
    void inject (NetworkService networkService);
}