package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/26.
 */
public class InsertionSortList {

    private static final Logger log = LogManager.getLogger(InsertionSortList.class);

    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode current, prepre, pre, root = new ListNode(Integer.MIN_VALUE);
        current = head.next;
        root.next = head;
        pre = head;
        prepre = root;
        while (current != null) {
            boolean flag = false;
            while (prepre.next != current) {
                if (current.val < prepre.next.val) {
                    pre.next = current.next;
                    current.next = prepre.next;
                    prepre.next = current;
                    current = pre.next;
                    flag = true;
                    break;
                } else {
                    prepre = prepre.next;
                }
            }
            if (!flag) {
                current = current.next;
                pre = pre.next;
            }
            prepre = root;
        }
        return root.next;
    }
}

