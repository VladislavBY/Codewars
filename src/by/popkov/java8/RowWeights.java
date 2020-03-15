package by.popkov.java8;

public class RowWeights {
    public static int[] rowWeights(final int[] weights) {
        int[] outPut = new int[2];
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) outPut[0] += weights[i];
            else outPut[1] += weights[i];
        }
        return outPut;
    }
}
