package section1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by hang.shen@transwarp.io on 19-9-23.
 */
public class LongestSubstring {

    private static final Logger log = LogManager.getLogger(LongestSubstring.class);

    public LongestSubstring() {
    }

    public static int longestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        Set<Character> set = new HashSet<>();
        int maxVal = -1;
        for (int i = 0; i < s.length() - 1; i++) {
            set.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                char temp = s.charAt(j);
                if (set.contains(temp)) {

                    break;
                } else {
                    set.add(temp);
                }
            }
            int size = set.size();
            if (size > maxVal) maxVal = size;
            set.clear();
        }
        return maxVal;
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "abcadefg";
        log.info(lengthOfLongestSubstring(str));
    }
}

