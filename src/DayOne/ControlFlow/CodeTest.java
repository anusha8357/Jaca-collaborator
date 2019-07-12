package DayOne.ControlFlow;

import java.util.Scanner;

public class CodeTest {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        test4();
    }

    public static void test4() {
        Scanner dec = new Scanner(System.in);
        System.out.println("enter a floating number: ");
        float f2 = dec.nextFloat();
        System.out.println("enter another floating number: ");
        float f3 = dec.nextFloat();

        f2 = Math.round(f2 * 1000);
        f2 = f2 / 1000;

        f3 = Math.round(f3 * 1000);
        f3 = f3 / 1000;

        if (f2 == f3) {
            System.out.println("they are same upto three decimal value");
        } else {
            System.out.println("they arenot ");
        }
    }


    public static void test3() {
        Scanner f = new Scanner(System.in);
        System.out.println("enter a floating number: ");
        float f1 = f.nextFloat();

        if (f1 > 0) {
            if (f1 < 1) {
                System.out.println("positive and small number");
            } else if (f1 > 1000000) {
                System.out.println("positive and large number");
            }
            else {
                System.out.println("positive");
            }
        }
        else if (f1 == 0) {
            System.out.println("zero");
        }else {
            System.out.println("negative");
        }
    }




   public static void test2() {

        //take three number and print greatest number
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a1 = scan.nextInt();
        System.out.println("enter second number: ");
        int b1 = scan.nextInt();
        System.out.println("enter third number: ");
        int c1 = scan.nextInt();

        if(a1 > b1 && a1 > c1){
            System.out.println(a1 + " is largest. ");
        }else if(b1 > a1 && b1 > c1){
            System.out.println(b1 + " is largest.");
        }else
            System.out.println(c1 + " is largest");
    }
}
