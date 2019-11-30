package it.by;

//Given an array of integers.
//
//        Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
//
//        If the input array is empty or null, return an empty array.
//
//        Example
//        For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

import java.util.Arrays;

public class CountPositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        int[] out = new int[2];
        int [] nul = new int[]{};
        if (input != null && !Arrays.equals(input, nul)) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    out[0]++;
                } else if (input[i] < 0) {
                    out[1] += input[i];
                }
            }
            return out;
        }
        return nul;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{})));
    }
}
