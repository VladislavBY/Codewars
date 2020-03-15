package by.popkov.java8;

//Find the sum of the odd numbers within an array, after cubing the initial integers.

import java.util.Arrays;

public class FindOddCubes {
    public static int cubeOdd(int arr[]) {
        return Arrays.stream(arr)
                .map(operand -> operand * operand * operand)
                .filter(o -> o % 2 != 0)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(cubeOdd(new int[]{-5, -5, 5, 5}));
    }
}