package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-10-11.
 */
public class ImplementstrStr {

    private static final Logger log = LogManager.getLogger(ImplementstrStr.class);

    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if (len == 0) return 0;
        if (len > haystack.length()) return -1;
        for (int i = 0; i < haystack.length() - len; i++) {

        }
        return 0;
    }
}

