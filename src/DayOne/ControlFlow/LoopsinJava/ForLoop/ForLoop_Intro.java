package DayOne.ControlFlow.LoopsinJava.ForLoop;

public class ForLoop_Intro {

    public static void main(String[] args) {

        //print 0 to 5 in sysout
        int i;
        i = 1;

        for(; i <= 5; i++){
            System.out.println(i + " ");

        }

        System.out.println("new n " + i);

        int m = 0;
        for( ; ; ){
            System.out.println(m);

            //post increment the value of m
            m++;

            if (m > 4){
                break;
            }
        }


    }
}
