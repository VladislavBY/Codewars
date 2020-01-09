package by.popkov;

public class MonkeyCounter {
    public static int[] monkeyCount(final int n) {
        int[] outPut = new int[n];
        for (int i = 0; i < outPut.length; i++) {
            outPut[i] = i + 1;
        }
        return outPut;
    }
}
