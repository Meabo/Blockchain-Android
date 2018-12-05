package com.mehdi.blockchainandroid.Application.Dagger.Modules;

import com.mehdi.blockchainandroid.Model.API.MultiAddressAPI;
import com.mehdi.blockchainandroid.Utils.Constants;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


@Module
public class NetworkModule
{

    @Provides
    @Named("apiUrl")
    String provideApiUrl() {
        return Constants.url_api;
    }


    @Provides
    @Singleton
    @Named("RetrofitAPI")
    Retrofit providesRetrofitBuilderAPI(@Named("apiUrl") String apiUrl)
    {
        return new Retrofit.Builder()
                .baseUrl(apiUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    @Provides
    @Singleton
    MultiAddressAPI provideMultiAddressAPI(@Named("RetrofitAPI") Retrofit retrofit)
    {
        return new MultiAddressAPI(retrofit);
    }


}
