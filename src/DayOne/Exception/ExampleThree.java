package DayOne.Exception;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExampleThree {

    public static void main(String[] args) {

        //first try block
        try {
            try {
                int arr[] = new int[4];
                arr[2] = 2;
                System.out.println(Arrays.toString(arr));
                arr[5] = 3;
                System.out.println(Arrays.toString(arr));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexException");
            }
        }catch (Exception e){
            System.out.println("outside of try-block block");



        }
    }
}
