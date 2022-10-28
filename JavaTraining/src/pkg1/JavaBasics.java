package pkg1;

public class JavaBasics {
    //objects: real

    //class
    /*
    variables
    methods
    blocks
    interfaces and nest
     */

    //syntax
    // access Datatype name = value;
    //
    int a = 20;
    static int b = 23;
    //access = static

    //class name {
    // variables( instance variables)
    // methods
    //constructors
    // access return-type name (parameter){
    // return return-type
    // }

    // }

    //methods
    //->user defined
    //->pre defined
    public static void main(String[] args) {
        JavaBasics javaBasics = new JavaBasics();

        System.out.println(javaBasics.a);
        System.out.println(b);
        byte b1 = 127;
        int c = 999999997;
        float d = 99999999788f;
        double e = 99999999.9d;

        Hello hello = new Hello();
        double i = hello.add(7);
        hello.display();
        hello.display1();


        System.out.println(c + " " + d);


        //datatype

    /*
    primitive and non-prim



    char
    boolean = true/false

    byte = 1 byte, ,-128 to 127
    short= 2 byte,
    int = 4 bytes,
    long= 8 byte, l/L

    float= 4 bytes,f/F
    double= 8 byte,

    int<long default=int
    float<double default = double


    Non-prim:
    -strings
    -arrays
    -vectors
    -list
    -set
    -maps

     */
        /*
         * Methods
         * -with return type
         * without return type
         * without retrun type and with parameter
         * with return and with parameters
         * Constructors
         *
         *
         * */

    /*Non-prim
        arrays
        strings
         */


        //arrays
        int a[]={1,23,3,4,5};
        int[][] q = new int[1][2];
        int[] p[]= new int[2][3];

        for (int l: a) {
            System.out.println(l);
        }

        //String
        String str="10";
        System.out.println(str+" hello");
        System.out.println(str);
        int ax=10,b=10;

        String str1="hello",str2="hello",str3="hello1";
        String str4= new String("hello");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(Integer.hashCode(b));




    }

}
