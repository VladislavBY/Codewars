package by.popkov;

public class PangramChecker {
    public boolean check(String sentence) {
        return 26 == sentence.toLowerCase()
                .replaceAll("[^a-z]", "")
                .chars()
                .distinct()
                .count();
    }
}
