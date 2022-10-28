package com.company.FunctionalProgramming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c = (x) -> System.out.println(x.length()+" the value of x: "+ x);
        c.accept("Up in the air");

        Consumer<Integer> d = (x)->{
            System.out.println("x square:"+ x*x);
            System.out.println("x/x: "+x/x);
        };
    }
}
