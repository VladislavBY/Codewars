package by.popkov.java8;

public class ConsonantValue {
    /**
     * Given a lowercase string that has alphabetic characters only and no spaces,
     * return the highest value of consonant substrings.
     * Consonants are any letters of the alpahabet except "aeiou".
     *
     * @param s  the lowercase string
     * @return the highest value of consonant substrings
     */
    public static int solve(final String s) {
        int maxSum = 0;
        for (String consonantSequence : s.split("[aeiou]+")) {
            int sum = consonantSequence.chars().sum() - (consonantSequence.length() * 96);
            if (sum > maxSum) maxSum = sum;
        }
        return maxSum;
    }
}
