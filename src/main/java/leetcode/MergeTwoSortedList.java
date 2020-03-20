package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-9-25.
 */
public class MergeTwoSortedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private static final Logger log = LogManager.getLogger(MergeTwoSortedList.class);

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 != null && l2 == null) return l1;
        if (l2 != null && l1 == null) return l2;
        ListNode head;
        if (l1.val < l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }
        ListNode current = head;
        while (l2 != null || l1 != null) {

            if (l1 == null || (l2 != null && l2.val < l1.val)) {
                current.next = l2;
                l2 = l2.next;
            } else if (l2 == null || (l1 != null && l1.val <= l2.val)) {
                current.next = l1;
                l1 = l1.next;
            }
            current = current.next;
        }
        return head;
    }

    public static ListNode create(int[] arr) {
        ListNode head = new ListNode(0), current = head;
        for (int i = 0; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            current.next = node;
            current = current.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2};
        ListNode list1 = create(arr1);
        ListNode list2 = create(arr2);
        ListNode head = mergeTwoLists(list1, list2);
        while (head != null) {
            log.info(head.val);
            head = head.next;
        }
    }
}

