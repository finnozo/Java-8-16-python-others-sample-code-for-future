package com.sushildangi;

import static java.lang.StringTemplate.STR;

public class StringTemplates {
    void main(String[] args) {
        // TODO: BEFORE JAVA 21
        // Java (using String.format)
        String name = "Sushil Dangi";
        String message = String.format("Welcome %s", name);
        System.out.println(message);

        //TODO: IN JAVA 21

        String message1 = STR."Welcome \{name}!";

        System.out.println(message1);
    }
}
