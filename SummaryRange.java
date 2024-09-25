import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result; // Return empty list if input array is empty
        }

        int start = 0; // Start of the current range

        for (int i = 0; i < nums.length; i++) {
            // Check if we're at the end of the array or if nums[i+1] is not consecutive
            if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
                if (start == i) {
                    // Single element range
                    result.add(String.valueOf(nums[start]));//handling when a number is not part of a range.
                } else {
                    // Range with multiple elements
                    result.add(nums[start] + "->" + nums[i]);
                }
                // Move start to the next element
                start = i + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SummaryRanges solution = new SummaryRanges();

        // Test cases
        int[] nums1 = { 0, 1, 2, 4, 5, 7 };
        System.out.println(solution.summaryRanges(nums1)); // Output: ["0->2", "4->5", "7"]

        int[] nums2 = { 0, 2, 3, 4, 6, 8, 9 };
        System.out.println(solution.summaryRanges(nums2)); // Output: ["0", "2->4", "6", "8->9"]

    }
