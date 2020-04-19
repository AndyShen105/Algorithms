package leetcode;

public class KthLargestElementInAnArray {
    public static int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        if (len == 1) return nums[0];
        for (int i = 0; i < len; i++) {
            int temp = 0, max = Integer.MIN_VALUE, val;
            for (int j = i; j < len; j++) {
                if (nums[j] > max) {
                    temp = j;
                    max = nums[j];
                }
            }
            val = nums[temp];
            nums[temp] = nums[i];
            nums[i] = val;
            if (i == k - 1) {
                return nums[i];
            }

        }
        return 0;
    }
}
