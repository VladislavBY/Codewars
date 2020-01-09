package by.popkov;

public class ShortestWord {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int min = Integer.MAX_VALUE;
        for (String word : words) {
            if (word.length() < min) {
                min = word.length();
            }
        }
        return min;
    }
}
