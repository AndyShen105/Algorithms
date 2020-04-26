package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020-04-23.
 */
public class LetterCombinationsOfAPhoneNumberTests {
    private static final Logger log = LogManager.getLogger(LetterCombinationsOfAPhoneNumberTests.class);

    @Test
    public void test1() {
        LetterCombinationsOfAPhoneNumber test = new LetterCombinationsOfAPhoneNumber();
        List<String> re = test.letterCombinations("23");
        log.info(re);
    }

    @Test
    public void test2() {
        LetterCombinationsOfAPhoneNumber test = new LetterCombinationsOfAPhoneNumber();
        List<String> re = test.letterCombinations("");
        log.info(re);
    }
}
