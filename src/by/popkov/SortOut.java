package by.popkov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortOut {
    /**
     * Return int[] sorted for slit EVEN and ODD.
     * Even to start, odd to end of array
     * Even is sorted to up. Odd is sorted to down.
     * @param values array for sort
     * @return sorted array
     */
    public static int[] menFromBoys(final int[] values) {
        List<Integer> even = new ArrayList<>(values.length);
        List<Integer> odd = new ArrayList<>(values.length);
        List<Integer> result = new ArrayList<>(values.length);
        for (int value : values) {
            if (value % 2 == 0) even.add(value);
            else odd.add(value);
        }
        even.sort(Comparator.comparingInt(o -> o));
        odd.sort((o1, o2) -> o2 - o1);
        result.addAll(even);
        result.addAll(odd);

        return result.stream().mapToInt(Integer::intValue).distinct().toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(menFromBoys(new int[]{49, 818, -282, 900, 928, 281, -282, -1})));
    }
}
