package DayOne.referencedatatype;

public class String_Intro {
    public static void main(String[] args) {
        String strOne= "1" + "2";
        System.out.println(strOne);

        String strTwo = strOne + "= 4";
        System.out.println(strTwo);

        String name = "JavaClass";

        int length = name.length();
        System.out.println("Name length is: " + length);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String s1="JAVA";
        String s2="AVA";

        boolean b1= s1.equals(s2);
        System.out.println(b1);

        String str= "abcde";

        if(str.startsWith("ab")){
            System.out.println("True it's starts with ab");
        }
        else{
            System.out.println(false);
        }

        if(str.endsWith("de")){
            System.out.println("True it ends with de");
        }else{
            System.out.println(false);
        }


    }



}
