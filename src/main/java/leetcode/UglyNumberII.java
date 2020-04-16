package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/15.
 */
public class UglyNumberII {

    private static final Logger log = LogManager.getLogger(UglyNumberII.class);

    //
    public static int nthUglyNumber(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        int f2 = 2;
        int f3 = 3;
        int f5 = 5;

        for (int i = 1; i < n; i++) {
            arr[i] = Math.min(f2, Math.min(f3, f5));

            if (arr[i] == f2) {
                i2++;
                f2 = arr[i2] * 2;
            }

            if (arr[i] == f3) {
                i3++;
                f3 = arr[i3] * 3;
            }

            if (arr[i] == f5) {
                i5++;
                f5 = arr[i5] * 5;
            }
        }

        return arr[n - 1];
    }
}

