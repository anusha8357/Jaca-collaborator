package homework;

public class SleepIn {
    public static boolean off(boolean weekday, boolean vacation) {
        if(!weekday == vacation){
            System.out.println("this is true");
            return true; //ask
        }else{
            System.out.println("this is false");
            return false;
        }

    }
    public static void main(String[] args) {
      //  off(true,false);
        SleepIn s = new SleepIn();
        s.off(true, false);
    }

}
