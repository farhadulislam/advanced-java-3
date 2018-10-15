package genericDemonstration1;

import java.util.Calendar;
import java.util.Date;

public class DateClassDemo {

    static{

    }

    public static void main (String [] args){
        String months[] = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.set(2018, 03, 11);
        calendar1.set(2018, 10, 11);

        boolean before = calendar1.before(calendar2);
        System.out.println(before);




        System.out.println("Date class Demo");

        Date date = new Date();

        System.out.println(date);

        long timeInMilisec = date.getTime();

        System.out.println(timeInMilisec);
        int hours   = (int) ((timeInMilisec / (1000*60*60)) % 24);

        System.out.println(hours);



    }
}
