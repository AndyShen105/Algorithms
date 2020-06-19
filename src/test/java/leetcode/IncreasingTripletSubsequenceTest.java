package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/6/19.
 */
public class IncreasingTripletSubsequenceTest {

    private static final Logger log = LogManager.getLogger(IncreasingTripletSubsequenceTest.class);

    @Test
    public void test1() {
        int[] array = {1, 1, -2, 6};
        IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
        increasingTripletSubsequence.increasingTriplet(array);
    }
}

