package by.popkov.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWordsStream {
    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(o -> o.length() > 4 ? new StringBuilder(o).reverse().toString() : o)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(new SpinWordsStream().spinWords("Welcome to home"));
    }
}
