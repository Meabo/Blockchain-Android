package com.mehdi.blockchainandroid.Model.Events;

public class ErrorEvent
{
    String error;
    public ErrorEvent(String e)
    {
        error = e;
    }
    public String getError()
    {
        return error;
    }
}
