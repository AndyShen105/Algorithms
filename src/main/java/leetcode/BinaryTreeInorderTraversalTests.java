package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020-04-27.
 */
public class BinaryTreeInorderTraversalTests {
    private static final Logger log = LogManager.getLogger(BinaryTreeInorderTraversalTests.class);

    @Test
    public void test1() {
        int[] array = {3, 9, 20, -1, -1, 15, 7};
        TreeNode root = TreeNode.creatTree(array);
        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        log.info(binaryTreeInorderTraversal.inorderTraversal(root));
    }
}
