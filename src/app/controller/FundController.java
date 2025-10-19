package app.controller;

import app.entity.Account;
import app.exceptions.FundsException;
import app.model.impl.AccountManager;
import app.utils.formatters.*;
import app.view.FundOperationsView;

import static app.enums.OperationType.PURCHASE;
import static app.enums.OperationType.REFUND;
import static app.utils.Printer.println;
import static app.view.FundOperationsView.getCurrency;
import static app.view.FundOperationsView.getOperation;

public class FundController {

    public static Account createAccount() {
        println(new CurrencyTitleFormatter());
        var currency = getCurrency();
        println("Selected currency is: " + currency);
        return switch (currency) {
            case USD -> new Account(1000, currency);
            case EUR -> new Account(800, currency);
            case HRN -> new Account(42000, currency);
        };
    }

    public static void updateAccount(Account account) {
        println(new OperationTitleFormatter());
        try {
            switch (getOperation()) {
                case PURCHASE -> {
                    println("Selected operation is: " + PURCHASE);
                    purchase(account);
                    println(new OperationWithdrawResultFormatter(account));
                }
                case REFUND -> {
                    println("Selected operation is: " + REFUND);
                    refund(account);
                    println(new OperationDepositResultFormatter(account));
                }
            }
        } catch (FundsException fe) {
            println(fe.getMessage());
        }
    }

    public static void purchase(Account account) {
        println(new FundOperationsTitleFormatter(account));
        AccountManager.withdrawMoney(account, FundOperationsView.getAmount(), account.getCurrency());
    }

    public static void refund(Account account) {
        println(new FundOperationsTitleFormatter(account));
        AccountManager.depositMoney(account, FundOperationsView.getAmount(), account.getCurrency());
    }
}
