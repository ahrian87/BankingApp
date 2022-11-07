package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("Jan", "Kowalski", "874545211111", "jkowalski", 1234, "1234567890", 1000.00);

        Scanner sc = new Scanner(System.in);

        System.out.println("Witamy w naszym banku! ");

        boolean isLoginValid = false;
        do {
            System.out.println("Wpisz login: ");
            String login = sc.next();

            if (login.equals(account1.getLogin())) {
                System.out.println("Poprawny login\n");
                isLoginValid = true;
            }
            else {
                System.out.println("Niepoprawny login");
            }

        } while (!isLoginValid);


        boolean isPinValid = false;
        int pinAttempt = 3;
        do {
            System.out.println(("Wpisz pin: "));
            int pin = sc.nextInt();

            if (pin == account1.getPin()) {
                System.out.println("Poprawny pin\n");
                isPinValid = true;
            }

            else {
                pinAttempt--;
                if (pinAttempt > 0) {
                    System.out.println("Niepoprawny pin, pozostało " + pinAttempt + " prób");
                }
                if (pinAttempt == 0) {
                    System.out.println("Wykorzystałeś limit prób, do widzenia!");
                    System.exit(0);
                }
            }

        } while (!isPinValid);


        System.out.println("MENU");
        System.out.println("1. Wpłata środków \n2. Wypłata środków \n3. Sprawdź saldo \n4. Weź kredyt \n5. Wyjdź");
        System.out.println("Twój wybór: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Stan Twojego konta wynosi " + account1.getBalance());
                System.out.println("Podaj kwotę, którą chcesz wpłacić: ");
                double depoAmount = sc.nextInt();
                account1.setBalance(depoAmount);
                System.out.println("Twój stan konta wynosi " + account1.getBalance());
            case 2:

        }

    }
}