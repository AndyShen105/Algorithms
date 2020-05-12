package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020-05-08.
 */
public class SortListTests {
    private static final Logger log = LogManager.getLogger(SortListTests.class);
    @Test
    public void test1() {
        int[] array = {4,2,1,3};
        ListNode head = ListNode.createLinkedList(array);
        SortList sortList = new SortList();
        ListNode re = sortList.sortList(head);
        ListNode.print(re);
    }
}
