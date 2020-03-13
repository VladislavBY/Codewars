package by.popkov;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;


public class YourOrderStream {

    /**
     * Your task is to sort a given string. Each word in the string will contain a single number.
     * This number is the position the word should have in the result.
     * <p>
     * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
     * <p>
     * If the input string is empty, return an empty string.
     * The words in the input String will only contain valid consecutive numbers.
     * <p>
     * Examples
     * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
     * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
     * ""  -->  ""
     *
     * @param words the string will contain a single number
     * @return the sorted string
     */
    public static String order(String words) {
        if (words.isEmpty()) return "";
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("[^1-9]", ""))))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(order("o1 b2 c4 d3"));
    }
}
