package it.by;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicateWords {
    public static String removeDuplicateWords(String s) {
        StringBuilder text = new StringBuilder();
        String[] words = new String[0];
        Pattern p = Pattern.compile("[A-Za-z]+");
        Matcher m = p.matcher(s);
        while (m.find()) {
            boolean check = true;
            for (String word : words) {
                if (word.equals(m.group())) {
                    check = false;
                    break;
                }
            }
            if (check) {
                words = Arrays.copyOf(words, words.length + 1);
                words[words.length - 1] = m.group();
            }
        }
        for (String word : words) {
            text.append(word).append(" ");
        }
        return text.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
    }

}
