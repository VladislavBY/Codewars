package by.popkov.java8;

import java.util.Arrays;

public class FlattenAndSort {
    public static int[] flattenAndSort(int[][] array) {
        int[] united = new int[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                united = Arrays.copyOf(united, united.length + 1);
                united[united.length - 1] = array[i][j];
            }
        }
        Arrays.sort(united);
        return united;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}})));
    }
}
