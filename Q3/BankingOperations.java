package com.bank;

import com.bank.exceptions.*;

public interface BankingOperations {
    public void deposit(int amt) throws depositexception;

    public void withdraw(int amt) throws withdrawalexception, depositexception;

    public int getbalance();
}