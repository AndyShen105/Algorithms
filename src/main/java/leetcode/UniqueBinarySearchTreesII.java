package leetcode;

import UtilFunc.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/4/9.
 */
public class UniqueBinarySearchTreesII {

    /*
    *Input: 3
    Output:
    [
    [1,null,3,2],
    [3,2,null,1],
    [3,1,null,null,2],
    [2,1,3],
    [1,null,2,null,3]
    ]
    Explanation:
    The above output corresponds to the 5 unique BST's shown below:

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
    *
    * */
// 有点类似与二分的感觉，1-n的点都可以作为根结点，当i作为根结点时候：则1-（ℹ-1）位于右节点，而（i+1）-n位于右子树。
    public static List<TreeNode> generateTrees(int n) {
        List<TreeNode>[] dp = new List[n + 1];
        dp[0] = new ArrayList<>();
        if (n == 0) return dp[0];
        dp[0].add(null);
        // dp数组表示以n个数组成的二叉查找树的所有情况
        for (int i = 1; i <= n; i++) {
            dp[i] = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                int left = j - 1, right = i - j;
                for (TreeNode leftTree : dp[left])
                    for (TreeNode rightTree : dp[right]) {
                        TreeNode root = new TreeNode(j);
                        root.left = clone(leftTree, 0);
                        // 因为是从左向右遍历，所以j为右子树顶点值，则右子树所有值加1，保持左子树保持不变。
                        root.right = clone(rightTree, j);
                        //表示以J为root的n个数的二叉查找树
                        dp[i].add(root);
                    }
            }
        }
        return dp[n];
    }

    private static TreeNode clone(TreeNode x, int offset) {
        if (x == null)
            return null;
        TreeNode result = new TreeNode(x.val + offset);
        result.left = clone(x.left, offset);
        result.right = clone(x.right, offset);
        return result;
    }

}

