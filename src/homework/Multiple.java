package homework;

public class Multiple {
    public static void main(String[] args) {
        multiple(14);

    }

    public static void multiple(int n){
        if(n > 0){
            if(n % 3 == 0 && n % 5 == 0){

                System.out.println("true");

            }else{
                System.out.println("false");
            }
        }
    }
}
