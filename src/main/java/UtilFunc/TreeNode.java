package UtilFunc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by hang.shen@transwarp.io on 19-10-17.
 */

public class TreeNode {

    private static final Logger log = LogManager.getLogger(TreeNode.class);

    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode next;

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode creatTree(int[] array) {
        if (array.length == 0) return null;
        TreeNode head = new TreeNode(array[0]);
        ConcurrentLinkedDeque<TreeNode> queue = new ConcurrentLinkedDeque<>();
        queue.add(head);
        TreeNode current;
        int i = 1;
        while (!queue.isEmpty()) {
            current = queue.pop();
            if (current.val == -1) {
                queue.pop();
                continue;
            }
            if (i < array.length) {
                TreeNode left = new TreeNode(array[i]);
                if (array[i] != -1) current.left = left;
                queue.add(left);
                i++;
            }

            if (i < array.length) {
                TreeNode right = new TreeNode(array[i]);
                if (array[i] != -1) current.right = right;
                queue.add(right);
                i++;
            }
        }
        return head;
    }

    public static void bfsPrint(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val);
        if (root.left != null) bfsPrint(root.left);
        if (root.right != null) bfsPrint(root.right);
    }

    public static void main(String[] args) {
        int[] array = {3, 9, 20, -1, -1, 15, 7};
        TreeNode root = creatTree(array);
        bfsPrint(root);
        log.info("");
    }
}