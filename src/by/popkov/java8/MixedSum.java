package by.popkov.java8;

import java.util.List;

public class MixedSum {
    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object o : mixed) {
            if (o instanceof String) {
                sum += Integer.parseInt((String) o);
            } else if (o instanceof Integer) {
                sum += (Integer) o;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
