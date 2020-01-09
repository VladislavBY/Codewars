package by.popkov;

public class AlphabeticalAddition {
    public static String addLetters(String... letters) {
        String abc = "zabcdefghijklmnopqrstuvwxyz";
        int sum = 0;
        for (String letter : letters) {
            sum += abc.indexOf(letter);
        }
        return String.valueOf(abc.charAt(sum % 26));
    }

    public static void main(String[] args) {
        System.out.println(addLetters("y", "c", "b"));
    }
}
