package by.popkov;

import java.util.ArrayList;
import java.util.Arrays;

public class Minimum {
    public static int minValue(int[] values) {
        ArrayList<Integer> outArray = new ArrayList<>();
        int outPut = 0;
        int min = 0;
        Arrays.sort(values);
        for (int i = 0; i < values.length; i++) {
            if (values[i] > min) {
                outArray.add(values[i]);
                min = values[i];
            }
        }
        for (int i = 0; i < outArray.size(); i++) {
            outPut += outArray.get(i) * (Math.pow(10, outArray.size() - (i + 1)));
        }
        return outPut;
    }

    public static void main(String[] args) {
        System.out.println(minValue(new int[]{2, 2, 2, 3, 4, 5, 1, 1, 0}));
    }
}
