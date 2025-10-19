package app.validator;

import app.enums.Currency;
import app.enums.OperationType;
import app.exceptions.InputException;

public class InputValidator {

    public static boolean validateInputAmount(String inputAmount) throws InputException {
        double amount;
        try {
            amount = Double.parseDouble(inputAmount);
        } catch (NumberFormatException ex) {
            throw new InputException("amount must be a number.");
        }
        if (amount < 0) {
            throw new InputException("amount can't be negative.");
        }
        return true;
    }

    public static Currency validateInputCurrency(String inputCurrency) throws InputException {
        try {
            return Currency.values()[Integer.parseInt(inputCurrency) - 1];
        } catch (NumberFormatException | IndexOutOfBoundsException ex) {
            throw new InputException("currency must be a valid currency number.");
        }
    }

    public static OperationType validateOperationType(String operationType) throws InputException {
        try {
            return OperationType.values()[Integer.parseInt(operationType) - 1];
        } catch (NumberFormatException | IndexOutOfBoundsException ex) {
            throw new InputException("operation must be a valid operation number.");
        }
    }
}
