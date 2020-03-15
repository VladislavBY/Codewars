package by.popkov.java8;

public class DisariumNumber {
    public static String disariumNumber(int number) {
        String[] sNum = String.valueOf(number).split("");
        double sum = 0;
        for (int i = 0; i < sNum.length; i++) {
            sum = sum + Math.pow(Integer.parseInt(sNum[i]), i + 1);
        }
        if (sum==number) return "Disarium !!";
        return "Not !!";
    }

    public static void main(String[] args) {
        System.out.println(disariumNumber(89));
    }
}
