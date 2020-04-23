package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/22.
 */
public class RemoveNthNodeFromEndofListTests {

    private static final Logger log = LogManager.getLogger(RemoveNthNodeFromEndofListTests.class);

    @Test
    public void removeNthNodeFromEndofListTest1() {
        int[] array = {1, 2, 3, 4, 5};
        ListNode listNode = ListNode.createLinkedList(array);
        RemoveNthNodeFromEndofList.removeNthFromEnd(listNode, 2);
        ListNode.print(listNode);
    }

    @Test
    public void removeNthNodeFromEndofListTest2() {
        int[] array = {1, 2};
        ListNode listNode = ListNode.createLinkedList(array);

        ListNode.print(RemoveNthNodeFromEndofList.removeNthFromEnd(listNode, 2));
    }
}

