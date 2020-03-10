package by.popkov;

import java.util.ArrayList;
import java.util.List;

public class FindTheParityOutlier {

    /**
     * You are given an array (which will have a length of at least 3, but could be very large)
     * containing integers. The array is either entirely comprised of odd integers
     * or entirely comprised of even integers except for a single integer N.
     * Write a method that takes the array as an argument and returns this "outlier" N.
     *
     * @param integers array which will have a length of at least 3
     * @return the "outlier"
     */

    static int find(int[] integers) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i : integers) {
            if (i % 2 == 0) even.add(i);
            else odd.add(i);
        }
        if (even.size() > odd.size()) return odd.get(0);
        else return even.get(0);
    }
}
