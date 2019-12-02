package it.by;

//Write a function named repeater() that takes two arguments (a string and a number), and returns a new string where the input string is repeated that many times.
//
//        Example:
//        Repeater.repeat("a", 5)
//        should return
//
//        "aaaaa"

public class RepeaterString {
    public static String repeat(String string, long n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            output += string;
        }
        return output;
    }
}
