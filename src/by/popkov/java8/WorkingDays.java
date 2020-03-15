package by.popkov.java8;

import java.time.LocalDate;

public class WorkingDays {
    static long count(final LocalDate start, final LocalDate end) {
        int counter = 0;
        for (LocalDate current = start.withDayOfMonth(1); !current.equals(end.plusMonths(1).withDayOfMonth(1)); current = current.plusDays(1)) {
            if (current.getDayOfWeek().getValue() < 6) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(count(LocalDate.of(2017, 6, 1),
                LocalDate.of(2017, 6, 1)));
    }
}
