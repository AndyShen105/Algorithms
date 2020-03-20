package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-12-12.
 */
public class ReverseLinkedList {

    private static final Logger log = LogManager.getLogger(ReverseLinkedList.class);

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode last = null, temp;
        while (true) {
            temp = head.next;
            head.next = last;
            last = head;
            if (temp == null) break;
            head = temp;
            ;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ListNode node = ListNode.createLinkedList(array);
        reverseList(node);
    }
}

