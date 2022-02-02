package com.sushildangi;

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println("Inside main");
        StaticMethod.method1();
    }

    static void method1(){
        System.out.println("Inside static method");
    }

    static {
        System.out.println("Inside static block");
        StaticMethod.method1();
    }
}
