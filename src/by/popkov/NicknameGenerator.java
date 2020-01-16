package by.popkov;

public class NicknameGenerator {
    public static String nickname(String name) {
        if (name.length() > 3) {
            if (!name.substring(2, 3).matches("[aeiouAEIOU]")) {
                return name.substring(0, 3);
            } else return name.substring(0, 4);
        } else return "Error: Name too short";
    }

    public static void main(String[] args) {
        System.out.println(nickname("Saamntha"));
    }
}
