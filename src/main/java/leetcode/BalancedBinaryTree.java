package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-10-31.
 */
public class BalancedBinaryTree {

    private static final Logger log = LogManager.getLogger(BalancedBinaryTree.class);

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(getDepth(root.left) - getDepth(root.right)) > 1) return false;
        return isBalanced(root.right) && isBalanced(root.left);
    }

    private static int getDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }

    public static boolean isBalanced2(TreeNode root) {
        if (checkDepth(root) == -1) return false;
        else return true;
    }

    private static int checkDepth(TreeNode root) {
        if (root == null) return 0;
        int left = checkDepth(root.left);
        if (left == -1) return -1;
        int right = checkDepth(root.right);
        if (right == -1) return -1;

        int diff = Math.abs(left - right);
        if (diff > 1) return -1;
        else return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, -1, -1, 4, 4};
        TreeNode root = TreeNode.creatTree(array);
        log.info(isBalanced2(root));

    }
}

