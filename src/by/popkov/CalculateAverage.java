package by.popkov;

import java.util.Arrays;

public class CalculateAverage {
    public static double find_average(int[] array) {
        return Arrays.stream(array).average().orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(find_average(new int[]{1,2,5,1,4,5,23,44}));
    }
}
