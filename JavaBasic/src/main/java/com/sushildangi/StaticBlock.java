package com.sushildangi;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
    static {
        System.out.println("Static block test1");
    } static {
        System.out.println("Static block test2");
    } static {
        System.out.println("Static block test3");
    }
}
