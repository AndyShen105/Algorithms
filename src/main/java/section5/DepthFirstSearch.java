package section5;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-11-18.
 */
public class DepthFirstSearch {

    private static final Logger log = LogManager.getLogger(DepthFirstSearch.class);

    public DepthFirstSearch() {
    }

    public static void dfsWithRecursion(TreeNode root) {
        if (root == null) {
            System.out.print("\n");
            return;
        }
        System.out.print(root.val);
        dfsWithRecursion(root.left);
        dfsWithRecursion(root.right);
    }

    public static void main(String[] args) {
        int[] array = {4, 9, 0, 5, 1};
        TreeNode root = TreeNode.creatTree(array);
        dfsWithRecursion(root);
    }
}

