package com.mehdi.blockchainandroid.Presenter;

import android.util.Log;

import com.mehdi.blockchainandroid.Model.API.MultiAddressAPI;
import com.mehdi.blockchainandroid.Model.Events.ErrorEvent;
import com.mehdi.blockchainandroid.Model.Events.TransactionEvent;
import com.mehdi.blockchainandroid.Model.POJOs.Transaction;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MultiAddressPresenter
{

        public MultiAddressAPI multiAddressAPI;

        @Inject
        public MultiAddressPresenter(MultiAddressAPI multiAddressAPI) {
            this.multiAddressAPI = multiAddressAPI;
        }

        public void loadTransactionsFromAPI()
        {
            String key = "xpub6CfLQa8fLgtouvLxrb8EtvjbXfoC1yqzH6YbTJw4dP7srt523AhcMV8Uh4K3TWSHz9oDWmn9MuJogzdGU3ncxkBsAC9wFBLmFrWT9Ek81kQ";
            Observable<Transaction> transactionsObservable = multiAddressAPI.getMultiaddrService().getTransactions(key);


            transactionsObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers
                    .mainThread()).subscribe(new Observer<Transaction>() {
                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onNext(Transaction transactions)
                {
                    if (transactions == null) {
                        EventBus.getDefault().post(new ErrorEvent("Error fetching data, please check your internet connection"));
                    }
                    else
                    {
                        Log.d("transactiondebug", transactions.toString());
                        EventBus.getDefault().post(new TransactionEvent(transactions));
                    }

                }

                @Override
                public void onError(Throwable e)
                {

                    e.printStackTrace();
                }

                @Override
                public void onComplete() {

                }
            });
        }

        public MultiAddressAPI getMultiAddressAPI()
        {
            return multiAddressAPI;
        }

}
