package section5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-11-4.
 */
public class KMP {

    private static final Logger log = LogManager.getLogger(KMP.class);

    public KMP() {
    }

    private static int[] nextStartBy0(String target) {
        int len = target.length();
        int[] next = new int[len];
        next[0] = 0;
        for (int i = 1, k = 0; i < len; i++) {
            while (k > 0 && target.charAt(k) != target.charAt(i))
                k = next[k - 1];
            if (target.charAt(k) == target.charAt(i))
                k++;
            next[i] = k;
        }
        return next;
    }

    public static int kmpNext0(String haystack, String needle) {
        int[] next = nextStartBy0(needle);
        int current = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (needle.charAt(current) == haystack.charAt(i)) {
                current++;
                if (current == needle.length()) return i + 1 - current;
            } else {
                if (current != 0) {
                    current = current - next[current - 1];
                }
            }

        }
        return -1;
    }

    private static int[] getNext(String target) {
        int[] next = new int[target.length()];
        int i = -1, j = 0;
        next[0] = -1;
        while (j < target.length()) {
            if (i == -1 || target.charAt(i) == target.charAt(j)) {
                i++;
                j++;
                next[j] = i;
            } else {
                i = next[i];
            }
        }
        return next;
    }

    public static int bruteForce(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        int j, m = needle.length();
        int i, n = haystack.length();

        for (i = 0, j = 0; i < n && j < m; i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                i -= j;
                j = 0;
            }
        }
        if (j == m) return i - m;
        else return -1;
    }

    public static void main(String[] args) {
        String text = "hello";
        String target = "ll";

        String text1 = "aaaaa";
        String target1 = "abb";
        log.info(bruteForce(text, target));
        log.info(kmpNext0(text, target));

        int[] next0 = nextStartBy0(text);
        int[] next = getNext(text);

        log.info(bruteForce(text1, target1));
    }

}

