package app.validator;

import app.exceptions.FundsException;

public class InputValidator {

    public static boolean validateInputAmount(String inputAmount) {
        double amount;
        try {
            amount = Double.parseDouble(inputAmount);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input: amount must be a number. Please try again.");
            return false;
        }
        if (amount < 0) {
            try {
                throw new FundsException("Invalid input: amount can't be negative. Please try again.");
            } catch (FundsException ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        }
        return true;
    }
}
