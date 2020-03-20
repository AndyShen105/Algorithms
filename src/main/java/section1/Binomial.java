package section1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-9-5.
 */
public class Binomial {

    private static final Logger log = LogManager.getLogger(Binomial.class);

    public static double binomial(int n, int k, double p) {
        if (n == 0 && k == 0) return 1.0;
        if (n < 0 || k < 0) return 0.0;
        return (1 - p) * binomial(n - 1, k, p) + p * binomial(n - 1, k - 1, p);
    }

    public static double binomial2(int n, int k, double p) {
        double[][] status = new double[n + 1][k + 1];
        status[0][0] = 1.0;
        for (int j = 0; j < k + 1; j++) {
            for (int i = 0; i < n + 1; i++) {
                if (j == 0 && i >= 0) {
                    status[i][j] = Math.pow(1 - p, i);
                } else if (j > i) {
                    status[i][j] = 0;
                } else {
                    double s = status[i - 1][j - 1];
                    status[i][j] = (1 - p) * status[i - 1][j] + p * status[i - 1][j - 1];
                }
            }
        }
        return status[n][k];
    }

    public static void main(String[] arg) {
        log.info(binomial2(10, 5, 0.25));
        log.info(binomial(10, 5, 0.25));
    }
}

