package aimtooffer;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Stack;

/**
 * Created by hang.shen@transwarp.io on 2020-04-21.
 */
public class ReversePrint {
    private static final Logger log = LogManager.getLogger(ReversePrint.class);

    public int[] reversePrint(ListNode head) {
        Stack<Integer> temp = new Stack<>();
        while (head != null) {
            temp.push(head.val);
            head = head.next;
        }
        int[] array = new int[temp.size()];
        if (temp.size() == 0) return array;
        int i = 0;
        while (!temp.empty()) {
            array[i] = temp.pop();
            i++;
        }
        return array;

    }
}
