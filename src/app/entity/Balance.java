package app.entity;

public class Balance {

    private double balance;

    public Balance(double balance) {
        this.balance = balance;
    }

    public Balance() {
        this.balance =  1000.00;;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
