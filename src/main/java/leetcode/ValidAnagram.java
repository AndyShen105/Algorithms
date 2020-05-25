package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hang.shen@transwarp.io on 2020/5/20.
 */
public class ValidAnagram {

    private static final Logger log = LogManager.getLogger(ValidAnagram.class);

    public boolean isAnagram2(String s, String t) {
        int[] sa = new int[128];
        int[] ta = new int[128];
        for (char i : s.toCharArray()) {
            sa[i - 0] = sa[i - 0] + 1;
        }

        for (char i : t.toCharArray()) {
            ta[i - 0] = ta[i - 0] + 1;
        }

        for (int i = 0; i < 128; i++) {
            if (sa[i] != ta[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char i : s.toCharArray()) {
            if (map1.containsKey(i)) {
                map1.put(i, map1.get(i) + 1);
            } else {
                map1.put(i, 0);
            }
        }

        for (char i : t.toCharArray()) {
            if (map2.containsKey(i)) {
                map2.put(i, map2.get(i) + 1);
            } else {
                map2.put(i, 0);
            }
        }
        return map1.equals(map2);
    }
}

