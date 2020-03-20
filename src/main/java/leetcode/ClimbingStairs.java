package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/3/12.
 */
public class ClimbingStairs {

    private static final Logger log = LogManager.getLogger(ClimbingStairs.class);

    public static int climbStairs(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 2 || n == 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairs2(int n) {
        if (n == 1) return 1;
        int c, a = 1, b = 1;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return a + b;
    }

    public static void main(String[] args) {
        log.info(climbStairs2(2));
    }
}

