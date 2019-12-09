package it.by;

public class FoldingYourWayToTheMoon {
    public static Long fold(Double distance) {
        if (distance >= 0) {
            long outPut = (long) Math.ceil (Math.log(distance / 0.0001) / Math.log(2.0));
            return (outPut >= 0) ? outPut : 0;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(fold(2240884.952719969));
    }
}
