package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-12-23.
 */
public class SqrtX {

    private static final Logger log = LogManager.getLogger(SqrtX.class);

    public static int mySqrt(int x) {
        if (x == 0) return 0;
        long start = 1, end = x;
        long mid = (start + end) / 2;
        long temp = mid * mid;
        while (!((temp <= x) && (((mid + 1) * (mid + 1)) >= x))) {
            if (temp < x)
                start = mid;
            else
                end = mid;
            mid = (start + end) / 2;
            temp = mid * mid;
        }
        return (int) (((mid + 1) * (mid + 1)) > x ? mid : mid + 1);
    }

    public static void main(String[] args) {
        int x = 4;
        log.info(46340 * 46340);
        log.info(mySqrt(2147483647));
    }
}

