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


}
