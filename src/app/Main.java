package app;

import app.exceptions.FundsException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static double balance;

    public static void main(String[] args) {
        balance = getBalance();
        validateAmount(balance, getAmount());
    }

    private static double getBalance() {
        return 1000.00; // Наявні кошти на рахунку
    }

    private static double getAmount() {
        System.out.printf("Balance is USD %.2f.%n" +
                "Enter purchase amount, USD: ", balance);
        double amount;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                amount = scanner.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input: amount must be a number.");
                scanner.next();
                continue;
            }
            if (amount < 0) {
                try {
                    throw new FundsException("Invalid input: amount can't be negative");
                } catch (FundsException ex) {
                    System.out.println(ex.getMessage());
                    continue;
                }
            }
            break;
        }

        return amount;
    }

    // Метод валідації наявних коштів
    private static void validateAmount(double balance, double withdrawal) {
        if (withdrawal > balance) {
            try {
                throw new FundsException("Insufficient funds!");
            } catch (FundsException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            balance = getBalance(balance, withdrawal);
            System.out.printf("Funds are OK. Purchase paid." +
                    "%nBalance is USD %.2f", balance);
        }
    }

    // Метод розрахунку наявних коштів на рахунку
    // після зняття певної суми коштів
    private static double getBalance(double balance, double withdrawal) {
        return balance - withdrawal;
    }
}
