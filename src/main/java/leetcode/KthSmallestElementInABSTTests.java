package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/27.
 */
public class KthSmallestElementInABSTTests {

    private static final Logger log = LogManager.getLogger(KthSmallestElementInABSTTests.class);

    @Test
    public void test1() {
        int[] array = {5, 3, 6, 2, 4, -1, -1, 1};
        TreeNode root = TreeNode.creatTree(array);
        KthSmallestElementInABST kthSmallestElementInABST = new KthSmallestElementInABST();
        log.info(kthSmallestElementInABST.kthSmallest(root, 3));

    }
}

