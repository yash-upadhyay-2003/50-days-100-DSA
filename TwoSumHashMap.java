import java.util.HashMap;
import java.util.Scanner;

public class WordPatternSolution {

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        // If lengths don't match, pattern can't match
        if (pattern.length() != words.length)
            return false;
        
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            
            // If pattern character already mapped, check consistency
            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word))
                    return false;
            } 
            // If word already mapped, check consistency
            else if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != ch)
                    return false;
            } 
            else {
                // Create new mappings both ways
                charToWord.put(ch, word);
                wordToChar.put(word, ch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input pattern and string
        System.out.print("Enter pattern: ");
        String pattern = sc.nextLine();
        
        System.out.print("Enter string s: ");
        String s = sc.nextLine();
        
        boolean result = wordPattern(pattern, s);
        System.out.println("Follows pattern? " + result);
        
        sc.close();
    }
}
