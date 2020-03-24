package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/3/24.
 */
public class UniquePaths2Tests {

    private static final Logger log = LogManager.getLogger(UniquePaths2Tests.class);

    @Test
    public void UniquePathsTest1() {
        int[][] array = new int[3][3];
        int[] a1 = {0, 0, 0};
        int[] a2 = {0, 1, 0};
        int[] a3 = {0, 0, 0};
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;
        assert UniquePaths2.uniquePathsWithObstacles(array) == 2;
    }

    @Test
    public void UniquePathsTest2() {
        int[][] array = new int[3][3];
        int[] a1 = {0, 1, 0};
        int[] a2 = {0, 1, 0};
        int[] a3 = {0, 1, 0};
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;
        assert UniquePaths2.uniquePathsWithObstacles(array) == 0;
    }

    @Test
    public void UniquePathsTest3() {
        int[][] array = new int[3][3];
        int[] a1 = {0, 1, 0};
        int[] a2 = {0, 1, 0};
        int[] a3 = {0, 0, 0};
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;
        assert UniquePaths2.uniquePathsWithObstacles(array) == 1;
    }

    @Test
    public void UniquePathsTest4() {
        int[][] array = new int[1][1];
        int[] a1 = {1};
        array[0] = a1;
        assert UniquePaths2.uniquePathsWithObstacles(array) == 0;
    }
}

