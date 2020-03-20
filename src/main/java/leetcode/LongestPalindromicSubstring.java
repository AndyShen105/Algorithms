package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-11-6.
 */
public class LongestPalindromicSubstring {

    private static final Logger log = LogManager.getLogger(LongestPalindromicSubstring.class);


    private static String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        char[] ch = s.toCharArray();
        boolean[][] dp = new boolean[s.length()][s.length()];
        int maxLen = 1, start = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (i - j < 2) {
                    dp[j][i] = ch[i] == ch[j];
                } else {
                    dp[j][i] = dp[j + 1][i - 1] && (ch[i] == ch[j]);
                }
                if (dp[j][i] && (i - j + 1) > maxLen) {
                    maxLen = i - j + 1;
                    start = j;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        String s1 = "babad";
        log.info(longestPalindrome(s1));
    }
}

