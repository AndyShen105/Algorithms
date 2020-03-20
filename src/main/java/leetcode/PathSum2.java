package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 19-11-8.
 */
public class PathSum2 {

    private static final Logger log = LogManager.getLogger(PathSum2.class);

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> re = new LinkedList<>();
        List<Integer> item = new LinkedList<>();
        helper(root, sum, item, re);
        return re;
    }

    private static void helper(TreeNode node, int sum, List<Integer> item, List<List<Integer>> re) {
        if (node == null) return;
        item.add(node.val);

        if (sum == node.val && node.right == null && node.left == null) {
            re.add(new LinkedList<>(item));
        }
        helper(node.left, sum - node.val, item, re);
        helper(node.right, sum - node.val, item, re);
        item.remove(item.size() - 1);
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 8, 11, -1, 13, 4, 7, 2, -1, -1, 5, 1};
        TreeNode root = TreeNode.creatTree(array);
        List<List<Integer>> re = pathSum(root, 22);
        log.info("  ");
    }
}

