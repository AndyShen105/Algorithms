package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hang.shen@transwarp.io on 2020/4/22.
 */
public class CountAndSay {

    private static final Logger log = LogManager.getLogger(CountAndSay.class);

    public static String countAndSay(int n) {
        String str = "1";
        if (n == 1) return str;
        Map<Character, Integer> maps = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            for (char ch : str.toCharArray()) {
                if (maps.containsKey(ch)) {
                    maps.put(ch, maps.get(ch) + 1);
                } else {
                    maps.put(ch, 1);
                }
            }
            char pre = '`';
            for (char ch : str.toCharArray()) {
                if (ch != pre) {
                    sb.append(maps.get(ch));
                    sb.append(ch);
                    pre = ch;
                }

            }
            str = sb.toString();
            sb.delete(0, sb.length());
            maps.clear();
        }
        return str;
    }
}

