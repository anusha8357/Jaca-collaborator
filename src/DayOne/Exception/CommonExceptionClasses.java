package DayOne.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CommonExceptionClasses {

    public static void main(String[] args) {


        //IOException = INPUT/OUTPUT


        //1. File not found
        try{
            new FileReader(new File("Test.text"));
        } catch (FileNotFoundException e){
            System.out.println("File not Found!! ");
        }

        //URL websites address not found

        try {
            new URL("http://yahoo.com");
        } catch (MalformedURLException e){
            System.out.println("URL is not correctly defined.");
        }

        //Parse Exception

        try{
            new SimpleDateFormat("MM,dd,yyyy").parse("Invalid -date");
        }catch (ParseException e){
            System.out.println("Date format is not readable");
        }

        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            System.out.println("Thread Exception");
        }


        //String index out of bound

        String str = "Hello World";
        try {
            System.out.println(str.charAt(50));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }


        //NumberFormat

        String s= "10";
        try{
            int x =Integer.parseInt(s);
            System.out.println(x);
        } catch (NumberFormatException e){
            System.out.println("This is NumberFormatException");
        }



    }
}
