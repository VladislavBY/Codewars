package it.by;

//Input:
//
//        > 6
//        Output:
//
//        0+1+2+3+4+5+6 = 21
//
//        Input:
//
//        > -15
//        Output:
//
//        -15<0
//
//        Input:
//
//        > 0
//        Output:
//
//        0=0


public class SumOfNumbersFrom0ToN {
    private static String showSequence(int value) {
        String text = "";
        int sum = 0;
        if (value < 0) {
            text = value + "<0";
        } else if (value > 0) {
            for (int i = 0; i <= value; i++) {
                if (i != value) {
                    text += i + "+";

                } else {
                    text += i;
                }
                sum += i;
            }
            text += " = " + sum;
        } else if (value == 0) {
            text += "0=0";
        }

        return text;
    }

    public static void main(String[] args) {
        System.out.println(showSequence(0));
    }
}
