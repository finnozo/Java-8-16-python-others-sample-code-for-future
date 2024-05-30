package com.sushildangi;

import java.util.Scanner;

public class PatternMatching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();

        // todo: Before Java 21
        System.out.println("todo: Before Java 21");
        switch (response.toLowerCase()) {
            case "yes":
            case "yeah":
                System.out.println("You said yes!");
                break;
            case "no":
            case "nope":
                System.out.println("You said no!");
                break;
            default:
                System.out.println("Please choose.");
        }

        // todo: In Java 21
        System.out.println("todo: In Java 21");
        switch (response.toLowerCase()) {
            case "yes", "yeah" -> System.out.println("You said yes!");
            case "no", "nope" -> System.out.println("You said no!");
            default -> System.out.println("Please choose.");
        }
    }
}
