package homework;

public class Diff {
    public static void diff(int n) {
        if (n <= 21) {
            int x = 21 - n;
            System.out.println("the number is " + x);
        } else {
            int y = (21 - n) * 2;
            System.out.println("the number is " + y);
        }
    }

    public static void main(String[] args){
        Diff d = new Diff();
        d.diff(12);

    }
}
