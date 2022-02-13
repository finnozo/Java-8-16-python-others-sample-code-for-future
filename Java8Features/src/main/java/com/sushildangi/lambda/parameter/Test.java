package com.sushildangi.lambda.parameter;

public class Test {
    public static void main(String[] args) {
        Sum sum = ((first, second) -> first + second);
        System.out.println(sum.sum(10L, 20L));
    }
}
