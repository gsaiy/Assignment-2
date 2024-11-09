package com.bank.exceptions;

public class depositexception extends Exception
{
    public depositexception()
    {
        super("Enter Valid Amount more than 0");
    }
}