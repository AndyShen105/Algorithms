package section1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-9-5.
 */
public class EuclidAlgo {

    private static final Logger log = LogManager.getLogger(EuclidAlgo.class);

    public static int EuclidWithRecursion(int va, int vb) {
        int quotient = va % vb;
        if (quotient == 0) {
            return vb;
        } else {
            return EuclidWithRecursion(vb, quotient);
        }

    }

    public static int Euclid(int va, int vb) {
        int max = Math.max(va, vb);
        int min = Math.min(va, vb);
        int quotient = Integer.MAX_VALUE;
        while (quotient > 0) {
            quotient = max % min;
            max = min;
            min = quotient;
            log.info("quotient: {}", quotient);
        }
        return max;
    }

    public static Boolean[][] PrimeArr(int n) {
        Boolean[][] re = new Boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    re[i][j] = false;
                    continue;
                }
                if (EuclidWithRecursion(i, j) == 1) {
                    re[i][j] = true;
                } else {
                    re[i][j] = false;
                }
            }
        }

        return re;
    }

    public static void main(String[] arr) {
        Boolean[][] re = PrimeArr(5);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(re[i][j] + " ");
            }
            System.out.print("\r\n");
        }

    }
}

