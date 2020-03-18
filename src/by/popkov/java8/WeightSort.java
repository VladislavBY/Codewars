package by.popkov.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeightSort {
    public static String orderWeight(String strng) {
        return Arrays.stream(strng.split(" "))
                .sorted((s1, s2) -> (s1.chars().map(Character::getNumericValue).sum())
                        != (s2.chars().map(Character::getNumericValue).sum())
                        ? s1.chars().map(Character::getNumericValue).sum()
                        - s2.chars().map(Character::getNumericValue).sum() : s1.compareTo(s2))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}