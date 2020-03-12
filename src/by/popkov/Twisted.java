package by.popkov;

import java.util.Arrays;
import java.util.Comparator;

public class Twisted {

    /**
     * #Sorting on planet Twisted-3-7
     * <p>
     * There is a planet... in a galaxy far far away. It is exactly like our planet,
     * but it has one difference: #The values of the digits 3 and 7 are twisted.
     * Our 3 means 7 on the planet Twisted-3-7. And 7 means 3.
     * <p>
     * Your task is to create a method,
     * that can sort an array the way it would be sorted on Twisted-3-7.
     * <p>
     * 7 Examples from a friend from Twisted-3-7:
     * <p>
     * [1,2,3,4,5,6,7,8,9] -> [1,2,7,4,5,6,3,8,9]
     * [12,13,14] -> [12,14,13]
     * [9,2,4,7,3] -> [2,7,4,3,9]
     *
     * @param array the array will always be not null and will always contain at least one number
     * @return the sorted array
     */
    public static Integer[] sortTwisted37(Integer[] array) {
        return Arrays.stream(array)
                .map(String::valueOf)
                .sorted(Comparator.comparing(o -> Integer.parseInt(o
                        .replaceAll("3", "three")
                        .replaceAll("7", "3")
                        .replaceAll("three", "7")
                )))
                .map(Integer::valueOf)
                .toArray(Integer[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortTwisted37(new Integer[]{9, 2, 4, 7, 3})));
    }
}
