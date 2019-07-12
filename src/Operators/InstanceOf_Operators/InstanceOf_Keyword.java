package Operators.InstanceOf_Operators;

public class InstanceOf_Keyword {
    /* the instanceof keyword can be used to test if an object is of a specified type.
    if (objectResource instanceof type)

     */
    public static void main(String[] args) {
        String s = "Hello";
        if(s instanceof java.lang.String) {
            System.out.println(s + " is a String");
        }

        //However, applying instanceof on a null reference variable returns false
        //for example, the following if statement returns false.

        String o= null;
        if (o instanceof java.lang.String){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
