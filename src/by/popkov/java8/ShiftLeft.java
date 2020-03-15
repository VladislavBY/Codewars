package by.popkov.java8;

//Implement a function that calculates the minimum number of moves that should be performed to make the given strings equal.

public class ShiftLeft {
    public static int shiftLeft(String a, String b) {
        StringBuilder sbA = new StringBuilder(a);
        StringBuilder sbB = new StringBuilder(b);
        int i = 0;
        while (!sbA.toString().equals(sbB.toString())) {
            if (sbA.length() > sbB.length()) {
                sbA.deleteCharAt(0);
            } else {
                sbB.deleteCharAt(0);
            }
            i++;
        }
        System.out.println("a: " + sbA + " b: " + sbB);
        return i;
    }

    public static void main(String[] args) {
        System.out.println(shiftLeft("pony", "ny"));
    }
}