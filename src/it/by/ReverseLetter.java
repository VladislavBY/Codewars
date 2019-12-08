package it.by;

//Task
//        Given a string str, reverse it omitting all non-alphabetic characters.
//
//        Example
//        For str = "krishan", the output should be "nahsirk".
//
//        For str = "ultr53o?n", the output should be "nortlu".
//
//        Input/Output
//        [input] string str
//
//        A string consists of lowercase latin letters, digits and symbols.
//
//        [output] a string

import java.util.ArrayList;

public class ReverseLetter {
    public static String reverseLetter(final String str) {
        StringBuilder outPut = new StringBuilder();
        byte[] bytes = str.getBytes();
        ArrayList<Character> letters = new ArrayList<>();
        for (byte aByte : bytes) {
            if ((aByte > 64 && aByte < 91) || (aByte > 96 && aByte < 123)) {
                letters.add((char) aByte);
            }
        }
        for (int i = letters.size() - 1; i >= 0; i--) {
            outPut.append(letters.get(i));
        }
        return outPut.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseLetter("Po1ny"));
    }
}
