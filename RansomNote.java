public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null) return true;
        if (magazine == null) return false;

        int[] counts = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            counts[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int idx = ransomNote.charAt(i) - 'a';
            if (--counts[idx] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
       
        System.out.println(sol.canConstruct("aa", "ab")); // false
        System.out.println(sol.canConstruct("aa", "aab")); // true
    }
}
