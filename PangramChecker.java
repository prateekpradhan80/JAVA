import java.util.*;
public class PangramChecker {

    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();

        boolean[] alphabetFound = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                alphabetFound[index] = true;
            }
        }

        for (boolean found : alphabetFound) {
            if (!found) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        boolean isPangram = isPangram(sentence);
        System.out.println("The sentence \"" + sentence + "\" is a pangram: " + isPangram);
    }
}

//if we take the sentence which include all alphabets "The quick brown fox jumps over the lazy dog"