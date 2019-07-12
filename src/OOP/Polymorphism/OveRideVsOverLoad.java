package OOP.Polymorphism;

public class OveRideVsOverLoad {
    public static int addNum(int a, int b) {
        System.out.println(a + b);
        return a + b;

    }

    //overload addNum method..
    public static long addNum(long a, long b){
        System.out.println(a + b);
        return a+b;
    }

    public static void main(String[] args) {
        addNum(3L, 4L);
        addNum(4, 5);
    }

}
