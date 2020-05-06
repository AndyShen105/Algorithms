package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/6.
 */
public class BinaryTreeMaximumPathSumTest1 {

    private static final Logger log = LogManager.getLogger(BinaryTreeMaximumPathSumTest1.class);

    @Test
    public void test1() {
        int[] array = {1, 2, 3};
        TreeNode root = TreeNode.creatTree(array);
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        binaryTreeMaximumPathSum.maxPathSum(root);
    }

    @Test
    public void test2() {
        int[] array = {-10, 9, 20, -1, -1, 15, 7};
        TreeNode root = TreeNode.creatTree(array);
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        binaryTreeMaximumPathSum.maxPathSum(root);
    }

    @Test
    public void test3() {
        int[] array = {1, -2, 3};
        TreeNode root = TreeNode.creatTree(array);
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        binaryTreeMaximumPathSum.maxPathSum(root);
    }
}

