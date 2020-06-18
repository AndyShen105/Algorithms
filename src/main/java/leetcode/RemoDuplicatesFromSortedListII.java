package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/6/18.
 */
public class RemoDuplicatesFromSortedListII {

    private static final Logger log = LogManager.getLogger(RemoDuplicatesFromSortedListII.class);

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head.next;
        int count = 0;
        while (curr != null && curr.val == head.val) {
            curr = curr.next;
            count++;
        }
        if (count > 0) {
            return deleteDuplicates(curr);
        } else {
            head.next = deleteDuplicates(curr);

            return head;
        }
    }

}

