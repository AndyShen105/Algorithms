package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/6/16.
 */
public class PopulatingNextRightPointersInEachNodeTests {

    private static final Logger log = LogManager.getLogger(PopulatingNextRightPointersInEachNodeTests.class);

    @Test
    public void test1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        TreeNode root = TreeNode.creatTree(array);
        PopulatingNextRightPointersInEachNode populatingNextRightPointersInEachNode
                = new PopulatingNextRightPointersInEachNode();
        TreeNode newRoot = populatingNextRightPointersInEachNode.connect(root);
    }
}

