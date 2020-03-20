package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/3/16.
 */
public class SpiralMatrixTests {

    private static final Logger log = LogManager.getLogger(SpiralMatrixTests.class);

    @Test
    public void testMatrixTest1() {
        int[][] array = new int[3][4];
        int n = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = n;
                n++;
            }
        }
        List<Integer> actual = SpiralMatrix.spiralOrder(array);
        int[] expected = {1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7};
        for (int i = 0; i < expected.length; i++) {
            assert expected[i] == actual.get(i);
        }
    }

    @Test
    public void testMatrixTest2() {
        int[][] array = new int[1][4];
        int n = 1;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = n;
                n++;
            }
        }
        List<Integer> actual = SpiralMatrix.spiralOrder(array);
        int[] expected = {1, 2, 3, 4};
        for (int i = 0; i < expected.length; i++) {
            assert expected[i] == actual.get(i);
        }
    }

    @Test
    public void testMatrixTest3() {
        int[][] array = new int[3][1];
        int n = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                array[i][j] = n;
                n++;
            }
        }
        List<Integer> actual = SpiralMatrix.spiralOrder(array);
        int[] expected = {1, 2, 3};
        for (int i = 0; i < expected.length; i++) {
            assert expected[i] == actual.get(i);
        }
    }

    @Test
    public void testMatrixTest4() {
        int[][] array = new int[][]{};

        List<Integer> actual = SpiralMatrix.spiralOrder(array);
        assert actual == null;

    }
}

