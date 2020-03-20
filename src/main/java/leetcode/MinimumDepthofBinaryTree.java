package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-10-28.
 */
public class MinimumDepthofBinaryTree {

    private static final Logger log = LogManager.getLogger(MinimumDepthofBinaryTree.class);

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return getDepth(root);
    }

    private int getDepth(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        if (root.right == null && root.left == null) return 1;
        return 1 + Math.min(getDepth(root.right), getDepth(root.left));
    }
}

