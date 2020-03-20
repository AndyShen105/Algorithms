package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-9-20.
 */

public class addTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private static final Logger log = LogManager.getLogger(addTwoNumbers.class);

    public addTwoNumbers() {
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int size1 = 0, size2 = 0;
        ListNode node1 = l1, node2 = l2;
        while (node1 != null) {
            size1++;
            node1 = node1.next;
        }
        while (node2 != null) {
            size2++;
            node2 = node2.next;
        }
        ListNode max, min;
        if (size1 >= size2) {
            max = l1;
            min = l2;
        } else {
            min = l1;
            max = l2;
        }
        int[] ex = new int[Math.max(size1, size2) + 1];
        ListNode head = new ListNode(0), currentNode = head;
        for (int i = 0; i < Math.max(size1, size2); i++) {
            int temp = 0;
            if (i < Math.min(size1, size2)) {
                temp = min.val;
                min = min.next;
            }

            int sum = max.val + ex[i] + temp;
            ex[i + 1] = sum / 10;
            ListNode node = new ListNode(sum % 10);
            currentNode.next = node;
            currentNode = currentNode.next;

            max = max.next;
        }
        if (ex[ex.length - 1] != 0) {
            ListNode node = new ListNode(1);
            currentNode.next = node;
        }
        return head.next;
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
        int[] arr1 = {1, 8};
        int[] arr2 = {0};
        ListNode l1 = create(arr1);
        ListNode l2 = create(arr2);
        ListNode re = addTwoNumbers(l1, l2);
        while (re != null) {
            log.info(re.val);
            re = re.next;
        }
    }
}

