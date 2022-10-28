package pkg1;

import java.util.Scanner;

public class FlowControl {
    /*
    flow control
    - if else
    -switch
    -continue and break
    -loops



     */
    public static void main(String[] args) {

        /*
        if/else
        syntax:
        if(condition){
        statement}

        if(){}
        else{}

        if(){}
        else if(){}
        else{}

        if(){
        if(){}else{}
        }


        switch:
        switch(option)
        option 1:
        option 2:
        default:



        continue and Break
        continue: a single iteration
        break : break the flow


        Loops:
        -for
        syntax:
        for(start;condition;iteration){
        statements}
        -while
        while(condition){
        statement}
        -do{
        statement}while(condition)

         */


        int a = 10;


//        if( a == 10){
//            System.out.println("a = 10 ");
//        }else{
//            System.out.println("the value of a is "+a);
//        }
//
//        if(a%2 == 0){
//            if(a>10) {
//                System.out.println("a is greater than 10");
//            }
//            System.out.println("a is even");
//        }else{
//            System.out.println("a is odd");
//        }

        Scanner in = new Scanner(System.in);
//        int choice = in.nextInt();

//        switch (choice){
//            case 1:
//                System.out.println("I like coffee");
//                break;
//            case 2:
//                System.out.println("I prefer tea");
//                break;
//            default:
//                System.out.println("I like neither");
//                break;
//        }


        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }


//        for (int a:
//             array) {
//
//        }
        while(a>5){
            System.out.println("pkg1.Hello");
            a--;
            --a;
        }

        do{
            System.out.println("Hey");
        }while(a>6);


    }
}
