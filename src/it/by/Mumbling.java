package it.by;

//This time no story, no theory. The examples below show you how to write function accum:
//
//        Examples:
//
//        accum("abcd") -> "A-Bb-Ccc-Dddd"
//        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//        accum("cwAt") -> "C-Ww-Aaa-Tttt"
//        The parameter of accum is a string which includes only letters from a..z and A..Z.

public class Mumbling {
    public static String accum(String s) {
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        String output = "";
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    output += (char) (ch[i] - 32);
                    continue;
                }
                output += ch[i];

            }
            if (i != ch.length - 1) {
                output += "-";
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(accum("RqaEzty"));
    }
}
