package DayOne;

public class Boolean_Intro {
    public static void main(String[] args) {
        boolean b1=true;
        boolean b2=false;
        boolean b3=(10 > 20) ? true :false;// ? is a separator(conditional operator) and depends on the condition given, and prints the one after the separator if true, else next value
        System.out.println(b3);            //the above line is also called ternary operation

        if(b1) {
            System.out.println("this is true");
        }
        else{
            System.out.println("this is false");
        }

        boolean bull=Boolean.valueOf("TRUE");//Wrapper class in java
        System.out.println(bull);
    }
}
