package by.popkov.java8;

import java.util.*;

public class EnoughIsEnough {
    /**
     * Task
     * Given a list lst and a number N, create a new list that contains each
     * number of lst at most N times without reordering. For example if N = 2,
     * and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2],
     * drop the next [1,2] since this would lead to 1 and 2 being
     * in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
     * <p>
     * Example
     * EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
     * EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
     *
     * @param elements
     * @param maxOccurrences
     * @return
     */
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> map = new HashMap<>(elements.length);
        int[] clearedElements = new int[0];
        for (int i = 0; i < elements.length; i++) {
            int element = elements[i];
            if (map.containsKey(element)) map.put(element, map.get(element) + 1);
            else map.put(element, 1);
            if (map.get(element) <= maxOccurrences) {
                clearedElements = Arrays.copyOf(clearedElements, clearedElements.length + 1);
                clearedElements[clearedElements.length - 1] = element;
            }
        }
        return clearedElements;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[]{20, 37, 20, 21}, 1)));
    }
}
