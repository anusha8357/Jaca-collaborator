package homework;

public class Front3 {

    public static void front3(String str){
        String f;

        if(str.length() > 3){
            f = str.substring(0, 3);
            System.out.println(f);
        }
        //System.out.println(f);


    }
    public static void main(String[] args) {
        front3("anusha");
    }
}
