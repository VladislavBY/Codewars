package by.popkov.java8;

public class Maskify {
    public static String maskify(String str) {
        if (str.length() > 4) {
            return str.substring(0, str.length() - 4).replaceAll(".", "#") + str.substring(str.length() - 4);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(maskify(""));
    }
}
