package by.popkov.java8;

//Mr. Square is going on a holiday. He wants to bring 2 of his favorite squares with him, so he put them in his rectangle suitcase.
//
//        Write a function that, given the size of the squares and the suitcase, return whether the squares can fit inside the suitcase.

public class SuitcasePacking {
    public static Boolean fit_in(int a, int b, int m, int n) {
        if (a * 2 <= m && b <= n) return true;
        if (a * 2 <= n && b <= m) return true;
        if (a <= m && b * 2 <= n) return true;
        if (a <= n && b * 2 <= m) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(fit_in(1, 2, 3, 2));
    }
}
