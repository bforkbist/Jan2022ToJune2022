package pkg2;


import pkg1.Hello;

import java.util.ArrayList;

public class AccessModifier {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.b);
        System.out.print(demo.c);
        ArrayList<Integer> s = new ArrayList();
        Hello hello = new Hello();


    }
}/// final static
class Demo{
    private int a=10;
    protected int b=20;
    int c=30;

}
