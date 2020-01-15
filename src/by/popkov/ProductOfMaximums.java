package by.popkov;

//maxProduct ({4, 3, 5}, 2) ==>  return (20)
//        Explanation:
//        Since the size (k) equal 2 , then the subsequence of size 2 whose gives product of maxima is 5 * 4 = 20 .

import java.util.Arrays;

public class ProductOfMaximums {
    public static long maxProduct(int[] numbers, int sub_size) {
        return Arrays.stream(numbers)
                .sorted()
                .skip(numbers.length - sub_size)
                .asLongStream()
                .reduce((o1, o2) -> o1 * o2)
                .orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{0, 1}, 2));
    }
}
