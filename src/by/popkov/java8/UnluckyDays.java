package by.popkov.java8;

import java.time.LocalDate;

public class UnluckyDays {
    public static int unluckyDays(int year) {
        int counter = 0;
        for (int i = 1; i < 13; i++) {
            if (LocalDate.of(year, i, 13).getDayOfWeek().getValue() == 5) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(unluckyDays(1986));
    }
}
