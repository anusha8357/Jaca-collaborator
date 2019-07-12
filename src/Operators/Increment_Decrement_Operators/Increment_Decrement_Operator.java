package Operators.Increment_Decrement_Operators;

public class Increment_Decrement_Operator {
    public static void main(String[] args) {

        int count = 10;

        ++count;   //Add 1 to count
        --count;   //Subtract 1 from count

        System.out.println(count);

        int a = 1;
        int b = 2;
        int c;
        int d;

        c = ++b; //3
        d = a++; //prints 1 and then add value
        c++;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("d= " + d);

        //using increment decrement operator in an expression

        int numA = 5;
        int numB = 10;
        int numC = 0;

        numC = ++numA +numB;

        System.out.println(numA);
        System.out.println(numC);


        //Pre fix and post fix

        numC = ++numA +numB;

        System.out.println(numA);
        System.out.println(numC);

        numC = --numA +numB--;

        System.out.println(numA);
        System.out.println(numC);

        //using floating numbers

        double v = 12.12;
        System.out.println( v-- );
        System.out.println( v++ );
        System.out.println( --v );
        System.out.println( ++v );


    }
}
