package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by hang.shen@transwarp.io on 19-10-23.
 */
public class BinaryTreeLevelOrderTraversalII {

    private static final Logger log = LogManager.getLogger(BinaryTreeLevelOrderTraversalII.class);

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();

        levelRecursion(root, result, 0);
        return result;
    }

    private void levelRecursion(TreeNode node, LinkedList<List<Integer>> result, int level) {
        if (node == null) {
            return;
        }
        if (result.size() < level + 1) {// 说明还需要添加一行
            result.addFirst(new ArrayList<Integer>());
        }
        result.get(result.size() - 1 - level).add(node.val);

        levelRecursion(node.left, result, level + 1);
        levelRecursion(node.right, result, level + 1);
    }

    public List<List<Integer>> levelOrderBottom2(TreeNode root) {

        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
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
            result.add(temp);
        }
        return result;
    }
}

