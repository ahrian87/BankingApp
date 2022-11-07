package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("Jan", "Kowalski", "874545211111", "jkowalski", 1234, "1234567890", 1000.00);

        Scanner sc = new Scanner(System.in);

        System.out.println("Witamy w naszym banku! ");

        System.out.println("Wpisz login: ");
        String login = sc.next();

        System.out.println(("Wpisz pin: "));
        int pin = sc.nextInt();


    }
}