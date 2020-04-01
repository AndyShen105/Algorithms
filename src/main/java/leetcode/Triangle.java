package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/3/27.
 */
public class Triangle {

    private static final Logger log = LogManager.getLogger(Triangle.class);

    /*
    *Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

    For example, given the following triangle

    [
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
    ]
    The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

    Note:

    Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
    *
    * */

    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.isEmpty()) return 0;
        int level = triangle.size(), size = triangle.get(level - 1).size();
        List<Integer> bt = triangle.get(level - 1);
        int[] dp = new int[bt.size()];
        for (int i = 0; i < size; i++) {
            dp[i] = bt.get(i);
        }

        for (int i = size - 2; i >= 0; i--) {
            List<Integer> temp = triangle.get(i);
            for (int j = 0; j < temp.size(); j++) {
                dp[j] = temp.get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }
        return dp[0];
    }
}

