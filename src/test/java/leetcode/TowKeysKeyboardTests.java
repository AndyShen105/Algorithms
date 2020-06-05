package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/6/4.
 */
public class TowKeysKeyboardTests {

    private static final Logger log = LogManager.getLogger(TowKeysKeyboardTests.class);

    @Test
    public void test1() {
        int n = 3;
        TowKeysKeyboard towKeysKeyboard = new TowKeysKeyboard();
        assert towKeysKeyboard.minSteps(n) == 3;
    }

    @Test
    public void test2() {
        int n = 7;
        TowKeysKeyboard towKeysKeyboard = new TowKeysKeyboard();
        assert towKeysKeyboard.minSteps(n) == 7;
    }
}

