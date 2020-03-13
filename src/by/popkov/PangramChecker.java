package by.popkov;

public class PangramChecker {
    /**
     * A pangram is a sentence that contains every single letter of the alphabet at least once.
     * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
     * because it uses the letters A-Z at least once (case is irrelevant).
     *
     * Given a string, detect whether or not it is a pangram.
     * Return True if it is, False if not. Ignore numbers and punctuation.
     * @param sentence the string for pangram check
     * @return True if sentence is pangram, false if not
     */
    public boolean check(String sentence) {
        return 26 == sentence.toLowerCase()
                .replaceAll("[^a-z]", "")
                .chars()
                .distinct()
                .count();
    }
}
