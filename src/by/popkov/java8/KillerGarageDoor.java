package by.popkov.java8;

public class KillerGarageDoor {
    static int doorPos = 0;
    static int moveSpeed = 0;

    static final char PUSH_BUTTON = 'P';
    static final char OBSTACLE_DETECTED = 'O';
    static final char NO_EVENT = '.';


    public static String run(String events) {
        StringBuilder stringBuilder = new StringBuilder();
        events.chars().forEachOrdered(o -> stringBuilder.append(move((char) o)));
        return stringBuilder.toString();
    }

    public static int move(char event) {
        if (moveSpeed > 0 && doorPos == 5) moveSpeed = 0;
        else if (moveSpeed < 0 && doorPos == 0) moveSpeed = 0;
        if (event == NO_EVENT) return doorPos += moveSpeed;
        if (event == PUSH_BUTTON) {
            if (moveSpeed == 0) up();
            else stop();
        } else if (event == OBSTACLE_DETECTED) revert();
        return doorPos += moveSpeed;
    }

    public static void up() {
        moveSpeed++;
    }

    public static void revert() {
        moveSpeed *= -1;
    }

    public static void stop() {
        moveSpeed = 0;
    }

    public static void main(String[] args) {
        System.out.println(run("P...."));
    }
}
