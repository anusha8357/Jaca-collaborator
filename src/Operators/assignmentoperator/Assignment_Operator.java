package Operators.assignmentoperator;

public class Assignment_Operator {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a+= 5;
        b*= 4;
        c-= a*b;
        c %= 6;

        System.out.println("a =" + a);
        System.out.println("b = " + b);
        System.out.println("c =" + c);

        //variable that allow to hold more values at a time
        int numArray[] ={2, 3, 4, 5, 6, 7, 8};

        //print all elements in an array
        //System.out.println(numArray[i]);

        //Only prints even numbers

        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] % 2 ==0){
                System.out.println(("These are the even numbers" + numArray[i]));
            }

            // Only prints odd numbers
            if(numArray[i] % 2 == 1){
                System.out.println("these are the odd number from array" + numArray[i]);
            }
        }
        //print length of array
        System.out.println("length of array is: " + numArray.length);

    }
}
