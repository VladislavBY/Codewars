package by.popkov;

import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {
    /**
     * "abcde" -> 0 # no characters repeats more than once
     * "aabbcde" -> 2 # 'a' and 'b'
     * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
     * "indivisibility" -> 1 # 'i' occurs six times
     * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
     * "aA11" -> 2 # 'a' and '1'
     * "ABBA" -> 2 # 'A' and 'B' each occur twice
     *
     * @param text String text for count duplicate
     * @return the count of distinct case-insensitive alphabetic characters and numeric digits
     */
    public static int duplicateCount(String text) {
        Set<Character> allAppears = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char ch : text.toLowerCase().toCharArray()) {
            if (allAppears.contains(ch)) duplicates.add(ch);
            else allAppears.add(ch);
        }
        return duplicates.size();
    }
}
