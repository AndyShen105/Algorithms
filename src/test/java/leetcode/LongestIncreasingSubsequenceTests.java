package leetcode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
public class LongestIncreasingSubsequenceTests {
    private static final Logger log = LogManager.getLogger(LongestIncreasingSubsequenceTests.class);

    @Test
    public void LongestIncreasingSubsequenceTest1() {
        int[] array = {10,9,2,5,3,7,101,18};
        log.info(LongestIncreasingSubsequence.lengthOfLIS(array));
        assert LongestIncreasingSubsequence.lengthOfLIS(array) == 4;
    }
}
