package chapter6;
/*
(Generate random characters) Use the methods in RandomCharacter in Listing
6.10 to print 100 uppercase letters and then 100 single digits, printing ten per line.
*/

public class Exercise_06_38 {
    public static void main(String[] args) {
        final int NUMBER_OF_UPPERCASE_LETTERS = 100; // Number of uppercase letters
        final int NUMBER_OF_SINGLE_DIGITS = 100;    // Number of single digits
        final int NUMBERS_PER_LINE = 10; // Print 10 characters per line

        // Print 100 uppercase letters
        for (int i = 1; i <= NUMBER_OF_UPPERCASE_LETTERS; i++) {
            System.out.print(RandomCharacter.getRandomUpperCaseLetter());
            System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
        }

        // Print 100 single digits
        for (int i = 1; i <= NUMBER_OF_SINGLE_DIGITS; i++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter());
            System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
        }
    }
}

class RandomCharacter {
    /**
     * Generate a random character between ch1 and ch2
     */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /**
     * Generate a random lowercase letter
     */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /**
     * Generate a random uppercase letter
     */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /**
     * Generate a random digit character
     */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /**
     * Generate a random character
     */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
