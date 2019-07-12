package DayOne.ControlFlow.LoopsinJava.WhileLoop;

public class WhileLoop {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while(i<=4){
            System.out.println(i);

            //break condition
            i++;
        }

        //print value in reverse order

        int n = 10;
        while(n > 0){
            System.out.println(n);
            n--;
        }

        int j =0;
        while(j < 3){

            java.awt.Toolkit.getDefaultToolkit().beep();
            Thread.sleep(1000);
            j++;
        }

        double d = 0.00;

    }
}
