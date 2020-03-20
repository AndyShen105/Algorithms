package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-11-11.
 */
public class LongestCommonPrefix {

    private static final Logger log = LogManager.getLogger(LongestCommonPrefix.class);

    private static String compare(String s1, String s2) {

        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i);
            }
        }
        return s1.length() > s2.length() ? s2 : s1;
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = compare(prefix, strs[i]);
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"dog", "racecar", "car"};
        log.info(longestCommonPrefix(strs));
    }
}

