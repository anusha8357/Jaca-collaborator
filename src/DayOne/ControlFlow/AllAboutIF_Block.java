package DayOne.ControlFlow;

import java.util.Random;

public class AllAboutIF_Block {
    public static void main(String[] args) {

        //if condition


        //if(true){}
        int num = 5;
        Random random = new Random();
        System.out.println(num);
        if(num <= 5){
            System.out.println("this is true");
        }else{
            System.out.println("false");
        }

        int numberOfLoginAttempts = 10;
        int numberOfMinimumLoginAttempts = 12;
        int numberOfMaxLoginAttempts = 13;
        int y=3;

        //count the number login attempts and
        //provide if and else condition

        if (numberOfLoginAttempts < numberOfMaxLoginAttempts || numberOfMinimumLoginAttempts > y) {
            y++;
            System.out.println(y);
        }

        int a = random.nextInt(10);
        int b = random.nextInt(10);
        System.out.println("value of a:" + a);
        System.out.println("value of b:" + b);

        if(a > 0 || b > 5){
            System.out.println("if  block");
        }else{
            System.out.println("else block");
        }

    }
}
