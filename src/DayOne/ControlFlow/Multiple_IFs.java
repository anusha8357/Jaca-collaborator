package DayOne.ControlFlow;

import java.util.Scanner;

public class Multiple_IFs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        System.out.println("value of s: " + a);

        if (a == 1) {
            System.out.println("One"); //option-command-l keyboard clear the unnecessary space
        } else if (a == 2){
            System.out.println("Two");
        }else if (a == 3)
        {
            System.out.println("Three");
        }else if (a == 4)
        {
            System.out.println("Four");
        }
        else{
            System.out.println("not valid number");
        }
    }
}
