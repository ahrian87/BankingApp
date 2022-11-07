package org.example;

public class Account {
    private String firstName;
    private String lastName;
    private String pesel;
    private String login;
    private int pin;
    private String accountNumber;
    private double balance;

    Account(String firstName, String lastName, String pesel, String login, int pin, String accountNumber,
            double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.login = login;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getLogin() {
        return login;
    }

    public int getPin() {
        return pin;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = balance + amount;
    }
}
