package it.by;

//        Your car is old, it breaks easily. The shock absorbers are gone and you think it can handle about 15 more bumps before it dies totally.
//        Unfortunately for you, your drive is very bumpy! Given a string showing either flat road ("_") or bumps ("n"), work out if you make it home safely.
//        15 bumps or under, return "Woohoo!", over 15 bumps return "Car Dead".

public class BumpsInTheRoad {
    public static String bumps(final String road) {
        int counter = 0;
        char[] charRoad = road.toCharArray();
        for (char c : charRoad) {
            if (c == 'n') {
                counter++;
            }
        }
        //return (counter < 16) ? "Woohoo!" : "Car Dead";
        if (counter < 16) {
            return "Woohoo!";
        } else {
            return "Car Dead";
        }

    }
}
