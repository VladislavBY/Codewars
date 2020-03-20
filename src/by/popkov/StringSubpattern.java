package by.popkov;

public class StringSubpattern {
    public static boolean hasSubpattern(String str) {
        int sttLength = str.length();
        if (sttLength == 0) return false;
        for (int lengthOfSubpattern = 1; lengthOfSubpattern <= sttLength / 2; lengthOfSubpattern++) {
            if (str.replace(str.substring(0, lengthOfSubpattern), "").length() == 0) return true;
        }
        return false;
    }
}
