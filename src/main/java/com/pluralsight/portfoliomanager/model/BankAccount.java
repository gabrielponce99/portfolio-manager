package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

public class BankAccount extends Account {

    public BankAccount(int accountNumber, String name, BigDecimal balance) {
        super(accountNumber, name, balance);
    }

    public void deposit(BigDecimal amount) {
        BigDecimal addAmount = getBalance().add(amount);
        setBalance(addAmount);
    }

    public void withdraw(BigDecimal amount) {
        BigDecimal subtractAmount = getBalance().subtract(amount);
        setBalance(subtractAmount);
    }
}
