package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.Math.log10;

/**
 * Created by hang.shen@transwarp.io on 2020/5/15.
 */
public class PowerofThree {

    private static final Logger log = LogManager.getLogger(PowerofThree.class);

    public boolean isPowerOfThree(int n) {
        return (n > 0 && 1162261467 % n == 0);
    }

    public boolean isPowerOfThree2(int n) {
        double res;
        res = log10(n) / log10(3);
        if (res - (int) res == 0)
            return true;
        else
            return false;
    }
}

