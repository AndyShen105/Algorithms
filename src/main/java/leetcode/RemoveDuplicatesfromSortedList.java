package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-10-10.
 */
public class RemoveDuplicatesfromSortedList {

    private static final Logger log = LogManager.getLogger(RemoveDuplicatesfromSortedList.class);

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head.next, pre = head;
        while (curr != null) {
            if (curr.val == pre.val) {
                curr = curr.next;
                pre.next = curr;
            } else {
                pre = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 3};

        ListNode list1 = ListNode.createLinkedList(arr1);
        deleteDuplicates(list1);
        ListNode.print(list1);
    }
}

