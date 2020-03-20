package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-11-1.
 */
public class DivideTwoIntegers {

    private static final Logger log = LogManager.getLogger(DivideTwoIntegers.class);

    private static long abs(long val) {
        return val > 0 ? val : -val;
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1))
            return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1)
            return Integer.MIN_VALUE;

        long divideCopy = abs(dividend);
        long divisorCopy = abs(divisor);
        int flag = dividend < 0 == divisor < 0 ? 1 : -1;
        int re = 0;
        long temp = divisorCopy;
        while (temp <= divideCopy) {
            temp += divisorCopy;
            if (re > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            re++;
        }
        return flag < 0 ? 0 - re : re;
    }

    public static void main(String[] args) {
        log.info(divide(2147483647, 2));
    }
}

