package DayOne.Exception;

public class ThrowsExample {

    public static void main(String[] args) {

        try{
            myMethod();
        } catch (java.lang.ArithmeticException e){

        }catch (NullPointerException e){

        }

    }

    public static void myMethod() throws java.lang.ArithmeticException, NullPointerException{

    }
}
