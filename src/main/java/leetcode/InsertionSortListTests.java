package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/26.
 */
public class InsertionSortListTests {

    private static final Logger log = LogManager.getLogger(InsertionSortListTests.class);

    @Test
    public void test1() {
        int[] array = {4, 2, 3, 6, 1};
        ListNode listNode = ListNode.createLinkedList(array);
        ListNode.print(InsertionSortList.insertionSortList(listNode));
    }

    @Test
    public void test2() {
        int[] array = {12, 1, 2, 3, 6, 5, 4};
        ListNode listNode = ListNode.createLinkedList(array);
        ListNode.print(InsertionSortList.insertionSortList(listNode));
    }
}

