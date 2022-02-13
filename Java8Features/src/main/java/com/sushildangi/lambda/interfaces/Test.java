package com.sushildangi.lambda.interfaces;

public class Test {
    public static void main(String[] args) {
        Runnable r = new MyRunnableImpl();
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread : "+i);
        }

        Runnable r1 = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("In side lambda child : "+i);
            }
        };
        new Thread(r1).start();
    }
}
