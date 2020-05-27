package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/26.
 */
public class KtSmallestElementInASortedMatrixTests {

    private static final Logger log = LogManager.getLogger(KtSmallestElementInASortedMatrixTests.class);

    @Test
    public void test1() {
        int[][] array = {{1, 5, 8}, {6, 7, 9}, {8, 9, 10}};
        KtSmallestElementInASortedMatrix ktSmallestElementInASortedMatrix = new KtSmallestElementInASortedMatrix();
        log.info(ktSmallestElementInASortedMatrix.kthSmallest(array, 9));
    }
}

