package aimtooffer;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/8/4.
 */
public class PrintBTWithZhi {

    private static final Logger log = LogManager.getLogger(PrintBTWithZhi.class);

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        List<TreeNode> deQueue = new LinkedList<>();
        deQueue.add(root);
        boolean flag = true;

        while (!deQueue.isEmpty()) {
            int size = deQueue.size();
            List<Integer> list = new ArrayList<>();
            while (size > 0) {
                TreeNode node;
                if (flag) {
                    node = deQueue.remove(0);
                    if (node.left != null) deQueue.add(node.left);
                    if (node.right != null) deQueue.add(node.right);
                } else {
                    node = deQueue.remove(deQueue.size() - 1);

                    if (node.right != null) deQueue.add(0, node.right);
                    if (node.left != null) deQueue.add(0, node.left);
                }

                list.add(node.val);
                size--;
            }
            result.add(list);
            flag = !flag;
        }
        return result;
    }

    public static void main(String[] args) {
        int array[] = {3, 9, 20, -1, -1, 15, 7};
        TreeNode root = TreeNode.creatTree(array);
        List<List<Integer>> result = levelOrder(root);
        log.info("");
    }
}

