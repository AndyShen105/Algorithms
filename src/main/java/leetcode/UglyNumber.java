package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/6/2.
 */
public class UglyNumber {

    private static final Logger log = LogManager.getLogger(UglyNumber.class);

    public boolean isUgly(int num) {
        if (num == 0) return false;
        if (num == 1) return true;
        if (num == 2 || num == 3 || num == 5) {
            return true;
        }
        if (num % 2 == 0 && isUgly(num / 2)) {
            return true;
        }
        if (num % 3 == 0 && isUgly(num / 3)) {
            return true;
        }
        if (num % 5 == 0 && isUgly(num / 5)) {
            return true;
        }
        return false;
    }
}

