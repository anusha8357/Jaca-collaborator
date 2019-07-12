package String;

public class String_Demo {
    public static void main(String[] args) {
        //Concat

        String str = "Hello";
        String strTwo = "World";

        System.out.println(str + strTwo);
        System.out.println(str.concat(strTwo));

        //Hashcode method..
        System.out.println(str.hashCode());

        System.out.println("Hello".hashCode());

        //Contains (boolean value)

        System.out.println("Java learning".contains("Java"));

        //compareTo()//

        System.out.println("apple".compareTo("banana"));

        //compareToignoreCase()

        System.out.println("apple".compareTo("Apple"));
        System.out.println("apple".compareToIgnoreCase("Apple"));
    }
}
