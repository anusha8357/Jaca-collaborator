package DayOne.Exception;

public class NullPointException {
    public static void main(String[] args) {

        try{
            String str = null;
            System.out.println(str.charAt(2));
        }catch (NullPointerException e){
            System.out.println("Null value");
        }

        System.out.println("this is outside of try catch block");

    }
}
