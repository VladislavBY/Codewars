package it.by;

public class BasicMathematicalOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        int out = 0;
        switch (op) {
            case "+":
                out = v1 + v2;
                break;
            case "-":
                out = v1 - v2;
                break;
            case "*":
                out = v1 * v2;
                break;
            case "/":
                out = v1 / v2;
                break;
        }
        return out;
    }
}
