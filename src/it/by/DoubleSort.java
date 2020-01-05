package it.by;

import java.util.Arrays;

public class DoubleSort {
    public static Object[] dbSort(Object[] a) {
        Integer[] nums = new Integer[0];
        String[] words = new String[0];
        Object[] outPut = new Object[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Integer) {
                nums = Arrays.copyOf(nums, nums.length + 1);
                nums[nums.length - 1] = (Integer) a[i];
            } else if (a[i] instanceof String) {
                words = Arrays.copyOf(words, words.length + 1);
                words[words.length - 1] = (String) a[i];
            }
        }
        Arrays.sort(nums);
        Arrays.sort(words);
        System.arraycopy(nums, 0, outPut, 0, nums.length);
        System.arraycopy(words, 0, outPut, nums.length, words.length);
        return outPut;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dbSort(new Object[]{5, 3, 1, 5, "Bob", "Xan", "Alex"})));
    }
}
