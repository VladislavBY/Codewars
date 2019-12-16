package it.by;

//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
//
//        Examples input/output:
//
//        XO("ooxx") => true
//        XO("xooxx") => false
//        XO("ooxXm") => true
//        XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//        XO("zzoo") => false

public class XO {
    public static boolean getXO(String str) {
        int counterX = 0;
        int counterY = 0;
        byte[] styByte = str.getBytes();
        for (byte b : styByte) {
            if (b == 120 || b == 88) {
                counterX++;
            } else if (b == 111 || b == 79) {
                counterY++;
            }
        }
        return counterX == counterY;
    }
}
