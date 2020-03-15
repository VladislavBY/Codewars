package by.popkov.java8;
// Kata.Vowel2Index("this is my string") == "th3s 6s my str15ng"
// Kata.Vowel2Index("Codewars is the best site in the world") == "C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheOldSwitcheroo {
    public static String vowel2Index(String s) {
        StringBuilder newS = new StringBuilder(s);
        newS.setLength(s.length() * 10);
        Pattern p = Pattern.compile("[aeiouAEIOU]");
        Matcher m = p.matcher(newS);
        int[] pos = new int[s.length()];
        for (int i = 0; m.find(); i++) {
            pos[i] = m.start() + 1;
        }
        m.reset();
        for (int i = 0; m.find(); i++) {
            newS.deleteCharAt(m.start());
            newS.insert(m.start(), pos[i]);
        }
        return newS.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(vowel2Index("Codewars is the best site in the world"));
    }
}
