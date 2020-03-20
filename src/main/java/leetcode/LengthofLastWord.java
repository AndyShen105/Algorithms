package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-12-13.
 */
public class LengthofLastWord {

    private static final Logger log = LogManager.getLogger(LengthofLastWord.class);

    public static int lengthOfLastWord(String s) {

        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] == ' ') {
                return count;
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "a";
        log.info(lengthOfLastWord(s));
    }
}

