package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020-04-28.
 */
public class SetMatrixZeroesTests {
    private static final Logger log = LogManager.getLogger(SetMatrixZeroesTests.class);

    @Test
    public void test1() {
        int[][] array = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        setMatrixZeroes.setZeroes(array);
    }
}
