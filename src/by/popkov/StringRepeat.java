package by.popkov;

//Write a function called repeatString which repeats the given String src exactly count times.
//
//        repeatStr(6, "I") // "IIIIII"
//        repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String out = "";
        for (int i = 0; i < repeat; i++) {
            out += string;
        }
        return out;
    }
}
