package homework;

public class MissingChar {

    public static String missingChar(String str){

        if(str.length() % 2 == 1){
            return "not valid";

        }else{
            return str.substring(0, str.length() / 2);
        }


        //return str.substring(0, str,length()/2);
       // String front = str.substring(0, n);

       // String back = str.substring(n+1, str.length());
      //  System.out.println(front);

    }
    public static void main(String[] args) {
        System.out.println(missingChar("anusha"));


    }
}
