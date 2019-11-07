package sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();

        for (int i = 1; i <= 53; i++) {
            main.getStartAndEndDate(i);
        }
    }

    private void getStartAndEndDate(int week) {
        System.out.println("Week: " + week);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.WEEK_OF_YEAR, week);
        DateFormat df = new SimpleDateFormat("EEE yyyy-MM-dd");
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        System.out.println(df.format(cal.getTime()));
        cal.add(Calendar.DATE, 6);
        System.out.println(df.format(cal.getTime()));
        System.out.println("============");
    }
}
