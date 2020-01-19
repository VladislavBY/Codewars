package by.popkov;

//In this kata you get the start number and the end number of a region and should return the count of all numbers except numbers with a 5 in it.
//        The start and the end number are both inclusive!

import java.util.ArrayList;

public class DontGiveMeFiveStream {
    public static int dontGiveMeFive(int start, int end) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (; start <= end; start++) {
            arrayList.add(start);
        }
        return (int) arrayList.stream().filter(o -> !(String.valueOf(o).contains("5"))).count();
    }

    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(4, 17));
    }
}
