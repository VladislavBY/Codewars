package by.popkov.java8;


import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MinuteToMidnight {
    /**
     * will take a date object as parameter. Return the number of minutes in the following format:
     *
     * "x minute(s)"
     *
     * You will always get a date object with of today with a random timestamp.
     * You have to round the number of minutes.
     * Milliseconds doesn't matter!
     *
     * Some examples:
     *
     * 10.00 am => "840 minutes"
     * 23.59 pm => "1 minute"
     *
     * @param d the date object
     * @return the number of minutes fo midnight
     */
    public String countMinutes(Date d) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
        int minutesToMidnight = 1440 - (localDateTime.getHour() * 60 + localDateTime.getMinute()
                + (int) Math.ceil(localDateTime.getSecond() / 60.0));
        String minute = (1440 - (localDateTime.getHour() * 60 + localDateTime.getMinute()) > 1) ? "minutes" : "minute";
        return minutesToMidnight + " " + minute;
    }

    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 12);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 36);
        cal.set(Calendar.MILLISECOND, 0);
        Date d = cal.getTime();
        System.out.println(new MinuteToMidnight().countMinutes(d));
    }
}
