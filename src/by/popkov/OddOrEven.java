package by.popkov;

//odd_or_even(vec![0]) returns "even"
//        odd_or_even(vec![0, 1, 4]) returns "odd"
//        odd_or_even(vec![0, -1, -5]) returns "even"

import java.util.Arrays;

public class OddOrEven {
    public static String oddOrEven(int[] array) {
        return (Arrays.stream(array).reduce(Integer::sum).orElse(0) % 2 == 0) ? "even" : "odd";
    }
}
