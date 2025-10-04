public class OptimisedPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        OptimisedPalindrome obj = new OptimisedPalindrome();
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama")); 
        System.out.println(obj.isPalindrome("race a car")); 
        System.out.println(obj.isPalindrome("No lemon, no melon")); 
    }
}
