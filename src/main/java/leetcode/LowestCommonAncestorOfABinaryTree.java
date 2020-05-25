package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/5/25.
 */
public class LowestCommonAncestorOfABinaryTree {

    private static final Logger log = LogManager.getLogger(LowestCommonAncestorOfABinaryTree.class);
    TreeNode result;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        result = null;
        helper(root, p, q);
        return result;
    }

    private int helper(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return 0;
        int sum, left, rigtht;
        left = helper(root.left, p, q);
        rigtht = helper(root.right, p, q);
        if (root.val == p.val || root.val == q.val) {
            sum = left + rigtht + 1;
        } else {
            sum = left + rigtht;
        }
        if (sum == 2) {
            result = root;
            sum += 1;
        }
        return sum;
    }
}

