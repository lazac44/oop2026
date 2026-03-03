package oop.labor03.lab3_2;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposit(int balance){
        this.balance += balance;
    }

    public void withdraw(int balance){
        if(balance <= this.balance){
            this.balance -= balance;
        }
        else{
            System.out.println("Nincs ennyi penze!");
        }
    }
}
