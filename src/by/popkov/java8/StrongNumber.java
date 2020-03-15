package by.popkov.java8;

//1! + 4! + 5! = 1 + 24 + 120 = 145
//        So, 145 is a Strong number.

public class StrongNumber {
    public static String isStrongNumber(int num) {
        String[] sNum = String.valueOf(num).split("");
        int sum = 0;
        for (int i = 0; i < sNum.length; i++) {
            int factorial = 1;
            for (int j = 0; j < Integer.parseInt(sNum[i]); j++) {
                factorial = factorial * (j + 1);
            }
            sum = sum + factorial;
        }
        if (sum == num) return "STRONG!!!!";
        return "Not Strong !!";
    }

    public static void main(String[] args) {
        System.out.println(isStrongNumber(145));
    }
}
