package com.mehdi.blockchainandroid.Model.API;

import com.mehdi.blockchainandroid.Model.POJOs.Transaction;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Observable;


import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class MultiAddressAPI
{
    public interface MultiaddrService
    {
        // Put all API calls concerning Chases (games).
        @GET("multiaddr")
        Observable<List<Transaction>> getTransactions(@Query("active") String xpub);

    }

    private MultiaddrService multiaddrService;

    @Inject
    public MultiAddressAPI(@Named("RetrofitAPI") Retrofit retrofit)
    {
        multiaddrService = retrofit.create(MultiaddrService.class);
    }


    public MultiaddrService getChaseService()
    {
        return this.multiaddrService;
    }

}
