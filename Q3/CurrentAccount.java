package com;


public class CurrentAccount extends Account
{
    String acctype;
    public CurrentAccount(int bal)
    {
        super(bal);
        acctype="Current";
    }
    public String getacctype()
    {
        return acctype;
    }
    public void displayinfo()
    {
        System.out.println("Account Number : "+getaccnum());
        System.out.println("Balance : $"+getbalance());
        System.out.println("Account type "+getacctype());
    }
}