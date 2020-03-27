package by.popkov.java8;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEncoder {
    static String encode(String word) {
        Set<String> characters = new HashSet<>();
        String[] split = word.split("");

        for (int i = 0; i < split.length; i++) {
            if (characters.contains(split[i])) split[i] = ")";
            else {
                characters.add(split[i]);
                split[i] = "(";
            }
        }

        return String.join("", split);
    }

    public static void main(String[] args) {
        System.out.println(encode("din"));
    }
}
