package by.popkov;

import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        StringBuilder outPut = new StringBuilder();
        StringBuilder word = new StringBuilder();
        Arrays.stream(s)
                .sorted()
                .limit(1)
                .forEach(o -> word.append(o));

        String[] letters = word.toString().split("");
        for (int i = 0; i < letters.length; i++) {
            outPut.append(letters[i]);
            if (i == letters.length - 1) {
                break;
            }
            outPut.append("***");
        }
        return outPut.toString();
    }

    public static void main(String[] args) {
        System.out.println(twoSort(new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows"}));
    }
}
