package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/3/26.
 */
public class DecodeWays {
    /*A message containing letters from A-Z is being encoded to numbers using the following mapping:

    'A' -> 1
    'B' -> 2
    ...
    'Z' -> 26
    Given a non-empty string containing only digits, determine the total number of ways to decode it.

    Example 1:

    Input: "12"
    Output: 2
    Explanation: It could be decoded as "AB" (1 2) or "L" (12).
    Example 2:

    Input: "226"
    Output: 3
    Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
    *
    * */

    private static final Logger log = LogManager.getLogger(DecodeWays.class);
    private static final int MAX = 26;

    public static int numDecodings(String s) {
        int len = s.length();
        int[] vals = new int[len];
        int pre = 0, pos = 0, m = 1;
        for (int i = 0; i < len; i++) {
            int temp = s.charAt(i) - '0';
            if (temp == 0) {
                temp = pre * 10 + temp;
                if (temp == 0 || temp > 26)
                    return 0;
                else
                    vals[pos - 1] = temp;
            } else {
                vals[pos] = temp;
                pos++;
            }
            pre = temp;

        }

        int[] dp = new int[pos];
        if (pos == 1) return 1;
        dp[0] = 1;
        m = vals[1] >= 10 ? 100 : 10;
        dp[1] = (vals[0] * m + vals[1]) > MAX ? 1 : 2;

        for (int i = 2; i < pos; i++) {
            m = vals[i] > 10 ? 100 : 10;
            dp[i] = ((vals[i - 1] * m + vals[i]) > 26 ? 0 : (dp[i - 2])) + dp[i - 1];
        }
        return dp[pos - 1];
    }
}

