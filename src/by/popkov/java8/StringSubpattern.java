package by.popkov.java8;

public class StringSubpattern {
    public static boolean hasSubpattern(String str) {
        int sttLength = str.length();
        if (sttLength == 0) return false;
        for (int lengthOfSubpattern = 1; lengthOfSubpattern <= sttLength / 2; lengthOfSubpattern++) {
            if (str.matches("(" + str.substring(0, lengthOfSubpattern) + ")" + "{2,}")) return true;
        }
        return false;
    }
}
