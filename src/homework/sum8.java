package homework;

public class sum8 {
    public static void main(String[] args) {
        int nums[] ={2,2,2,2,7};
        System.out.println(sum8(nums));
    }

    public static boolean sum8(int nums[]){
       // int i = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2){
                sum += nums[i];
            }
        }
        return sum == 8;
    }
}
