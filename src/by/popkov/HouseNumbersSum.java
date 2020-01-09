package by.popkov;

public class HouseNumbersSum {
    public static int houseNumbersSum(final int[] arr) {
        int outPut = 0;
        for (int value : arr) {
            if (value == 0) break;
            else outPut += value;
        }
        return outPut;
    }
}
