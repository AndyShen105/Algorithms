package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020-05-07.
 */
public class PalindromePartitioningTests {
    private static final Logger log = LogManager.getLogger(PalindromePartitioningTests.class);

    @Test
    public void test1() {
        String str = "aab";
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        log.info(palindromePartitioning.partition(str));
    }
}
