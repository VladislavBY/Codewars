package by.popkov.java8;

public class NthSeries {
    public static String seriesSum(int n) {
        if (n == 0) return "0.00";
        double sum = 1.0;
        for (int i = 1; i < n; i++) {
            sum += 1.0 / (1.0 + (i * 3.0));
        }
        return String.format("%.2f", sum);
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}
