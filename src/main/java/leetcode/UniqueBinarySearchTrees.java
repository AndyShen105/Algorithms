package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/7.
 */
public class UniqueBinarySearchTrees {
    /*
    *
    * Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?

    Example:

    Input: 3
    Output: 5
    Explanation:
    Given n = 3, there are a total of 5 unique BST's:

       1         3     3      2      1
        \       /     /      / \      \
         3     2     1      1   3      2
        /     /       \                 \
       2     1         2                 3
    * */
    private static final Logger log = LogManager.getLogger(UniqueBinarySearchTrees.class);

    public static int numTrees(int n) {
        // 有点类似与二分的感觉，1-n的点都可以作为根结点，当i作为根结点时候：则1-（ℹ-1）位于右节点，而（i+1）-n位于右子树。
        //dp[i]
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }

    public static int numTreesRe(int n) {
        if (n == 1 || n == 0) return 1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += numTrees(i) * numTrees(n - i - 1);
        }
        return result;
    }
}

