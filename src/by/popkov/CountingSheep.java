package by.popkov;

public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean sheep: arrayOfSheeps) {
            if (sheep!=null && sheep)
                counter++;

        }
        return counter;
    }
}
