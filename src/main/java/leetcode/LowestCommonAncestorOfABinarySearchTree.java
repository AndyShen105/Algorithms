package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/5/20.
 */
public class LowestCommonAncestorOfABinarySearchTree {

    private static final Logger log = LogManager.getLogger(LowestCommonAncestorOfABinarySearchTree.class);

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        for (; ; ) {
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else {
                return root;
            }
        }
    }

}

