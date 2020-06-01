package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/5/29.
 */
public class BinaryTreePaths {

    private static final Logger log = LogManager.getLogger(BinaryTreePaths.class);

    public List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        result.clear();
        if (root == null) return result;
        StringBuilder str = new StringBuilder();
        helper(str, root);
        return result;
    }

    public void helper(StringBuilder str, TreeNode root) {
        if (root.left == null && root.right == null) {
            str.append(root.val);
            result.add(str.toString());
            return;
        }
        str.append(root.val);
        str.append("->");
        StringBuilder sb = new StringBuilder(str);
        if (root.right != null) {
            helper(str, root.right);
        }
        if (root.left != null) {
            helper(sb, root.left);
        }
    }
}

