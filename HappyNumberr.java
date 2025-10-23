import java.util.HashSet;

public class HappyNumberr {
    public static void main(String[] args) {

        int n1 = 19;
        int n2 = 2;

        System.out.println(n1 + " → " + isHappy(n1)); // true
        System.out.println(n2 + " → " + isHappy(n2)); // false
    }



    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) return false; // cycle detected
            seen.add(n);
            n = getNext(n);
        }
        return true;
    }

    private static int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

}