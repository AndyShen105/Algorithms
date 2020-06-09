package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/6/8.
 */
public class PalindromicSubstringsTests {

    private static final Logger log = LogManager.getLogger(PalindromicSubstringsTests.class);

    @Test
    public void test1() {
        String s = "aaa";
        PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();
        log.info(palindromicSubstrings.countSubstrings(s));
    }

    @Test
    public void test2() {
        String s = "a";
        PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();
        log.info(palindromicSubstrings.countSubstrings(s));
    }

    @Test
    public void test3() {
        String s = "aa";
        PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();
        log.info(palindromicSubstrings.countSubstrings(s));
    }

    @Test
    public void test4() {
        String s = "aaaaa";
        PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();
        log.info(palindromicSubstrings.countSubstrings(s));
    }
}
