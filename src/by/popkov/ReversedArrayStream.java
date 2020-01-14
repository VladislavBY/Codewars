package by.popkov;

import java.util.Arrays;

public class ReversedArrayStream {
    public static int[] digitize(long n) {
        return new StringBuilder()
                .append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(12345)));
    }
}
