package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/20.
 */
public class FlattenBinaryTreeToLinkedList {

    private static final Logger log = LogManager.getLogger(FlattenBinaryTreeToLinkedList.class);

    public static void flatten(TreeNode root) {
        helper(root);
    }

    public static TreeNode helper(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root;
        }
        TreeNode right = root.right, left = root.left;
        root.right = left;
        root.left = null;
        TreeNode temp = helper(right);
        if (temp != null)
            temp.right = right;
        return helper(right);
    }

}

