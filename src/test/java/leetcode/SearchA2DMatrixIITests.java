package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/19.
 */
public class SearchA2DMatrixIITests {

    private static final Logger log = LogManager.getLogger(SearchA2DMatrixIITests.class);

    @Test
    public void test1() {
        int[][] array = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        SearchA2DMatrixII searchA2DMatrixII = new SearchA2DMatrixII();
        log.info(searchA2DMatrixII.searchMatrix(array, 16));
    }
}

