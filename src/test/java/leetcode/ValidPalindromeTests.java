package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/8.
 */
public class ValidPalindromeTests {

    private static final Logger log = LogManager.getLogger(ValidPalindromeTests.class);

    @Test
    public void test() {
        String str = "A man, a plan, a canal: Panama";
        ValidPalindrome validPalindrome = new ValidPalindrome();
        assert validPalindrome.isPalindrome(str);
    }

    @Test
    public void test2() {
        char ch = ' ';
        // isLetterOrDigit 无法判断是否为空格
        assert !Character.isLetterOrDigit(ch);
    }
}

