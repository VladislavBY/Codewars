package by.popkov.java8;

public class DigitalRoot {

    /**
     * A digital root is the recursive sum of all the digits in a number.
     * Given n, take the sum of the digits of n.
     * If that value has more than one digit,
     * continue reducing in this way until a single-digit number is produced.
     * This is only applicable to the natural numbers.
     *
     * digital_root(942)
     * => 9 + 4 + 2
     * => 15 ...
     * => 1 + 5
     * => 6
     *
     * @param n the number
     * @return the recursive sum of all the digits in a number
     */
    public static int digital_root(int n) {
        while (n > 9) {
            n = String.valueOf(n).chars().map((o) -> o - 48).reduce(Integer::sum).orElse(0);
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(16));
    }
}
