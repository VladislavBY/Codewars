package by.popkov;

public class Clock {
    public static int Past(int h, int m, int s) {
        return h * 3600000 + m * 60000 + s * 1000;
    }

    public static void main(String[] args) {
        System.out.println(Past(13,39,49));
    }
}
