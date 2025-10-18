import java.util.*;

public class GroupAnagramss {
    public static void main(String[] args) {

        // Example input
        String[] strs = {"eat","tea","tan","ate","nat","bat","tab"};

        // Call the method
        List<List<String>> result =groupAnagrams(strs);

        // Print result
        System.out.println("Grouped Anagrams: " + result);
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String c : strs) {
            char[] ch = c.toCharArray();
            Arrays.sort(ch); // sort characters
            String sorted = new String(ch); // key
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(c);
        }
        return new ArrayList<>(map.values());
    }

}