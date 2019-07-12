package DayOne.ControlFlow.LoopsinJava.ForLoop;

public class ForEach_Intro {
    public static void main(String[] args) {

        int nums[] = {4,5,6,7,4,5,6,7};

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i] + " ");

        }

        for(int i : nums){
            if(nums[i] % 2 == 0 ){
                System.out.println(nums[i]);
            }

        }

        //user dor each loop and print the total of the elements
        int sum = 0;
        int numArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i: numArray){
            sum += i;
        }
        System.out.println(sum);


        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for(char v: vowels){
            System.out.println(v);
        }

        String str ="HIHIHI";
        int n = 3;
        String result = " ";
        for(int i = 0; i < n; i++){
            result = result + str;

        }
        System.out.println(result);

        //firstLast6([1, 2, 6]) → true
        //firstLast6([6, 1, 2, 3]) → true
        //firstLast6([13, 6, 1, 2, 3]) → false

        int ArrayFL[] ={1, 2, 6};


        if(ArrayFL[0] == 6 || ArrayFL[ArrayFL.length-1] ==6 ) {
            System.out.println("true");
        }
    }
}
