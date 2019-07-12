package homework;

public class backAround {
    public static void main(String[] args) {
        backAround("an");

    }

    public static void backAround(String str){
        String b;
        if(str.length() >= 2) {
            b = str.substring(str.length() - 1);
            System.out.println(b + str + b);
        }
    }
}