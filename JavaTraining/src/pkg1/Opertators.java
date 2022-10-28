package pkg1;

public class Opertators {

    public static void main(String[] args) {
        /*
        Operators:
        -unary: ++,--,+,-,!
        -Arithmetic: *,/,%,+,-
        -shift :<<, >>
        -relational: <,>,<=,>=, instanceof
        -Bitwise: &, ^, |
        -logical: && ,||
        -ternary: ?:
        -Assignment: =,+=,-+,*=,/=,%=,&=,|=,<<=,>>=,>>>=
         */
        //shift
        System.out.println(10<<2);//10*2^2=40 left
        System.out.println(100>>2);//100/2^2 right
        System.out.println(1000>>>2);


        //bitwise
        System.out.println(1&1);
        System.out.println(1|1);
        System.out.println(1^1);

        int c=2, d=3,a=5,b=4;
        //logical
        System.out.println(true&&true);
        System.out.println(true||false);

        //ternary
         int e= c>d?a:b;
        System.out.println(e);


        //assignment
        System.out.println(a+=a);//a=a+a


        // naming:
        /*
        class: first letter should capital
            : camelcasing

         methods: first letter should be smaller case
         : camelcasing

         variables:
         starting with lowercase

         don'ts
         -donot use numberic at the start
         -__
         -cannot start with a symbol
         */


    }
}
