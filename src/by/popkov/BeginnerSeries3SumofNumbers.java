package by.popkov;

//Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. If the two numbers are equal return a or b.
//
//        Note: a and b are not ordered!
//
//        Examples
//        GetSum(1, 0) == 1   // 1 + 0 = 1
//        GetSum(1, 2) == 3   // 1 + 2 = 3
//        GetSum(0, 1) == 1   // 0 + 1 = 1
//        GetSum(1, 1) == 1   // 1 Since both are same
//        GetSum(-1, 0) == -1 // -1 + 0 = -1
//        GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2


public class BeginnerSeries3SumofNumbers {
    public int GetSum(int a, int b) {
        int out = 0;
        if (a == b) {
            out = a;
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                out += i;
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                out += i;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        BeginnerSeries3SumofNumbers a = new BeginnerSeries3SumofNumbers();
        System.out.println(a.GetSum(0, -1));
    }
}
