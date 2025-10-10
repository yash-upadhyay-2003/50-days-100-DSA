public class Sqrt {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int left = 1, right = x / 2, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = 1L * mid * mid;
            if (sq == x) return mid;
            if (sq < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Sqrt sol = new Sqrt();
        if (args.length > 0) {
            for (String a : args) {
                try {
                    int x = Integer.parseInt(a);
                    System.out.printf("mySqrt(%d) = %d%n", x, sol.mySqrt(x));
                } catch (NumberFormatException e) {
                    System.err.println("Invalid integer argument: " + a);
                }
            }
            return;
        }

        int[] tests = {0, 1, 4, 8, 15, 2147395599};
        for (int t : tests) {
            System.out.printf("mySqrt(%d) = %d%n", t, sol.mySqrt(t));
        }
    }
}
