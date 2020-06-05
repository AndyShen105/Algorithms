package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/6/5.
 */
public class MergeTwoBinaryTreesTests {

    private static final Logger log = LogManager.getLogger(MergeTwoBinaryTreesTests.class);

    @Test
    public void test1() {
        int array1[] = {3, 4, 5, 1, 2};
        int array2[] = {4, 1, 2, 1};
        TreeNode t1 = TreeNode.creatTree(array1);
        TreeNode t2 = TreeNode.creatTree(array2);
        MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
        mergeTwoBinaryTrees.mergeTrees(t1, t2);
    }
}

