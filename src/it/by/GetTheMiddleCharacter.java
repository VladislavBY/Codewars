package it.by;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        String output = "";
        char[] chWord = word.toCharArray();
        if (chWord.length % 2 == 0) {
            output = output + chWord[chWord.length / 2 - 1] + chWord[chWord.length / 2];
        } else {
            output = output + chWord[chWord.length / 2];
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("homeless"));
    }
}
