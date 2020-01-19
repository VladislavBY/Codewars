package by.popkov;

//In this kata you get the start number and the end number of a region and should return the count of all numbers except numbers with a 5 in it.
//        The start and the end number are both inclusive!

public class DontGiveMeFive {
    public static int dontGiveMeFive(int start, int end) {
        int outPut = 0;
        for (; start <= end; start++) {
            if (String.valueOf(start).indexOf('5') < 0) outPut++;
        }
        return outPut;
    }

    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(4, 17));
    }
}
