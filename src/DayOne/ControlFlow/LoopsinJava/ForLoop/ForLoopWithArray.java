package DayOne.ControlFlow.LoopsinJava.ForLoop;

public class ForLoopWithArray {
    public static void main(String[] args) {

        //array can hold more one value at time..
        //array always starts index zero

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arr.length);
        System.out.println(arr[1]);

        int []arrOne = new int[3]; //size of an array, hold upto 3 element, ask
        System.out.println(arrOne[0]); //

        arrOne[0] = 4;
        arrOne[1] = 7;
        arrOne[2] = 9;

        System.out.println(arrOne[0]);

        int arrTwo[] = {2, 11, 46, 56};

        for(int i = 0; i < arrTwo.length; i++){
           System.out.println(arrTwo[i] + " ");
        }

        //count the number of 9 in the given array

        int arrayCount[]={9,5,4,9,8};
        int count = 9;

        for(int i = 0; i < arrayCount.length; i++){

            if(arrayCount[i]== 9){
                count++;
            }
            System.out.println(count);
        }

        //prints true if the first 4 element contains 9

        int arrayFront9[] = {1, 2, 9, 3 ,4};

        if(arrayFront9.length > 4){
            System.out.println("skip");

            for(int i = 0; i < arrayFront9.length - 1; i++){
                if(arrayFront9[i] == 9){
                    System.out.println(true);
                }
            }
        }

    }
}
