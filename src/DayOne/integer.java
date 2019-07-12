package DayOne;

public class integer {
    public static void main(String[] args) {
        //Wrapper class
        System.out.println(Integer.SIZE);
        // System.out.println(Long.SIZE);

        for(int i= 0; i <= 16; i++){
            System.out.println(i);

        }

        int a=100;
        int b=60;
        int c=20;
        if(c > b & c > a){
            System.out.println(c + " is large number");
        }
        else if (b > a & b > c){
            System.out.println(b + " is large number");
        }
        else{
            System.out.println(a +" is large number");
        }

        /*if (b>a){
        a=b;
        }
        if(c>a){
        a=c;
        }
        System.out.println(a);
         */




    }
}
