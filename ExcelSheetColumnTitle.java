class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; 
            int remainder = columnNumber % 26;
            char ch = (char) ('A' + remainder);
            result.append(ch);
            columnNumber /= 26;
        }
        
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.convertToTitle(1));   // A
        System.out.println(sol.convertToTitle(28));  // AB
        System.out.println(sol.convertToTitle(701)); // ZY
        System.out.println(sol.convertToTitle(702)); // ZZ
        System.out.println(sol.convertToTitle(703)); // AAA
    }
}
