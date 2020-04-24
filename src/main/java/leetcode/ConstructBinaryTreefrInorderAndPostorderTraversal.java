package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/23.
 */
public class ConstructBinaryTreefrInorderAndPostorderTraversal {

    private static final Logger log = LogManager.getLogger(ConstructBinaryTreefrInorderAndPostorderTraversal.class);

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null)
            return null;
        return helper(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    public static TreeNode helper(int[] inorder, int[] postorder, int iStart, int iend, int pStart, int pend) {
        if (iStart > iend || pStart > pend)
            return null;
        //后续遍历序列的最后一个为根
        TreeNode root = new TreeNode(postorder[pend]);
        if (pStart == pend)
            return root;
        int mid = iStart;
        while (mid <= iend && inorder[mid] != root.val)
            mid++;
        int leftCount = mid - iStart;
        root.left = helper(inorder, postorder, iStart, mid - 1, pStart, pStart + leftCount - 1);
        root.right = helper(inorder, postorder, mid + 1, iend, pStart + leftCount, pend - 1);
        return root;
    }

}




