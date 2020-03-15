package by.popkov.java8;

import java.util.Arrays;

public class JadenCase {
    public String toJadenCase(String phrase) {
        StringBuilder outPut = new StringBuilder();
        if (phrase != null && phrase.length()>0) {
            Arrays.stream(phrase.split(" "))
                    .map(o -> o.replaceFirst("[A-Za-z]", o.substring(0, 1).toUpperCase()))
                    .forEach(o -> outPut.append(o).append(" "));
            return outPut.toString().trim();
        }
        return null;
    }

    public static void main(String[] args) {
        JadenCase jc = new JadenCase();
        System.out.println(jc.toJadenCase("most trees are blue"));
    }
}
