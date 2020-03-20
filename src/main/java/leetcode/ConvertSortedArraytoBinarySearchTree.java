package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-11-19.
 */
public class ConvertSortedArraytoBinarySearchTree {

    private static final Logger log = LogManager.getLogger(ConvertSortedArraytoBinarySearchTree.class);

    private static TreeNode helper(int[] nums, int start, int end) {
        if (end - start < 1) return null;
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, start, mid);
        node.right = helper(nums, mid + 1, end);
        return node;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return helper(nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int[] array = {-10, -3, 0, 5, 9};
        TreeNode node = sortedArrayToBST(array);
        log.info(5 / 2);
    }
}

