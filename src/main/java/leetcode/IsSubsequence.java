package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hang.shen@transwarp.io on 2020/4/16.
 */
public class IsSubsequence {

    private static final Logger log = LogManager.getLogger(IsSubsequence.class);

    public static boolean isSubsequence(String s, String t) {
        int pre = -1, len = t.length();
        List<Integer> temp;
        Map<Character, List<Integer>> map = new HashMap<>();
        char[] chs = t.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (map.containsKey(chs[i])) {
                temp = map.get(chs[i]);
            } else {
                temp = new ArrayList<>();
                map.put(chs[i], temp);
            }
            temp.add(i);
        }
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                return false;
            } else {
                temp = map.get(ch);
                boolean isContain = false;
                for (Integer index : temp) {
                    if (index >= pre) {
                        pre = index;
                        isContain = true;
                        break;
                    }
                }
                if (!isContain) {
                    return false;
                }

            }
        }
        return true;
    }
}

