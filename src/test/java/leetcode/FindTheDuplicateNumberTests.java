package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/6/10.
 */
public class FindTheDuplicateNumberTests {

    private static final Logger log = LogManager.getLogger(FindTheDuplicateNumberTests.class);

    @Test
    public void test1() {
        int array[] = {1, 4, 4, 3, 2};
        FindTheDuplicateNumber findTheDuplicateNumber = new FindTheDuplicateNumber();
        log.info(findTheDuplicateNumber.findDuplicate(array));
    }
}

