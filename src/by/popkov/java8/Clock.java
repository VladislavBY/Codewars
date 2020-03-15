package by.popkov.java8;


public class Clock {
    /**
     *
     * @param h hours
     * @param m minuets
     * @param s seconds
     * @return returned sum h, m and s converted to milliseconds
     */
    public static int Past(int h, int m, int s) {
        return h * 3600000 + m * 60000 + s * 1000;
    }

    public static void main(String[] args) {
        System.out.println(Past(13,39,49));
    }
}
