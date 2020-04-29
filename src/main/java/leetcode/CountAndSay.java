package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/22.
 */
public class CountAndSay {

    private static final Logger log = LogManager.getLogger(CountAndSay.class);

    public static String countAndSay(int n) {
        String str = "1";
        if (n == 1) return str;
        StringBuilder temp = new StringBuilder("");
        for (int i = 1; i < n; i++) {

            char ch = ' ';
            int count = 0;
            for (char c : str.toCharArray()) {
                if (c == ch) {
                    count++;
                } else {
                    if (ch != ' ') {
                        temp.append(count);
                        temp.append(ch);
                    }
                    ch = c;
                    count = 1;
                }
            }
            temp.append(count);
            temp.append(ch);
            str = temp.toString();
            temp.delete(0, temp.length());
        }
        return str;
    }
}

