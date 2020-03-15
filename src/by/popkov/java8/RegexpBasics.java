package by.popkov.java8;

public class RegexpBasics {
    public static boolean isLetter(String s) {
        return s.matches("[A-Za-z]");
    }

    public static void main(String[] args) {
        System.out.println(isLetter("ab"));
        System.out.println(isLetter("a"));
    }
}
