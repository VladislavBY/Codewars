package by.popkov.java8;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        StringBuilder stringBuilder = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(o -> stringBuilder.append((char) o));
        return stringBuilder.toString();
    }
}
