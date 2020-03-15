package by.popkov.java8;

import java.util.Arrays;

public class ThinkingTesting {
    public static int[] testit(int[] a, int[] b) {
        a = Arrays.stream(a).distinct().toArray();
        b = Arrays.stream(b).distinct().toArray();
        int[] outPut = new int[a.length + b.length];
        System.arraycopy(a, 0, outPut, 0, a.length);
        System.arraycopy(b, 0, outPut, a.length, b.length);
        Arrays.sort(outPut);
        return outPut;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(testit(new int[]{1, 2}, new int[]{3, 4})));
    }
}
