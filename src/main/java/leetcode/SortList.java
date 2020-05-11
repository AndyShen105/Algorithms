package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020-05-08.
 */
public class SortList {
    private static final Logger log = LogManager.getLogger(SortList.class);

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode current, result = new ListNode(Integer.MAX_VALUE), root = new ListNode();
        root.next = head;
        current = result;
        while (root.next != null) {
            ListNode temp = root;
            int currentMax = Integer.MAX_VALUE;
            while (temp.next != null) {
                if (temp.next.val < currentMax) {
                    current.next = temp;
                    currentMax = temp.next.val;
                }
                temp = temp.next;
            }
            temp = current.next;
            current.next = temp.next;
            temp.next = temp.next.next;
            current = current.next;
            current.next = null;
        }
        return result.next;
    }

}
