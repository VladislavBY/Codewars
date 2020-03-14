package by.popkov;

import java.time.LocalDate;

public class UnluckyDays {
    public static int unluckyDays(int year) {
        int counter = 0;
        for (int i = 1; i < 366; i++) {
            LocalDate localDate = LocalDate.ofYearDay(year, i);
            if (localDate.getDayOfMonth() == 13 && localDate.getDayOfWeek().getValue() == 5) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(unluckyDays(1986));
    }
}
