package by.popkov;

//         isIsogram "Dermatoglyphics" == true
//        isIsogram "aba" == false
//        isIsogram "moOse" == false -- ignore letter case


public class Isograms {
    public static boolean isIsogram(String str) {
        String low = str.toLowerCase();
        char[] ch = low.toCharArray();
        for (char c : ch) {
            int counter = 0;
            for (char value : ch) {
                if (c == value) counter++;
                if (counter > 1) return false;
            }
        }
        return true;
    }
}
