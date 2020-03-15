package by.popkov.java8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BackspacesInString {
    public String cleanString(String s) {
        List<String> symbols = new LinkedList<>(Arrays.asList(s.split("")));
        for (int i = 0; i < symbols.size(); i++) {
            if (symbols.get(i).equals("#") && i > 0) {
                symbols.remove(i--);
                symbols.remove(i--);
            } else if (symbols.get(i).equals("#") && i == 0) {
                symbols.remove(i--);
            }
        }
        return String.join("", symbols);
    }

    public static void main(String[] args) {
        new BackspacesInString().cleanString("abc#d##c");
    }
}
