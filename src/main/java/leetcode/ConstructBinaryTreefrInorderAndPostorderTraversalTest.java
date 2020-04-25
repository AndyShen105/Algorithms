package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/23.
 */
public class ConstructBinaryTreefrInorderAndPostorderTraversalTest {

    private static final Logger log = LogManager.getLogger(ConstructBinaryTreefrInorderAndPostorderTraversalTest.class);

    @Test
    public void test1() {
        int[] in = {9, 3, 15, 20, 7};
        int[] post = {9, 15, 7, 20, 3};
        TreeNode node = ConstructBinaryTreefrInorderAndPostorderTraversal.buildTree(in, post);
        log.info("");
    }
}

