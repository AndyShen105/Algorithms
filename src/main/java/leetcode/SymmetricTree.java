package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by hang.shen@transwarp.io on 19-10-24.
 */
public class SymmetricTree {

    private static final Logger log = LogManager.getLogger(SymmetricTree.class);

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
        ConcurrentLinkedQueue<TreeNode> queue = new ConcurrentLinkedQueue<>();
        TreeNode current;
        queue.add(root);
        int length;
        while (!queue.isEmpty()) {
            length = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                current = queue.poll();
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
                temp.add(current.val);
            }
            int start = 0, end = temp.size() - 1;
            while (start < end) {
                if (temp.get(start) != temp.get(end)) return false;
                start++;
                end--;
            }
        }
        return true;

    }

    public boolean isSymmetricRecursive(TreeNode root) {
        if (root == null) return true;
        return recursiveCom(root.left, root.right);

    }

    boolean recursiveCom(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        return (root1.val == root2.val) && recursiveCom(root1.left, root2.right) && recursiveCom(root1.right, root2.left);

    }

}

