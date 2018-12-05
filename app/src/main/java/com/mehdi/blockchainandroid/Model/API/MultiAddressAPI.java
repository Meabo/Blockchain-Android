package com.mehdi.blockchainandroid.Model.API;

import com.mehdi.blockchainandroid.Model.POJOs.Transaction;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class MultiAddressAPI
{
    public interface ChaseService
    {
        // Put all API calls concerning Chases (games).
        @GET("games")
        Observable<List<Transaction>> getChasesList();

        @GET("games/{game_id}/chasers")
        Observable<List<Chaser>> getchasers(@Path("game_id") String game_id);

    }

    private ChaseService mChaseService;

    @Inject
    public ChasesAPI(@Named("RetrofitAPI") Retrofit retrofit)
    {
        mChaseService = retrofit.create(ChaseService.class);
    }


    public ChaseService getChaseService()
    {
        return this.mChaseService;
    }

}
