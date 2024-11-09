package com.bank.exceptions;

public class withdrawalexception extends Exception
{
    public withdrawalexception()
    {
        super("Enter Valid Value less than balance in account");
    }
}