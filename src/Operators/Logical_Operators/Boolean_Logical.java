package Operators.Logical_Operators;

public class Boolean_Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean c = a|b;
        boolean d = a&b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g =!a;

        System.out.println("       a =" + a);
        System.out.println("       b =" + a);
        System.out.println("     a|b =" + a);
        System.out.println("     a&b =" + a);
        System.out.println("     a^b =" + a);
        System.out.println("!a&b|a&!b =" + a);
        System.out.println("      !a =" + a);
    }
}
