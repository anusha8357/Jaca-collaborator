package homework;

public class NotSubstring {
    public static void notString(String str) {


        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            System.out.println(str);
        } else {
            System.out.println("not" + str);
        }

    }
    public static void main(String[] args) {
        notString("x");

    }


}
