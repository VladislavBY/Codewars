package by.popkov;

public class SpinWords {

    /**
     * Write a function that takes in a string of one or more words,
     * and returns the same string, but with all five
     * or more letter words reversed (Just like the name of this Kata).
     * Strings passed in will consist of only letters and spaces.
     * Spaces will be included only when more than one word is present.
     * <p>
     * Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
     * spinWords( "This is a test") => returns "This is a test"
     * spinWords( "This is another test" )=> returns "This is rehtona test"
     *
     * @param sentence the string sentence
     * @return the same string, but with all five or more letter words reversed
     */

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > 4) {
                sb.append(new StringBuilder(word).reverse()).append(" ");
            } else sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new SpinWords().spinWords("Welcome to home"));
    }
}
