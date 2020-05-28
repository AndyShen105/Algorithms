package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/5/28.
 */
public class PartitionList {

    private static final Logger log = LogManager.getLogger(PartitionList.class);

    public ListNode partition(ListNode head, int x) {
        if (head == null) return head;
        ListNode root = new ListNode(), target = new ListNode(), pre, after;
        pre = root;
        pre.next = head;

        pre = root;
        after = target;
        while (head != null) {
            if (head.val < x) {
                pre.next = head;
                pre = pre.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        pre.next = target.next;
        return root.next;
    }
}

