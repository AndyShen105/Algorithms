package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by hang.shen@transwarp.io on 2020-04-27.
 */
public class BinaryTreeInorderTraversal {
    private static final Logger log = LogManager.getLogger(BinaryTreeInorderTraversal.class);

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode temp;
        int size = 0;
        while (!stack.empty()) {
            temp = stack.peek();

            while (temp.left != null && size < 0        ) {
                stack.push(temp.left);
                temp = temp.left;
                size++;
            }
            temp = stack.pop();
            size--;
            log.info(temp.val);
            result.add(temp.val);
            if (temp.right != null) {
                stack.push(temp.right);
            }
        }
        return result;
    }
}
