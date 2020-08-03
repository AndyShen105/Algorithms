package leetcode;

import UtilFunc.ListNode;
import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/8/3.
 */
public class ListofDepthLCCITests {

    private static final Logger log = LogManager.getLogger(ListofDepthLCCITests.class);

    @Test
    public void test1() {
        int array[] = {1, 2, 3, 4, 5, -1, 7, 8};
        TreeNode root = TreeNode.creatTree(array);
        ListofDepthLCCI listofDepthLCCI = new ListofDepthLCCI();
        ListNode[] result = listofDepthLCCI.listOfDepth(root);
        log.info(result);

    }
}

