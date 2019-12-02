package it.by;

//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
//
//        Examples
//        "This is an example!" ==> "sihT si na !elpmaxe"
//        "double  spaces"      ==> "elbuod  secaps"

import java.util.Arrays;

public class ReverseWords {
    public static String reverseWords(final String original) {
        char[] ch = original.toCharArray();
        String output = "";
        for (int i = 0; i < ch.length / 2; i++) {
            char hash = ch[i];
            ch[i] = ch [ch.length - 1 - i];
            ch [ch.length - 1 - i] = hash;

        }
        for (char c : ch) {
            output += c;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println((reverseWords("double  spaces")) );
    }
}
//Переворачивается всё, а нужно перевернуть каждое слово в отдельности
//Now is reversing everything, but need reverse every words separately