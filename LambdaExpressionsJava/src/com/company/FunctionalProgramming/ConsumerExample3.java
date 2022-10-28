package com.company.FunctionalProgramming;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample3 {
    public static void main(String[] args) {
        IntConsumer intConsumer = (a)-> System.out.println(a*10);
        intConsumer.accept(10);

        LongConsumer longConsumer = (a)-> System.out.println(a*10L);
        longConsumer.accept(10L);

        DoubleConsumer doubleConsumer = (a)-> System.out.println(a*10D);
        doubleConsumer.accept(10.5);
        
    }
}
