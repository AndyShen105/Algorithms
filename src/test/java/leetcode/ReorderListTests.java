package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020-05-19.
 */
public class ReorderListTests {
    private static final Logger log = LogManager.getLogger(ReorderListTests.class);

    @Test
    public void test1() {
        int[] array = {1, 2, 3, 4};
        ListNode head = ListNode.createLinkedList(array);
        ReorderList reorderList = new ReorderList();
        reorderList.reorderList(head);
        ListNode.print(head);
    }
}
