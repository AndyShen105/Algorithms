package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/20.
 */
public class FlattenBinaryTreeToLinkedListTests {

    private static final Logger log = LogManager.getLogger(FlattenBinaryTreeToLinkedListTests.class);

    @Test
    public void FlattenBinaryTreeToLinkedListTest1() {
        int[] array = {1, 2, 5, 3, 4, -1, 6};
        TreeNode root = TreeNode.creatTree(array);
        FlattenBinaryTreeToLinkedList.flatten(root);
        log.info("");
    }
}

