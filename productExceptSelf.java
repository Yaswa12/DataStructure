import java.util.Arrays;

public class ProductExpSelf {

    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] left = new int[N];
        int[] right = new int[N];
        left[0] = 1;
        for (int i = 1; i < N; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[N - 1] = 1;
        for (int i = N - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] ans = new int[N];

        // Fill the result array
        for (int i = 0; i < N; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        ProductExpSelf proexeself = new ProductExpSelf();
        int[] nums = { 1, 2, 3, 4 };
        int[] result = proexeself.productExceptSelf(nums);

        // Print the result array
        System.out.println(Arrays.toString(result));
    }
}
