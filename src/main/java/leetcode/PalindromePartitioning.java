package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020-05-07.
 */
public class PalindromePartitioning {
    private static final Logger log = LogManager.getLogger(PalindromePartitioning.class);

    public List<List<String>> partition(String s) {
        int len = s.length();
        List<List<String>>[] result = new List[len + 1];
        result[0] = new ArrayList<>();
        result[0].add(new ArrayList<>());
        boolean[][] state = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            result[i + 1] = new ArrayList<>();
            for (int left = 0; left <= i; left++) {
                if (s.charAt(left) == s.charAt(i) && (i - left <= 1 || state[left + 1][i - 1])) {
                    state[left][i] = true;
                    String str = s.substring(left, i + 1);
                    for (List<String> r : result[left]) {
                        List<String> ri = new ArrayList<>(r);
                        ri.add(str);
                        result[i + 1].add(ri);
                    }
                }
            }

        }
        return result[len];
    }

}
