package by.popkov;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ThinkingTestingConcat {
    public static int[] testit(int[] a, int[] b) {
       IntStream aStream = Arrays.stream(a).distinct();
       IntStream bStream = Arrays.stream(b).distinct();
       return IntStream.concat(aStream, bStream).sorted().toArray();
    }
}
