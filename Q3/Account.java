package com;
import com.bank.BankingOperations;
import com.bank.exceptions.depositexception;
import com.bank.exceptions.withdrawalexception;
import java.util.Random;


public class Account implements BankingOperations{
    int balance;
    int accnum;
    public Account(int balance)
    {
        Random obj=new Random();
        accnum=obj.nextInt(1,80000);
        this.balance=balance;
    }
    public void deposit(int amt) throws depositexception
    {
        try{
            if(amt<0)
            {
                throw new depositexception();
            }
            else
            {
                balance+= amt;
            }
        }
        catch(depositexception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void withdraw(int amt) throws withdrawalexception, depositexception
    {
        try{
            if(amt > getbalance())
            {
                throw new withdrawalexception();
            }
            else if(amt<0)
            {
                throw new depositexception(); 
            }
            else
            {
                balance -= amt;
            }
        }
        catch(withdrawalexception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public int getbalance()
    {
        return balance;
    }
    public int getaccnum()
    {
        return accnum;
    }
    public void displayinfo()
    {
        System.out.println("Account Number : "+getaccnum());
        System.out.println("Balance : $"+getbalance());
    }
}
