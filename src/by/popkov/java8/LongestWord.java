package by.popkov.java8;

public class LongestWord {
    public static String longestWord(String wordString) {
        wordString = wordString.trim();
        String[] a = wordString.split(" ");
        String longest = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() >= longest.length()) {
                longest = a[i];
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestWord("red blue grey"));
    }
}
