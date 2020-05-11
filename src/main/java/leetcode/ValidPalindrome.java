package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/5/8.
 */
public class ValidPalindrome {

    private static final Logger log = LogManager.getLogger(ValidPalindrome.class);

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!isAlphanumeric(s.charAt(i))) {
                i++;
                continue;
            }
            if (!isAlphanumeric(s.charAt(j))) {
                j--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
                i++;
                j--;
                continue;
            }
            return false;
        }
        return true;
    }

    public boolean isAlphanumeric(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
            return true;
        }
        return false;
    }

}

