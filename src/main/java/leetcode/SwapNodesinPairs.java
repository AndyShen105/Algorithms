package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static UtilFunc.ListNode.print;

/**
 * Created by hang.shen@transwarp.io on 19-10-12.
 */
public class SwapNodesinPairs {

    private static final Logger log = LogManager.getLogger(SwapNodesinPairs.class);

    private static void reserveList() {
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;
        ListNode newHead = head.next, currNode = head, temp;

        int state = 0;

        while (currNode.next != null) {
            temp = currNode.next;
            if (state == 0) {
                currNode.next = temp.next;
                temp.next = currNode;
                state = 1;
            } else {
                if (currNode.next.next != null) {
                    currNode.next = temp.next;
                }
                currNode = temp;

                state = 0;
            }
        }
        return newHead;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        ListNode list = ListNode.createLinkedList(array);
        print(swapPairs(list));
    }
}

