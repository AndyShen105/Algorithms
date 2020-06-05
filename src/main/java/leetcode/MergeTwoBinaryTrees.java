package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/6/5.
 */
public class MergeTwoBinaryTrees {

    private static final Logger log = LogManager.getLogger(MergeTwoBinaryTrees.class);

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 != null) return t2;
        if (t1 != null && t2 == null) return t1;
        if (t1 == null && t2 == null) return t1;
        helper(t1, t2);
        return t1;
    }

    private void helper(TreeNode t1, TreeNode t2) {
        t1.val += t2.val;
        if (t1.right != null && t2.right != null) {
            helper(t1.right, t2.right);
        } else if (t1.right == null && t2.right != null) {
            t1.right = t2.right;
        }

        if (t1.left != null && t2.left != null) {
            helper(t1.left, t2.left);
        } else if (t1.left == null && t2.left != null) {
            t1.left = t2.left;
        }
    }
}

