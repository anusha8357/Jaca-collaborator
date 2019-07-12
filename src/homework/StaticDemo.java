package homework;

public class StaticDemo {
    /*
    1. Static block
    2. Static method
    3. Static variable
     */

    static void myMethod(){
        System.out.println("this is my method..");
    }

    public static void main(String[] args) {
        myMethod();
        System.out.println("value of num: " + num);
        System.out.println("value of Str: " + str);
    }

    static int num;
    static String str;

    static{
        num = 50;
        str = "Test Static Block";
    }

    static{
        num = 55;
        str = "Just test";
    }
}
