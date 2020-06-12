package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/6/12.
 */
public class FindFirstAndLastPositionOfElementInSortedArrayTests {

    private static final Logger log = LogManager.getLogger(FindFirstAndLastPositionOfElementInSortedArrayTests.class);

    @Test
    public void test1() {
        int array[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        FindFirstAndLastPositionOfElementInSortedArray FindFirstAndLastPositionOfElementInSortedArray = new FindFirstAndLastPositionOfElementInSortedArray();
        FindFirstAndLastPositionOfElementInSortedArray.searchRange(array, target);
    }

    @Test
    public void test2() {
        int array[] = {8};
        int target = 8;
        FindFirstAndLastPositionOfElementInSortedArray FindFirstAndLastPositionOfElementInSortedArray = new FindFirstAndLastPositionOfElementInSortedArray();
        FindFirstAndLastPositionOfElementInSortedArray.searchRange(array, target);
    }

    @Test
    public void test3() {
        int array[] = {2, 2};
        int target = 3;
        FindFirstAndLastPositionOfElementInSortedArray FindFirstAndLastPositionOfElementInSortedArray = new FindFirstAndLastPositionOfElementInSortedArray();
        FindFirstAndLastPositionOfElementInSortedArray.searchRange(array, target);
    }
}

