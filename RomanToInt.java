import java.util.*;

public class RomanToInt {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int value = map.get(s.charAt(i));
            if (i + 1 < n && value < map.get(s.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        RomanToInt obj = new RomanToInt();
        System.out.println(obj.romanToInt("III"));    // 3
        System.out.println(obj.romanToInt("IV"));     // 4
        System.out.println(obj.romanToInt("IX"));     // 9
        System.out.println(obj.romanToInt("LVIII"));  // 58
        System.out.println(obj.romanToInt("MCMXCIV"));// 1994
    }
}
