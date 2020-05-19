package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Deque;

/**
 * Created by hang.shen@transwarp.io on 2020-05-19.
 */
public class ReorderList {
    private static final Logger log = LogManager.getLogger(ReorderList.class);

    public void reorderList(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current);
            current = current.next;
        }
        int start = 0, end = list.size() - 1;
        current = new ListNode();
        while (start <= end) {
            current.next = list.get(start);
            current = current.next;
            if (start == end) break;
            current.next = list.get(end);
            current = current.next;
            start++;
            end--;
        }
        current.next = null;
    }
}
