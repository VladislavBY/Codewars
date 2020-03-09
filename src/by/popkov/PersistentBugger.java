package by.popkov;


public class PersistentBugger {
    /**
     * Write a function, persistence, that takes in a positive parameter num
     * and returns its multiplicative persistence, which is the
     * of times you must multiply the digits in num until you reach a single digit.
     *
     * @param n the positive parameter num
     * @return the multiplicative persistence of n
     */
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
