package app.entity;

import app.enums.Currency;

public class Account {
    private double balance;
    private final Currency currency;

    public Account(double balance, Currency currency) {
        this.balance = balance;
        this.currency = currency;
    }

    public Account() {
        this.balance = 1000.00;;
        this.currency = Currency.USD;
    }

    public double getBalance() {
        return balance; // Наявні кошти на рахунку
    }

    public void changeBalance(double difference) {
        balance = difference;
    }

    public Currency getCurrency() {
        return currency;
    }

}
