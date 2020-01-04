package it.by;

import java.util.regex.Pattern;

public class Digit {
    public static boolean isDigit(String s) {
      return s.matches("[0-9]");
    }
}
