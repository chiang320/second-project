package org.example.model;

public class BsnkAccount {
    private String accountNumber;
    private double balance;

    public BsnkAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public void checkBalance() {
        System.out.println("帳號：" + accountNumber + "，餘額：" + balance);
    }
}



