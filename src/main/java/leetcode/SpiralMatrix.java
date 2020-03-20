package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/3/16.
 */
public class SpiralMatrix {
    /*
    *Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

    Example 1:

    Input:
    [
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
    ]
    Output: [1,2,3,6,9,8,7,4,5]
    Example 2:

    Input:
    [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9,10,11,12]
    ]
    Output: [1,2,3,4,8,12,11,10,9,5,6,7]
    * */
    private static final Logger log = LogManager.getLogger(SpiralMatrix.class);

    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new ArrayList<>();
        int xs = 0, ys = 0, xe = matrix.length - 1, ye = matrix[0].length - 1, size = (xe + 1) * (ye + 1);
        List<Integer> result = new ArrayList<>();
        while (xs <= xe && ys <= ye) {
            helper(matrix, xs, ys, xe, ye, size, result);
            xs++;
            xe--;
            ys++;
            ye--;
        }
        return result;
    }

    private static void helper(int[][] matrix, int xs, int ys, int xe, int ye, int size, List<Integer> result) {
        for (int i = ys; i <= ye && result.size() < size; i++) {
            result.add(matrix[xs][i]);
        }
        for (int i = xs + 1; i <= xe && result.size() < size; i++) {
            result.add(matrix[i][ye]);
        }
        for (int i = ye - 1; i >= ys && result.size() < size; i--) {
            result.add(matrix[xe][i]);
        }
        for (int i = xe - 1; i > xs && result.size() < size; i--) {
            result.add(matrix[i][ys]);
        }
    }
}

