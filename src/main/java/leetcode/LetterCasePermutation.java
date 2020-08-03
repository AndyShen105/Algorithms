package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/8/3.
 */
public class LetterCasePermutation {

    private static final Logger log = LogManager.getLogger(LetterCasePermutation.class);
    private List<String> result = new ArrayList<>();

    public List<String> letterCasePermutation(String S) {
        result.clear();
        if (S.length() == 0) return result;
        backTrackForPermutation(new StringBuilder(), new StringBuilder(S));
        return result;
    }

    private void backTrackForPermutation(StringBuilder str, StringBuilder S) {
        if (0 == S.length()) {
            result.add(new String(str));
            return;
        }
        StringBuilder sb = new StringBuilder(S);
        for (int i = 0; i < S.length(); i++) {
            sb.deleteCharAt(i);
            if (Character.isLetter(S.charAt(i))) {
                char tempCh = Character.isUpperCase(S.charAt(i)) ? Character.toLowerCase(S.charAt(i)) : S.charAt(i);
                str.append(tempCh);
                backTrackForPermutation(str, sb);

                str.deleteCharAt(str.length() - 1);
                str.append(Character.toUpperCase(tempCh));
                backTrackForPermutation(str, sb);

            } else {
                str.append(Character.toUpperCase(S.charAt(i)));
                backTrackForPermutation(str, sb);
            }
            str.deleteCharAt(str.length() - 1);
            sb.append(S.charAt(i));
        }
    }
}

