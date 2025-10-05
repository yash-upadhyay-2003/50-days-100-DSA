public class IntegerToRoman {
    public String intToRoman(int num) {
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M",  "CM", "D",  "CD", "C",  "XC", "L",
                                  "XL", "X",  "IX", "V",  "IV", "I"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; ++i) {
            if (num == 0)
                break;
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
    IntegerToRoman s = new IntegerToRoman();

        System.out.println(s.intToRoman(3));     // III
        System.out.println(s.intToRoman(4));     // IV
        System.out.println(s.intToRoman(9));     // IX
        System.out.println(s.intToRoman(58));    // LVIII
        System.out.println(s.intToRoman(1994));  // MCMXCIV
    }
}
