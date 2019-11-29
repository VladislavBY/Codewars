package it.by;
//In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//
//        Example:
//
//        highAndLow("1 2 3 4 5")  // return "5 1"
//        highAndLow("1 2 -3 4 5") // return "5 -3"
//        highAndLow("1 9 3 4 -5") // return "9 -5"
//        Notes:
//
//        All numbers are valid Int32, no need to validate them.
//        There will always be at least one number in the input string.
//        Output string must be two numbers separated by a single space, and highest number is first.


import java.util.ArrayList;
import java.util.Collections;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        String re = "";
        numbers += " "; //fix ArrayIndexOutOfBoundsException
        byte[] byt = numbers.getBytes();
        ArrayList<Integer> numberArray = new ArrayList<>();

        for (int i = 0; i < byt.length; i++) {
            if (byt[i] == 32) continue;
            else if (byt[i] == 45) {
                if (byt[i + 2] == 32) {
                    numberArray.add(0 - byteToInt(byt[i + 1]));
                    i++;
                } else if (byt[i + 3] == 32) {
                    numberArray.add(0 - (byteToInt(byt[i + 1]) * 10 + byteToInt(byt[i + 2])));
                    i = i + 2;
                } else if (byt[i + 4] == 32) {
                    numberArray.add(0 - (byteToInt(byt[i + 1]) * 100 + byteToInt(byt[i + 2]) * 10 + byteToInt(byt[i + 3])));
                    i = i + 3;
                }
            } else {
                if (byt[i + 1] == 32) {
                    numberArray.add(byteToInt(byt[i]));
                    i++;
                } else if (byt[i + 2] == 32) {
                    numberArray.add(byteToInt(byt[i]) * 10 + byteToInt(byt[i + 1]));
                    i = i + 2;
                } else if (byt[i + 3] == 32) {
                    numberArray.add(byteToInt(byt[i]) * 100 + byteToInt(byt[i + 1]) * 10 + byteToInt(byt[i + 2]));
                    i = i + 3;
                }


            }
        }
        Collections.sort(numberArray);
        re += numberArray.get(numberArray.size() - 1) + " " + numberArray.get(0);
        return re;
    }

    public static int byteToInt(byte b) {
        int i = 0;
        switch (b) {
            case 48:
                i = 0;
                break;
            case 49:
                i = 1;
                break;
            case 50:
                i = 2;
                break;
            case 51:
                i = 3;
                break;
            case 52:
                i = 4;
                break;
            case 53:
                i = 5;
                break;
            case 54:
                i = 6;
                break;
            case 55:
                i = 7;
                break;
            case 56:
                i = 8;
                break;
            case 57:
                i = 9;
                break;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}
