package classwork;

public class MaxTriple {
    public static void main(String[] args) {
        int []array ={1,2,3};
        MaxTriple(array);


    }

    public static int MaxTriple(int[] array){

        int max = array[0];
        if(max < array[array.length/2]){
            max = array[array.length/2];
        }

        if(max < array[array.length - 1]){
            max = array[array.length - 1];
        }

        System.out.println(max);
        return max;
    }
}
