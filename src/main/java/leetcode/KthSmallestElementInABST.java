package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/4/27.
 */
public class KthSmallestElementInABST {

    private static final Logger log = LogManager.getLogger(KthSmallestElementInABST.class);
    private List<Integer> re = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return re.get(k - 1);
    }

    private void helper(TreeNode root, int k) {
        if (root.left != null) helper(root.left, k);
        re.add(root.val);
        if (re.size() == k) return;
        if (root.right != null) helper(root.right, k);

    }

}

