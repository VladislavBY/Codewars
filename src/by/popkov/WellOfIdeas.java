package by.popkov;

public class WellOfIdeas {
    public static String well(String[] x) {
        int counter = 0;
        for (String s : x) {
            if (s.equals("good")) {
                counter++;
            }
        }
        if (counter == 0) {
            return "Fail!";
        } else if (counter == 1 || counter == 2) {
            return "Publish!";
        } else {
            return "I smell a series!";
        }
    }

}
