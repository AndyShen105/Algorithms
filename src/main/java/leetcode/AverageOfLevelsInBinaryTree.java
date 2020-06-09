package leetcode;

import UtilFunc.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/6/9.
 */
public class AverageOfLevelsInBinaryTree {


    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count, d;
        while (queue.size() != 0) {
            double val = 0.0;
            count = queue.size();
            d = count;
            while (count > 0) {
                TreeNode temp = queue.removeFirst();
                val += temp.val;
                if (temp.right != null) queue.add(temp.right);
                if (temp.left != null) queue.add(temp.left);
                count--;
            }
            result.add(val / d);
        }
        return result;
    }


}

