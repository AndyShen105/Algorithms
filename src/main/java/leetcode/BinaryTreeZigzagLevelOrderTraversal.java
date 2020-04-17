package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/4/17.
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    private static final Logger log = LogManager.getLogger(BinaryTreeZigzagLevelOrderTraversal.class);

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> array = new ArrayList<>();
        if (root == null) return null;
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int size = 1;
        boolean flag = true;
        while (!q.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node;
                if (flag) {
                    node = q.removeFirst();
                    if (node.left != null) q.addLast(node.left);
                    if (node.right != null) q.addLast(node.right);
                } else {
                    node = q.removeLast();
                    if (node.right != null) q.addFirst(node.right);
                    if (node.left != null) q.addFirst(node.left);
                }
                temp.add(node.val);

            }
            flag = !flag;
            size = q.size();
            array.add(temp);
        }
        return array;
    }

}

