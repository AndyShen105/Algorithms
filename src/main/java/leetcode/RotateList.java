package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/5/7.
 */
public class RotateList {

    private static final Logger log = LogManager.getLogger(RotateList.class);

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) return head;
        int count = 1;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        current.next = head;
        count = count - k % count;
        while (count > 0) {
            current = current.next;
            count--;
        }
        head = current.next;
        current.next = null;
        return head;
    }
}

