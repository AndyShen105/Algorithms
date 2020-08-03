package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/8/3.
 */
public class LetterCasePermutationTests {

    private static final Logger log = LogManager.getLogger(LetterCasePermutationTests.class);

    @Test
    public void test1() {
        String S = "a1b2";
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        List<String> result = letterCasePermutation.letterCasePermutation(S);
        log.info(result);
    }
}

