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
        if (ch.length == 0) return 0;
        int index = ch.length - 1, count = 0;
        while (index >= 0 && ch[index] == ' ') index--;
        while (index >= 0 && ch[index] != ' ') {
            count++;
            index--;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = " ";
        log.info(lengthOfLastWord(s));
    }
}

