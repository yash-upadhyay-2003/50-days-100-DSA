import java.util.*;

public class MinimumSizeSubarraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.println(minSubArrayLen(target, nums));
        sc.close();
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, left = 0, sum = 0, minLen = Integer.MAX_VALUE;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
