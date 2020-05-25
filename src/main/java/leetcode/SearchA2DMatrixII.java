package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/5/19.
 */
public class SearchA2DMatrixII {

    private static final Logger log = LogManager.getLogger(SearchA2DMatrixII.class);

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int m = 0, n = matrix[0].length - 1;
        while (m < matrix.length && n >= 0) {
            if (matrix[m][n] == target) {
                return true;
            }
            while (matrix[m][n] < target) {
                m++;
            }
            while (m < matrix.length && matrix[m][n] > target) {
                n--;
            }

        }
        return false;
    }
}

