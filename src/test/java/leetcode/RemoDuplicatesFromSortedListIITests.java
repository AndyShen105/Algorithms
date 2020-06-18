package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/6/18.
 */
public class RemoDuplicatesFromSortedListIITests {

    private static final Logger log = LogManager.getLogger(RemoDuplicatesFromSortedListIITests.class);

    @Test
    public void test1() {
        int[] array = {1, 2, 2, 2, 3, 4, 5};
        ListNode head = ListNode.createLinkedList(array);
        RemoDuplicatesFromSortedListII remoDuplicatesFromSortedListII = new RemoDuplicatesFromSortedListII();
        remoDuplicatesFromSortedListII.deleteDuplicates(head);
    }

    @Test
    public void test2() {
        int[] array = {1, 1};
        ListNode head = ListNode.createLinkedList(array);
        RemoDuplicatesFromSortedListII remoDuplicatesFromSortedListII = new RemoDuplicatesFromSortedListII();
        remoDuplicatesFromSortedListII.deleteDuplicates(head);
    }
}

