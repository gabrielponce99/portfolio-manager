package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

// A credit card's balance is how much you owe.
public class CreditCard extends Account {

    public CreditCard(int accountNumber, String name, BigDecimal balance) {
        super(accountNumber, name, balance);
    }

    public void charge(BigDecimal amount) {
        BigDecimal newBalance = getBalance().add(amount);
        setBalance(newBalance);
    }

    public void pay(BigDecimal amount) {
        BigDecimal newBalance = getBalance().subtract(amount);
        setBalance(newBalance);

    }

    @Override
    public BigDecimal getValue() {
        return getBalance().negate();
    }

}
