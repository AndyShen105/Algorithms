package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/7.
 */
public class RotateListTests {

    private static final Logger log = LogManager.getLogger(RotateListTests.class);

    @Test
    public void test1() {
        int[] array = {1, 2, 3, 4, 5};
        ListNode head = ListNode.createLinkedList(array);
        RotateList rotateList = new RotateList();
        rotateList.rotateRight(head, 2);
    }
}

