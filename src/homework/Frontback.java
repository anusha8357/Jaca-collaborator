package homework;

public class Frontback {
    public static void main(String[] args) {
        Frontback("consultancy");

    }

    public static void Frontback(String str){
        if(str.length() <= 1){
            System.out.println(str);
        }
        String mid = str.substring(1, str.length() - 1);
        System.out.println(str.charAt(str.length() - 1) + mid + str.charAt(0));
    }
}
