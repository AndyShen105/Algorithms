package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-11-6.
 */
public class ValidParentheses {

    private static final Logger log = LogManager.getLogger(ValidParentheses.class);

    public static boolean isValid(String s) {
        int len = s.length(), curr = 0;
        if (len == 0 || len % 2 != 0) return false;
        char[] ch = new char[len], tar = s.toCharArray();
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                ch[curr] = tar[i];
            } else {
                if (tar[i] == ')' && ch[curr] == '(') {
                    curr--;
                } else if (tar[i] == ']' && ch[curr] == '[') {
                    curr--;
                } else if (tar[i] == '}' && ch[curr] == '{') {
                    curr--;
                } else {
                    curr++;
                    ch[curr] = tar[i];
                }
            }
        }
        return curr <= 0 ? true : false;
    }

    public static void main(String[] args) {
        String s = "[()(){]]";
        log.info(isValid(s));
    }
}

