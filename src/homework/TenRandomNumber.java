package homework;

public class TenRandomNumber {

    static  int Array[] = {3, 4, 5, 8, 18, 19, 22, 23, 95, 97};

    static int largest(){

    int i;
        int max = Array[0];
    for(i = 0; i < Array.length; i++)
        if (Array[i] > max)
        max = Array[i];

        return max;

    }

    public static void main(String[] args) {

        System.out.println("the largest number from the random array: " + largest());
        }


    }

