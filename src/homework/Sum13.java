package homework;

public class Sum13 {
//    public static int sum13(int[] n){
//        int i = 0;
//        int sum = 0;
//
//        while(i < n.length){
//            if(n[i] == 13){
//                i += 2;
//            }
//        }
//
//    }















    public static int sum13(int [] n){

        int sum = 0;
        int i = 0;

        while(i < n.length){
            if(n[i] == 13){
                i +=2;
            }
            else {
                sum += n[i];
                i++;
            }
        }

        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        int array[] ={1,13,2,13,4};
        sum13(array);

    }
}
