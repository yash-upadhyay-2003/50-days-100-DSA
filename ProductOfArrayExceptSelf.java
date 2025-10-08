public class ProductOfArrayExceptSelf{
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;

        for (int i = 1; i < n; i++)
            res[i] = res[i - 1] * nums[i - 1];

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right *= nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf s = new ProductOfArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] ans = s.productExceptSelf(nums);
        for (int x : ans) System.out.print(x + " ");
    }
}
