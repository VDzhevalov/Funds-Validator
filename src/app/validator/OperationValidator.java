package app.validator;

import app.enums.Currency;
import app.exceptions.FundsException;
import app.entity.Account;

public class OperationValidator {

    // Валідація валюти
    public static boolean isValidCurrency(Account account,Currency currency) throws FundsException {
        if (account.getCurrency() != currency) {
            throw new FundsException("Currencies do not match");
        }
        return true;
    }

    // Валідація наявних коштів
    public static boolean isValidAmount(Account account, double withdrawal) throws FundsException {
        if (withdrawal > account.getBalance()) {
            throw new FundsException("Insufficient funds!");
        }
        return true;
    }
}
