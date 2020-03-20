package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-10-25.
 */
public class PathSum {

    private static final Logger log = LogManager.getLogger(PathSum.class);

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.val == sum && root.right == null && root.left == null) return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        int[] array = {4, 9, 0, 5, 1};
        TreeNode root = TreeNode.creatTree(array);
        log.info("");

    }
}

