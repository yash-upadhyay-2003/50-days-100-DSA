public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (char c : t.toCharArray()) count[c - 'a']--;

        for (int n : count)
            if (n != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1)); // true

        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s2, t2)); // false

        String s3 = "";
        String t3 = "";
        System.out.println(isAnagram(s3, t3)); // true
    }
}
