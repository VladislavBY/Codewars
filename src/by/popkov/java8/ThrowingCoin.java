package by.popkov.java8;

import java.util.Arrays;

public class ThrowingCoin {

    /**
     * In this kata you will be given an integer n, which is the number of times that is thown a coin.
     * You will have to return an array of string for all the possibilities (heads[H] and tails[T]). Examples:
     * <p>
     * coin(1) should return {"H", "T"}
     * coin(2) should return {"HH", "HT", "TH", "TT"}
     * coin(3) should return {"HHH", "HHT", "HTH", "HTT", "THH", "THT", "TTH", "TTT"}
     *
     * @param n the number of throw
     * @return the array of string for all the possibilities
     */
    public String[] coin(int n) {
        String[] combination = new String[(int) Math.pow(2, n)];
        for (int i = 0; i < Math.pow(2, n); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            Integer.toBinaryString(i)
                    .chars()
                    .map(o -> (o == '1') ? 'H' : 'T')
                    .forEachOrdered(o -> stringBuilder.append((char) o));
            while (stringBuilder.length() < n) stringBuilder.insert(0, 'T');
            combination[combination.length - (i+1)] = stringBuilder.toString();
        }
        return combination;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ThrowingCoin().coin(3)));
    }
}
