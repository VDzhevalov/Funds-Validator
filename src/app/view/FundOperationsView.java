package app.view;

import app.enums.Currency;
import app.enums.OperationType;
import app.exceptions.InputException;

import java.util.Scanner;

import static app.utils.Printer.println;
import static app.validator.InputValidator.*;

public class FundOperationsView {

    public static double getAmount() {
        String amount;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            amount = scanner.nextLine();
            try {
                validateInputAmount(amount);
            } catch (InputException e) {
                println(e.getMessage());
                continue;
            }
            break;
        }
        return Double.parseDouble(amount);
    }

    public static Currency getCurrency() {
        String currency;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            currency = scanner.nextLine().strip();
            try {
                return validateInputCurrency(currency);
            } catch (InputException ex) {
                println(ex.getMessage());
            }
        }
    }

    public static OperationType getOperation() {
        String operation;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            operation = scanner.nextLine().strip();
            try {
                return validateOperationType(operation);
            } catch (InputException ex) {
                println(ex.getMessage());
            }
        }
    }
}
