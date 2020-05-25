package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/20.
 */
public class ValidAnagramTests {

    private static final Logger log = LogManager.getLogger(ValidAnagramTests.class);

    @Test
    public void test1() {
        String s = "anagram", t = "nagaram";
        ValidAnagram validAnagram = new ValidAnagram();
        log.info(validAnagram.isAnagram(s, t));
    }

    @Test
    public void test2() {
        String s = "rat", t = "car";
        ValidAnagram validAnagram = new ValidAnagram();
        log.info(validAnagram.isAnagram(s, t));
    }
}

