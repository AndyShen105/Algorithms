package aimtooffer;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020-04-21.
 */
public class RebuilTree {
    private static final Logger log = LogManager.getLogger(RebuilTree.class);

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;
        TreeNode root = helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }

    public TreeNode helper(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd | inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(pre[preStart]);
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == pre[preStart]) {
                root.left = helper(pre, preStart + 1, preStart + i - inStart, in, inStart, i - 1);
                root.right = helper(pre, preStart + i - inStart + 1, preEnd, in, i + 1, inEnd);
            }
        }
        return root;
    }
}
