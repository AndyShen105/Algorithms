package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import static UtilFunc.TreeNode.creatTree;

/**
 * Created by hang.shen@transwarp.io on 2020/4/17.
 */
public class BinaryTreeZigzagLevelOrderTraversalTests {

    private static final Logger log = LogManager.getLogger(BinaryTreeZigzagLevelOrderTraversalTests.class);

    @Test
    public void BinaryTreeZigzagLevelOrderTraversalTest1() {
        int[] array = {3, 9, 20, -1, -1, 15, 7};
        TreeNode root = creatTree(array);
        BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);
        log.info("");
    }
}

