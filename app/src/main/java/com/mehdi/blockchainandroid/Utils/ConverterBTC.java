package com.mehdi.blockchainandroid.Utils;

import android.util.Log;

import com.google.common.math.LongMath;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ConverterBTC
{
    public static final int SMALLEST_UNIT_EXPONENT = 8;
    private static final long COIN_VALUE = LongMath.pow(10, SMALLEST_UNIT_EXPONENT);

    public static final MathContext DEFAULT_CONTEXT = new MathContext(0, RoundingMode.UNNECESSARY);
    public static final int DEFAULT_SCALE = SMALLEST_UNIT_EXPONENT;
    public static final BigDecimal satoshiPerCoinDecimal = new BigDecimal(COIN_VALUE, DEFAULT_CONTEXT);

    public static BigDecimal satoshiToBtc(final long satoshi)
    {
        BigDecimal bdSatoshi = new BigDecimal(satoshi, DEFAULT_CONTEXT);
        BigDecimal bitcoin  =  bdSatoshi.divide(satoshiPerCoinDecimal, DEFAULT_SCALE, RoundingMode.UNNECESSARY);
        return bitcoin.setScale(8, RoundingMode.HALF_UP);
    }

}
