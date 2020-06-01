package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/5/29.
 */
public class BinaryTreePathsTests {

    private static final Logger log = LogManager.getLogger(BinaryTreePathsTests.class);

    @Test
    public void test1() {
        int[] array = {1, 2, 3, -1, 5};
        TreeNode root = TreeNode.creatTree(array);
        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        List<String> result = binaryTreePaths.binaryTreePaths(root);
        log.info("");
    }
}

