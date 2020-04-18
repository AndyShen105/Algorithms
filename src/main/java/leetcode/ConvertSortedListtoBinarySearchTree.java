package leetcode;

import UtilFunc.ListNode;
import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/4/17.
 */
public class ConvertSortedListtoBinarySearchTree {

    private static final Logger log = LogManager.getLogger(ConvertSortedListtoBinarySearchTree.class);

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        ListNode temp = head;
        List<Integer> array = new ArrayList<>();
        while (temp != null) {
            array.add(temp.val);
            temp = temp.next;
        }
        int len = array.size();
        return helper(0, len, array);
    }

    private TreeNode helper(int start, int end, List<Integer> list) {
        if (start >= end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = helper(start, mid, list);
        node.right = helper(mid + 1, end, list);
        return node;
    }
}

