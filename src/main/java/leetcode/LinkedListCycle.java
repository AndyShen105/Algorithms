package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-12-2.
 */
public class LinkedListCycle {

    private static final Logger log = LogManager.getLogger(LinkedListCycle.class);

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head, fast = head.next.next;
        while (fast != null && fast.next != null) {
            if (slow.equals(fast)) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}

