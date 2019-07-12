package DayOne.Exception;

public class NestedException {
    public static void main(String[] args) {

        //Main try
        try {

            //second try
            try {
                //third try
                try {
                    int[] arr = {1, 2, 3, 4};
                    int numOne = 10 / 0;
                    String str = null;
                    System.out.println(str.charAt(6));
                    System.out.println(arr[10]);
                } catch (java.lang.ArithmeticException e) {
                    System.out.println("ArithmeticException");
                    System.out.println();
                }
            } catch (java.lang.ArithmeticException e) {
                System.out.println("Arithmetic Exception");
                System.out.println("In second try catch block");
            }

        } catch (java.lang.ArithmeticException e) {
            System.out.println("Arithmetic Exception");
            System.out.println("In main try-block");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfException");
            System.out.println("In main try-block");
        } catch (Exception e){
            System.out.println("something went wrong");
            System.out.println("In main try-block");
        }
    }
}
