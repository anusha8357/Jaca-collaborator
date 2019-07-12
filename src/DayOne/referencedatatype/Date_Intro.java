package DayOne.referencedatatype;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Intro {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/DD/YYYY");
        System.out.println(dateFormat);

        Date date1 = dateFormat.parse("06/25/2018");
        System.out.println(date1);

    }
}
