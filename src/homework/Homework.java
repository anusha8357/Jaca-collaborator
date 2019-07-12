package homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        String name;
        int age;
        System.out.println("what's your name? ");
        name = keyboard.next();
        System.out.println();
        System.out.println("And what about your age: ");
        age = keyboard.nextInt();
        System.out.println();

        if(age < 16){
            System.out.println("you can't drive");
        }
        if(age < 18){
            System.out.println("you can't drink");
        }
        if(age < 25){
            System.out.println("you can't rent a car");
        }



    }

}
