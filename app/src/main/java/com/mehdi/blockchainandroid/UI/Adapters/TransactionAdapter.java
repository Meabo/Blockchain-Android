package com.mehdi.blockchainandroid.UI.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.mehdi.blockchainandroid.Model.POJOs.Input;
import com.mehdi.blockchainandroid.Model.POJOs.Out;
import com.mehdi.blockchainandroid.Model.POJOs.Transaction;
import com.mehdi.blockchainandroid.Model.POJOs.Tx;
import com.mehdi.blockchainandroid.R;
import com.mehdi.blockchainandroid.Utils.ConverterBTC;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.ViewHolder>
{


    private ArrayList<Tx> Transactions_list;
    private Context context;

    public TransactionAdapter(Context c)
    {
        this.context = c;
        Transactions_list = new ArrayList<>();
    }

    public ArrayList<Tx> getTransactions_list() {
        return Transactions_list;
    }


    public void addTransactions(List<Tx> TransactionList)
    {
        Transactions_list.clear();
        Transactions_list.addAll(TransactionList);
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        // each data item is just a string in this case
        public TextView mTxHash;
        public TextView mTxTimeStamp;
        public TextView mTxFees;
        public Button mTxResult;
        public TextView mTxPrevOut;
        public TextView mTxOuts;



        public ViewHolder(View v) {
            super(v);
            mTxHash = (TextView) itemView
                    .findViewById(R.id.tx_hash);

            mTxTimeStamp = (TextView) itemView
                    .findViewById(R.id.tx_timestamp);

            mTxFees = (TextView) itemView
                    .findViewById(R.id.tx_fees);

            mTxResult = (Button) itemView
                    .findViewById(R.id.tx_result);


            mTxPrevOut = (TextView) itemView
                    .findViewById(R.id.tx_prev_out);

            mTxOuts = (TextView) itemView
                    .findViewById(R.id.tx_outs);

        }
    }

    @Override
    public TransactionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType)
    {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_transactions, parent, false);

        TransactionAdapter.ViewHolder holder = new TransactionAdapter.ViewHolder(v);
        return holder;
    }

    private String SetDate(int position)
    {
        long timestamp = (long) Transactions_list.get(position).getTime();
        //Date date = Date.from( Instant.ofEpochSecond( timestamp ) );

        Log.d("transactiondebug", timestamp + "");
        Date date = Date.from( Instant.ofEpochSecond( timestamp ) );

        String pattern = "yyyy-MM-dd hh:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.FRENCH);
        String strdate = simpleDateFormat.format(date);
        return strdate;
    }

    private String getPrevOuts(int position)
    {
        List<Input> inputs = Transactions_list.get(position).getInputs();
        String append = "";
        String new_line = "\n";
        for (Input input: inputs)
        {
            String address = input.getPrevOut().getAddr();
            append += address;
            append += new_line;
        }
        return append;
    }

    private String getOuts(int position)
    {
        List<Out> outs = Transactions_list.get(position).getOut();
        String append = "";
        String new_line = "\n";
        for (Out out: outs)
        {
            String address = out.getAddr();
            append += address;
            append += new_line;
        }
    return append;
    }


    @Override
    public void onBindViewHolder(TransactionAdapter.ViewHolder holder, int position) {

            holder.mTxHash.setText("Hash : " + Transactions_list.get(position).getHash());
            //String strDate =  DateFormat.getDateInstance().format(date);
            holder.mTxTimeStamp.setText(SetDate(position));

            String string_btc = " BTC";
            BigDecimal result = ConverterBTC.satoshiToBtc(Transactions_list.get(position).getResult());
            BigDecimal fees = ConverterBTC.satoshiToBtc(Transactions_list.get(position).getFee());


            if (result.doubleValue() < 0)
                holder.mTxResult.setBackgroundColor(0xFFFF0000);
            else
            {
                holder.mTxResult.setBackgroundColor(0xFF32CD32);
            }



            holder.mTxResult.setText(String.valueOf(result.doubleValue()) + string_btc);
            holder.mTxFees.setText("Fees : " + String.valueOf(fees.doubleValue()) + string_btc);
            holder.mTxPrevOut.setText(getPrevOuts(position));
            holder.mTxOuts.setText(getOuts(position));



    }
    @Override
    public int getItemCount() {
        return Transactions_list.size();
    }



}