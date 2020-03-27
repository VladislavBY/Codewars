package by.popkov.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateEncoder {
    static String encode(String word) {
        final HashMap<String, Integer> chEncounter = new HashMap<>();
        String[] split = word.toLowerCase().split("");

        for (String s : split) {
            if (chEncounter.containsKey(s)) chEncounter.put(s, chEncounter.get(s) + 1);
            else chEncounter.put(s, 1);
        }
        return  Arrays.stream(split).map(s -> (chEncounter.get(s) < 2) ? "(" : ")").collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(encode("Success"));
    }
}
