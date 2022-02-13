package com.sushildangi;

public class Test {
    public static void main(String[] args) {
        A a = new C();
        a.test();
        System.out.println("-------------------------------");
        A a1 = () -> System.out.println("Inside My Lambda");
        a1.test();
    }
}
