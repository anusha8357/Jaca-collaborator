package DayOne.Exception;

public class Exception_Intro {
    public static void main(String[] args) {
        int numOne = 12;
        int numTwo = 0;



        try{
            //possibilities of exception
            System.out.println(numOne/numTwo);

        }
        catch (Exception e){
            System.out.println("that's not possible");
        }
    }
}
