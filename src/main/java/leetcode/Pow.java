package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.NumberFormat;

/**
 * Created by hang.shen@transwarp.io on 19-9-26.
 */
public class Pow {

    private static final Logger log = LogManager.getLogger(Pow.class);

    public Pow() {
    }

    public static double myPow(double x, int n) {
        int flag = n < 0 ? -1 : 1;
        double re = 1;
        for (int i = 0; i < Math.abs(n); i++) {
            re = re * x;
        }
        if (flag == -1)
            re = 1 / re;

        return re;
    }

    public static double myPowRecurse(double x, int n) {
        if (n >= Integer.MAX_VALUE || n <= Integer.MIN_VALUE) return 0;
        if (x == 1.0) return 1;
        double re = calculate(x, Math.abs(n));
        return n < 0 ? 1 / re : re;
    }

    private static double calculate(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        double temp = calculate(x, n / 2);
        return temp * temp * calculate(x, n % 2);
    }


    public static void main(String[] args) {
        /* 这个问题超级恶心，就是边界问题，x=1, -1; n = MAXVALUE, MINVALUE;
         * */
        System.out.println(myPowRecurse(2.1, 3));
        System.out.println(myPowRecurse(4, -1));
        long start = System.currentTimeMillis();
        myPowRecurse(0.00001, -2147483648);
        long end = System.currentTimeMillis();
        log.info(end - start);

    }
}

