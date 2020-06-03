package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/6/3.
 */
public class CanPlaceFlowersTests {

    private static final Logger log = LogManager.getLogger(CanPlaceFlowersTests.class);

    @Test
    public void test1() {
        int[] array = {1, 0, 0, 0, 1};
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assert canPlaceFlowers.canPlaceFlowers(array, 1);
    }

    @Test
    public void test2() {
        int[] array = {1, 0};
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assert !canPlaceFlowers.canPlaceFlowers(array, 1);
    }

    @Test
    public void test3() {
        int[] array = {0, 0};
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assert canPlaceFlowers.canPlaceFlowers(array, 1);
    }

    @Test
    public void test4() {
        int[] array = {0};
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assert canPlaceFlowers.canPlaceFlowers(array, 1);
    }
}

