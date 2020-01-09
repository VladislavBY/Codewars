package by.popkov;

public class LostWithoutaMap {
    public static int[] map(int[] arr) {
        int[] out = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[i] = arr[i] * 2;
        }
        return out;
    }
}
