class IndexOfFirstOccurance {
    public int strStr(String haystack, String needle) {
        final int m = haystack.length();
        final int n = needle.length();

        for (int i = 0; i <= m - n; i++) {
            if (haystack.substring(i, i + n).equals(needle))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        IndexOfFirstOccurance obj = new IndexOfFirstOccurance();

        System.out.println(obj.strStr("hello", "ll"));
        System.out.println(obj.strStr("aaaaa", "bba"));
        System.out.println(obj.strStr("abc", ""));
    }
}
