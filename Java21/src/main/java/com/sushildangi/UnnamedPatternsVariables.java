package com.sushildangi;

import java.util.Scanner;

public class UnnamedPatternsVariables {
    void main(String[] args) {
        // todo: Before Java 21
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        try {
            int intString = Integer.parseInt(userInput);
            System.out.println(intString);
        } catch (NumberFormatException ex) {
            System.out.println(STR."Invalid input: \{userInput}");
        }

        // todo: In Java 21

        try {
            int intString = Integer.parseInt(userInput);
            System.out.println(intString);
        } catch (NumberFormatException _) {
            System.out.println(STR."Invalid input: \{userInput}");
        }
    }
}
