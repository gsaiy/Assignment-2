package com;

public class SavingsAccount extends Account
{
    String acctype;
    public SavingsAccount(int bal)
    {
        super(bal);
        acctype="Savings";
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