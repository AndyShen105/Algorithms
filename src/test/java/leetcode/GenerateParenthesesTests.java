package leetcode;
import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/14.
 */
public class GenerateParenthesesTests {

    private static final Logger log = LogManager.getLogger(GenerateParentheses.class);

    @Test
    public void generateParenthesesTest1() {
        int n = 3;
        log.info(GenerateParentheses.generateParenthesis(3));
    }

}
