import java.util.Scanner;

public class ReverseWords {
    public static String reverseWords(String sentence) {
        // Split sentence into words (by spaces)
        String[] words = sentence.trim().split("\\s+");

        // Use StringBuilder to reverse order
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String reversed = reverseWords(sentence);
        System.out.println("Reversed Words: " + reversed);
         sc.close();
    }
   
}
