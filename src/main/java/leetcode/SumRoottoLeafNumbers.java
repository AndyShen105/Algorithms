package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-10-28.
 */
public class SumRoottoLeafNumbers {

    private static final Logger log = LogManager.getLogger(SumRoottoLeafNumbers.class);

    public static int sumNumbers(TreeNode root) {
        return sumNumbersDFS(root, 0);
    }

    private static int sumNumbersDFS(TreeNode root, int sum) {
        if (root == null) return 0;
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) return sum;
        return sumNumbersDFS(root.left, sum) + sumNumbersDFS(root.right, sum);
    }

    public static void main(String[] args) {
        int[] array = {4, 9, 0, 5, 1};
        TreeNode root = TreeNode.creatTree(array);
        log.info(sumNumbers(root));

    }
}

