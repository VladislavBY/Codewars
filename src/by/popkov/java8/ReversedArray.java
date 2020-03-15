package by.popkov.java8;

import java.util.Arrays;

public class ReversedArray {
    public static int[] digitize(long n) {
        String[] re = String.valueOf(n).split("");
        int[] outPut = new int[re.length];
        for (int i = 0; i < outPut.length; i++) {
            outPut[i] = Integer.parseInt(re[re.length - 1 - i]);
        }
        return outPut;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(12345)));
    }
}
