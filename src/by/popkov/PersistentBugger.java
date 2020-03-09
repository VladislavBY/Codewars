package by.popkov;

import java.util.Arrays;

public class PersistentBugger {
    public static int persistence(long n) {
        int counter = 0;
        for (long i = n; i > 9; counter++) {
           i = String.valueOf(i).chars().map((o) -> o - 48).reduce((o1, o2) -> o1 * o2).orElse(0);
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
    }
}
