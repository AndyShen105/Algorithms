package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/22.
 */
public class RemoveNthNodeFromEndofList {

    private static final Logger log = LogManager.getLogger(RemoveNthNodeFromEndofList.class);

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode pre, current, node = new ListNode();
        node.next = head;
        current = node;
        pre = current;

        int count = 0;
        while (current.next != null) {
            if (count >= n) {
                pre = pre.next;
            }
            count++;
            current = current.next;
        }

        pre.next = pre.next.next;
        return node.next;
    }
}

