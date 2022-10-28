package com.company.Lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        //implementing sayHelloWorld using lambda
        HelloWorldInterface helloWorldInterface = ()->{
            return "Hello World";
        };
        //can also be written as
        HelloWorldInterface helloWorldInterface1 = ()-> "Hello world";

        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
