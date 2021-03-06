package demonstration1;

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
        calendar1.set(2005, 10, 06);
        calendar2.set(2018, 10, 24);

        boolean before = calendar1.before(calendar2);
        System.out.println("Is first date before the last date? " + before);
        long end = calendar2.getTimeInMillis();
        long start = calendar1.getTimeInMillis();
        long diff = end- start;
        System.out.println(diff);

        int daysPassed = (int) ((diff / (1000*60*60*24)));
        int hoursPassed   = (int) ((diff / (1000*60*60)));
        System.out.println("Days Passed " + daysPassed);
        System.out.println("Hours Passed " + hoursPassed);



        System.out.println("Date class Demo");

        Date date = new Date();

        System.out.println(date);

        long timeInMilisec = date.getTime();

        System.out.println(timeInMilisec);
        int hours   = (int) ((timeInMilisec / (1000*60*60)) % 24);

        System.out.println(hours);



    }
}
