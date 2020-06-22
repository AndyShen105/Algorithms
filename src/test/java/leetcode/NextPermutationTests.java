package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/6/22.
 */
public class NextPermutationTests {

    private static final Logger log = LogManager.getLogger(NextPermutationTests.class);

    @Test
    public void test1() {
        int[] array = {1, 2, 3, 4};
        NextPermutation nextPermutation = new NextPermutation();
        nextPermutation.nextPermutation(array);
        log.info(array);
    }

    @Test
    public void test2() {
        int[] array = {4, 3, 2, 1};
        NextPermutation nextPermutation = new NextPermutation();
        nextPermutation.nextPermutation(array);
        log.info(array);
    }

    @Test
    public void test3() {
        int[] array = {1, 3, 2};
        NextPermutation nextPermutation = new NextPermutation();
        nextPermutation.nextPermutation(array);
        log.info(array);
    }
}

