package by.popkov.java8;

public class StringEnd {
    public static boolean solution(String str, String ending) {
        if (ending.length() <= str.length()) return str.substring(str.length() - ending.length()).equals(ending);
        else return false;
    }
}
