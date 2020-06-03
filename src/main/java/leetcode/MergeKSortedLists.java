package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/6/3.
 */
public class MergeKSortedLists {

    private static final Logger log = LogManager.getLogger(MergeKSortedLists.class);

    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length, count, max, index = 0;
        if (len == 0) return null;
        ListNode current, root = new ListNode(Integer.MAX_VALUE);
        current = root;
        for (; ; ) {
            count = 0;
            max = Integer.MAX_VALUE;
            for (int i = 0; i < len; i++) {
                if (lists[i] == null) {
                    count++;
                    continue;
                }
                if (lists[i].val < max) {
                    max = lists[i].val;
                    index = i;
                }
            }
            if (count >= len) break;
            current.next = lists[index];
            current = current.next;
            lists[index] = lists[index].next;
            current.next = null;
        }
        current.next = null;
        return root.next;
    }
}

