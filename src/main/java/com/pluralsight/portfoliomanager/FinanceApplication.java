package com.pluralsight.portfoliomanager;

import com.pluralsight.portfoliomanager.model.BankAccount;
import com.pluralsight.portfoliomanager.model.Valuable;
import com.pluralsight.portfoliomanager.model.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FinanceApplication {

    public static void main(String[] args) {
        House house = new House("Ranch house", new BigDecimal("325000.00"), 1998, 1850, 3);
        Gold gold = new Gold("Gold coins", new BigDecimal("12000.00"), 5.0);
        Jewelry ring = new Jewelry("Grandma's ring", new BigDecimal("2500.00"), 14.0);
        CreditCard card = new CreditCard(1245, "Tami", new BigDecimal("2500"));
        Portfolio portfolio = new Portfolio("NVIDIA", "Gabriel Ponce");
        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
        Valuable account2 = new BankAccount(456, "Gary", new BigDecimal("1500"));

        portfolio.add(house);
        portfolio.add(gold);
        portfolio.add(ring);
        portfolio.add(account1);
        portfolio.add(account2);
        portfolio.add(card);

        System.out.println(house.getName() + ": $" + house.getValue());
        System.out.println(gold.getName() + ": $" + gold.getValue());
        System.out.println(ring.getName() + ": $" + ring.getValue());

        account1.deposit(new BigDecimal("100"));
        // account2.deposit(new BigDecimal("100"))

        System.out.println(card.getName() + ": $" + card.getValue());
        System.out.println(account1.getName() + ": $" + account1.getBalance());
        System.out.println("Account: $" + account2.getValue());
        System.out.println("Total: $" + portfolio.getValue());
        System.out.println("Most Valuable: $" + portfolio.getMostValuable().getValue());
        System.out.println("Least Valuable: $" + portfolio.getLeastValuable().getValue());
    }
}
