package it.by;

//Welcome. In this kata, you are asked to square every digit of a number.
//
//        For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//        Note: The function accepts an integer and returns an integer

public class SquareEveryDigit {
    public int squareDigits(int n) {
        String stN = String.valueOf(n);
        int [] nums = new int[stN.length()];
        StringBuilder stOut = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(stN.substring(i, i+1));
        }
        for (int num : nums) {
            stOut.append(num*num);
        }
        return Integer.parseInt(stOut.toString());
    }

    public static void main(String[] args) {
        SquareEveryDigit a = new SquareEveryDigit();
        System.out.println(a.squareDigits(9119));
    }
}
