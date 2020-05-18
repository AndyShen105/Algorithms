package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/18.
 */
public class FindMinimuminRotatedSortedArrayTests {

    private static final Logger log = LogManager.getLogger(FindMinimuminRotatedSortedArrayTests.class);

    @Test
    public void test1() {
        int[] array = {3, 4, 5, 6, 0};
        FindMinimuminRotatedSortedArray findMinimuminRotatedSortedArray = new FindMinimuminRotatedSortedArray();
        log.info(findMinimuminRotatedSortedArray.findMin(array));
    }

    @Test
    public void test2() {
        int[] array = {1};
        FindMinimuminRotatedSortedArray findMinimuminRotatedSortedArray = new FindMinimuminRotatedSortedArray();
        log.info(findMinimuminRotatedSortedArray.findMin(array));
    }

    @Test
    public void test3() {
        int[] array = {3, 4, 5, 6, 0, 1, 2,};
        FindMinimuminRotatedSortedArray findMinimuminRotatedSortedArray = new FindMinimuminRotatedSortedArray();
        log.info(findMinimuminRotatedSortedArray.findMin(array));
    }

    @Test
    public void test4() {
        int[] array = {1, 2,};
        FindMinimuminRotatedSortedArray findMinimuminRotatedSortedArray = new FindMinimuminRotatedSortedArray();
        log.info(findMinimuminRotatedSortedArray.findMin(array));
    }
}

