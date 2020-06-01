package leetcode;

import UtilFunc.ListNode;
import com.sun.org.apache.xpath.internal.axes.OneStepIterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/6/1.
 */
public class LinkedListCycle2Tests {

    private static final Logger log = LogManager.getLogger(LinkedListCycle2Tests.class);

    @Test
    public void test1() {
        int[] array = {3, 2, 0, -4};
        ListNode head = new ListNode(3), rear = head;
        for (int i = 1; i < 4; i++) {
            ListNode node = new ListNode(array[i]);
            rear.next = node;
            rear = rear.next;
        }
        rear.next = head.next;
        ListNode node = LinkedListCycle2.detectCycle(head);
    }
}

