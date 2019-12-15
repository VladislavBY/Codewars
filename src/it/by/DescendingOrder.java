package it.by;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String s = "" + num;
        String[] strArray = s.split("");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(intArray);
        StringBuilder a = new StringBuilder();
        for (int i = intArray.length - 1; i >= 0; i--) {
            a.append(intArray[i]);
        }
        return Integer.parseInt(a.toString());
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(21445));
    }
}
