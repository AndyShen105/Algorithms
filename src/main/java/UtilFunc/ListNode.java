package UtilFunc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import section1.LinkedList;

/**
 * Created by hang.shen@transwarp.io on 19-9-25.
 */
public class ListNode {

    private static final Logger log = LogManager.getLogger(ListNode.class);

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public static ListNode createLinkedList(int[] arrays) {
        ListNode head = new ListNode(0), current = head;
        for (int i = 0; i < arrays.length; i++) {
            ListNode node = new ListNode(arrays[i]);
            current.next = node;
            current = current.next;
        }
        return head.next;
    }

    public static void print(ListNode head) {
        ListNode temp = head;
        String info = "";
        while (temp != null) {
            info += String.valueOf(temp.val) + " ";
            temp = temp.next;
        }
        log.info(info);
    }
}

