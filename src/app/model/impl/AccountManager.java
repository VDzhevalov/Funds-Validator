package app.model.impl;

import app.entity.Account;
import app.enums.Currency;
import app.exceptions.FundsException;

import static app.validator.OperationValidator.isValidAmount;
import static app.validator.OperationValidator.isValidCurrency;

public class AccountManager {

    public static double withdrawMoney(Account account, double amount, Currency currency) throws FundsException {
        if (isValidCurrency(account, currency) && isValidAmount(account, amount)) {
            account.changeBalance(account.getBalance() - amount);
        }
        return account.getBalance();
    }

    public static double depositMoney(Account account, double amount, Currency currency) throws FundsException {
        if (isValidCurrency(account, currency)) {
            account.changeBalance(account.getBalance() + amount);
        }
        return account.getBalance();
    }
}
