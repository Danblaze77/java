import java.util.Scanner;
public class PigLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        sc.close();

        String pigLatin = convertToPigLatin(word);
        System.out.println(" Your Pig Latin string is: " + pigLatin);
    }

    public static String convertToPigLatin(String word) {
        if (word.length() == 0) {
            return "";
        }

        char firstChar = word.charAt(0);

        if (isVowel(firstChar) || firstChar == 'y' || firstChar == 'Y') {
            return word + "ay";
        } else {
            int firstVowelIndex = findFirstVowelIndex(word);
            String prefix = word.substring(0, firstVowelIndex);
            String suffix = word.substring(firstVowelIndex);
            return suffix + prefix + "ay";
        }
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int findFirstVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                return i;
            }
        }
        return 0;
    }
}
