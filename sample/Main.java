package sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();

        int year = 2019;

        for (int i = 1; i <= 53; i++) {
            main.getStartAndEndDate(i, year);
        }
    }

    private void getStartAndEndDate(int week, int year) {
        System.out.println("Week: " + week);
        Calendar cal = Calendar.getInstance();

        // set Year
        cal.set(Calendar.YEAR, year);

        // set week of year
        cal.set(Calendar.WEEK_OF_YEAR, week);

        // format date to view
        DateFormat df = new SimpleDateFormat("EEE yyyy-MM-dd");

        // set day start of week is sunday
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        System.out.println(df.format(cal.getTime()));

        // add 6 days to become end-day is saturday
        cal.add(Calendar.DATE, 6);

        System.out.println(df.format(cal.getTime()));
        
        System.out.println("============");
    }
}
