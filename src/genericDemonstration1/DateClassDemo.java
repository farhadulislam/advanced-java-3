package genericDemonstration1;

import java.util.Calendar;
import java.util.Date;

public class DateClassDemo {

    static{

    }

    public static void main (String [] args){

        System.out.println("Date class Demo");

        Date date = new Date();

        System.out.println(date);

        long timeInMilisec = date.getTime();

        System.out.println(timeInMilisec);
        int hours   = (int) ((timeInMilisec / (1000*60*60)) % 24);

        System.out.println(hours);



    }
}
