package homework;

public class Front22 {
    public static void main(String[] args) {
        Front22("kitten");

    }

    public static void Front22(String str){
        int i = 2;
        String f;
        if(i > str.length()){
            i = str.length();

        }
        f = str.substring(0, i);
        System.out.println(f + str + f);
    }
}
