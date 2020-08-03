package leetcode;

import UtilFunc.ListNode;
import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/8/3.
 */
public class ListofDepthLCCI {

    private static final Logger log = LogManager.getLogger(ListofDepthLCCI.class);


    public ListNode[] listOfDepth(TreeNode tree) {

        if (tree == null) return new ListNode[0];
        List<ListNode> list = new ArrayList<>();
        List<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        ListNode temp = new ListNode();
        while (!queue.isEmpty()) {
            int size = queue.size();
            ListNode curr = temp;
            while (size > 0) {
                TreeNode currentNode = queue.remove(0);
                curr.next = new ListNode(currentNode.val);
                curr = curr.next;
                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);
                size--;
            }
            list.add(temp.next);
        }
        ListNode[] result = new ListNode[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }


}

