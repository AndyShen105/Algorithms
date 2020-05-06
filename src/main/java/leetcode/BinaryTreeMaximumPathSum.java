package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/5/6.
 */
public class BinaryTreeMaximumPathSum {
    /*Given a non-empty binary tree, find the maximum path sum.

            For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

            Example 1:

    Input: [1,2,3]

            1
            / \
            2   3

    Output: 6
    Example 2:

    Input: [-10,9,20,null,null,15,7]

               -10
               / \
              9  20
                /  \
               15   7

    Output: 42*/

    private static final Logger log = LogManager.getLogger(BinaryTreeMaximumPathSum.class);
    public static int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root.left == null && root.right == null) return root.val;
        result = Integer.MIN_VALUE;
        helper(root);
        return result;
    }

    private int helper(TreeNode root) {
        int left = root.left == null ? 0 : helper(root.left);
        int right = root.right == null ? 0 : helper(root.right);

        result = Math.max(result, Math.max(root.val, (left < 0 ? 0 : left) + (right < 0 ? 0 : right) + root.val));
        return Math.max(root.val, root.val + Math.max(left, right));
    }
}

