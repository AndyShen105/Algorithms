package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020-04-28.
 */
public class SetMatrixZeroes {
    private static final Logger log = LogManager.getLogger(SetMatrixZeroes.class);

    public void setZeroes(int[][] matrix) {
        int x = 0, y = 0;
        boolean flag = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (flag) {
                        x = i;
                        y = j;
                        flag = false;
                    }

                }
            }
        }
        if(flag) return;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[x][j] = 0;
                    matrix[i][y] = 0;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (i == x) continue;
            if (matrix[i][y] == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            } else {
                matrix[i][y] = 0;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (i == y) continue;
            if (matrix[x][i] == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            } else {
                matrix[x][i] = 0;
            }
        }

        log.info("");
    }
}
