package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-10-21.
 */
public class SquaresOfaSortedArray {

    private static final Logger log = LogManager.getLogger(SquaresOfaSortedArray.class);

    public static int[] sortedSquares(int[] A) {
        if (A.length == 0) return A;
        if (A.length == 1) {
            A[0] = (int) Math.pow(A[0], 2);
        }

        int start = 0, end = A.length - 1, pStart, pEnd;
        while (start <= end) {
            pStart = (int) Math.pow(A[start], 2);
            pEnd = (int) Math.pow(A[end], 2);
            if (pStart < pEnd) {
                A[end] = pEnd;
            } else {
                A[start] = A[end];
                A[end] = pStart;
            }
            end--;
        }
        return A;
    }

    public static int[] sortedSquares2(int[] A) {
        if (A.length == 0) return A;
        if (A.length == 1) {
            A[0] = (int) Math.pow(A[0], 2);
        }
        int[] re = new int[A.length];
        int start = 0, end = A.length - 1, pStart, pEnd, i = A.length - 1;
        while (start <= end) {
            pStart = (int) Math.pow(A[start], 2);
            pEnd = (int) Math.pow(A[end], 2);
            if (pStart < pEnd) {
                re[i] = pEnd;
                end--;
            } else {
                re[i] = pStart;
                start++;
            }
            i--;
        }
        return re;
    }

    public static void main(String[] args) {
        int[] p = {-3, -3, -2, 1};
        for (int i : sortedSquares2(p)) {
            log.info(i);
        }
    }
}

