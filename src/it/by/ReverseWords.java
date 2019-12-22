package it.by;

//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
//
//        Examples
//        "This is an example!" ==> "sihT si na !elpmaxe"
//        "double  spaces"      ==> "elbuod  secaps"

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseWords {
    public static String reverseWords(final String original) {
        StringBuilder text = new StringBuilder();
        Pattern p = Pattern.compile(" ");
        String[] words = p.split(original);
        for (String word : words) {
            StringBuilder rev = new StringBuilder(word);
            rev.reverse();
            text.append(rev);
        }
        Matcher m = p.matcher(original);
        while (m.find()) {
            text.insert(m.start(), " ");
        }
        return text.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("double  spaced  words"));
    }
}


