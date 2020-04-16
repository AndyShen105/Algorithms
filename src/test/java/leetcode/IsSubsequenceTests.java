package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/16.
 */
public class IsSubsequenceTests {

    private static final Logger log = LogManager.getLogger(IsSubsequenceTests.class);

    @Test
    public void isSubsequenceTest1() {
        String s = "abc", t = "ahbgdc";
        log.info(IsSubsequence.isSubsequence(s, t));
    }

    @Test
    public void isSubsequenceTest2() {
        String s = "acb", t = "ahbgdc";
        log.info(IsSubsequence.isSubsequence(s, t));
    }
}

