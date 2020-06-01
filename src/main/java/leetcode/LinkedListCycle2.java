package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Created by hang.shen@transwarp.io on 19-12-3.
 * Problem
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed)
 * in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 * Note: Do not modify the linked list.
 */
public class LinkedListCycle2 {

    private static final Logger log = LogManager.getLogger(LinkedListCycle2.class);

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)) {
                ListNode start = head;
                while (!start.equals(slow)) {
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }

        }
        return null;
    }

}

