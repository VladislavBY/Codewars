package by.popkov;

import java.util.Arrays;

public class SortTheGiftCode {
    public String sortGiftCode(String code){
        StringBuilder outPut = new StringBuilder();
        String [] letters = code.split("");
        Arrays.sort(letters);
        for (String letter : letters) {
            outPut.append(letter);
        }
        return outPut.toString();
    }

    public static void main(String[] args) {
        SortTheGiftCode a = new SortTheGiftCode();
        System.out.println(a.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }
}
