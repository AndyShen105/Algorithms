package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-12-17.
 */
public class ReverseLinkedListII {

    private static final Logger log = LogManager.getLogger(ReverseLinkedListII.class);

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) return head;
        int index = 1;
        ListNode curr, after, temp, pre = new ListNode();
        pre.next = head;
        temp = pre;
        while (index < m) {
            pre = pre.next;
            index++;
        }
        curr = pre.next;
        after = curr.next;

        while (index < n) {
            curr.next = after.next;
            after.next = pre.next;
            pre.next = after;
            after = curr.next;
            index++;
        }
        return temp.next;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        ListNode head = reverseBetween(ListNode.createLinkedList(array), 2, 3);
        log.info("");
    }
}

