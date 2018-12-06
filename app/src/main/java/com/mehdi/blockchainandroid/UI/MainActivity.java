package com.mehdi.blockchainandroid.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.mehdi.blockchainandroid.Application.BlockchainApplication;
import com.mehdi.blockchainandroid.Model.Events.ErrorEvent;
import com.mehdi.blockchainandroid.Model.Events.TransactionEvent;
import com.mehdi.blockchainandroid.Model.POJOs.Transaction;
import com.mehdi.blockchainandroid.Presenter.MultiAddressPresenter;
import com.mehdi.blockchainandroid.R;
import com.mehdi.blockchainandroid.UI.Adapters.TransactionAdapter;
import com.mehdi.blockchainandroid.Utils.ConverterBTC;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.math.BigDecimal;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
{
    @Inject MultiAddressPresenter multiAddressPresenter;

    //Layout Bidings
    @BindView (R.id.xpub) TextView xpub;
    @BindView (R.id.number_transactions) TextView number_transactions;
    @BindView (R.id.total_received) TextView total_received;
    @BindView (R.id.final_balance) TextView final_balance;
    @BindView (R.id.recyclerView) RecyclerView mRecyclerView;

    //Adapter
    TransactionAdapter transactionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((BlockchainApplication) getApplication()).getAppComponent().inject(this);
        ButterKnife.bind(this);

        Init_API_Calls();
        Init_RecyclerView();
    }

    private void Init_API_Calls()
    {
        multiAddressPresenter.loadTransactionsFromAPI();
    }

    private void Init_RecyclerView()
    {
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        transactionAdapter = new TransactionAdapter(this);
        mRecyclerView.setAdapter(transactionAdapter);
    }

    @Override
    public void onStart()
    {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop()
    {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    private void updateView(Transaction transactions)
    {
        String string_btc = " BTC";
        xpub.setText(transactions.getAddresses().get(0).getAddress());
        number_transactions.setText(String.valueOf(transactions.getAddresses().get(0).getNTx()));

        BigDecimal total_received_btc = ConverterBTC.satoshiToBtc(transactions.getAddresses().get(0).getTotalReceived());
        total_received.setText(String.valueOf(total_received_btc.doubleValue()) + string_btc);

        BigDecimal final_balance_btc = ConverterBTC.satoshiToBtc(transactions.getAddresses().get(0).getFinalBalance());
        final_balance.setText(String.valueOf(final_balance_btc.doubleValue()) + string_btc);
    }

    @SuppressWarnings("unused")
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(TransactionEvent transactionEvent)
    {
        updateView(transactionEvent.getTransactions());
        transactionAdapter.addTransactions(transactionEvent.getTransactions().getTxs());
    }

    @SuppressWarnings("unused")
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(ErrorEvent errorEvent)
    {
       //
    }


}
