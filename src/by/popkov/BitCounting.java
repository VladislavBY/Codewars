package by.popkov;


public class BitCounting {

    /**
     * Write a function that takes an integer as input, and returns the number of bits
     * that are equal to one in the binary representation of that number.
     * You can guarantee that input is non-negative.
     * <p>
     * Example: The binary representation of 1234 is 10011010010,
     * so the function should return 5 in this case
     *
     * @param n the non-negative integer
     * @return the number of bits that are equal to one in the binary representation of that number
     */
    public static int countBits(int n) {
        return (int) Integer.toBinaryString(n)
                .chars()
                .filter(i -> i == '1')
                .count();
    }

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
}
