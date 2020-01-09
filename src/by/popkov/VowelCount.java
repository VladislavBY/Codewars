package by.popkov;

//Return the number (count) of vowels in the given string.
//
//        We will consider a, e, i, o, and u as vowels for this Kata.
//
//        The input string will only consist of lower case letters and/or spaces.

public class VowelCount {
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] charStr = str.toCharArray();
        for (char c : charStr) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
