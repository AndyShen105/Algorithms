package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Stack;

/**
 * Created by hang.shen@transwarp.io on 2020-04-29.
 */
public class ValidateBinarySearchTree {
    private static final Logger log = LogManager.getLogger(ValidateBinarySearchTree.class);

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        long min = Long.MIN_VALUE;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                if(root.val <= min){
                    return false;
                }else {
                    min = root.val;
                }
                root = root.right;
            }
        }
        return true;
    }

}
