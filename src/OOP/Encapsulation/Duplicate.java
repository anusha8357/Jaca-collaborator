package OOP.Encapsulation;

public class Duplicate {

    //method that will return duplicate value if any...
    public static int Duplicate(int[] arr) {
        boolean verify[] = new boolean[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (verify[arr[i]]) {
                return arr[i];
            }
            verify[arr[i]] = true;
        }

        //no duplicate
        return -1;
    }

}
