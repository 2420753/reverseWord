import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args)
    {

        // Requirements:
        // User must enter a word
        // Constraints:
        // The word must be reversed and stored in a string
        reverseString();

    }

    static String reverseString() {
        System.out.print("Enter a word to reverse: ");
        String word = stdin.nextLine();
        char[] reversedWord = new char[word.length()];


        for (int i = 0; i < reversedWord.length; i++) {
            reversedWord[i] = word.charAt(word.length() - i - 1);

        }
        System.out.println(reversedWord);
        return word;
    }

}