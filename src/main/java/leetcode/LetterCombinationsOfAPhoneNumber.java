package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

/**
 * Created by hang.shen@transwarp.io on 2020-04-23.
 */
public class LetterCombinationsOfAPhoneNumber {
    private static final Logger log = LogManager.getLogger(LetterCombinationsOfAPhoneNumber.class);
    public String[] letters = {"abc", "def", "ghi", "jkl", "nmo", "qprs", "tuv", "wxyz"};
    public Set<String> set = new HashSet<>();

    LetterCombinationsOfAPhoneNumber() {
    }

    public List<String> letterCombinations(String digits) {
        List<String> temp = new ArrayList<>();
        if("".equals(digits)) {
            return temp;
        }
        helper("", 0, digits);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            temp.add((String) iterator.next());
        }
        return temp;
    }

    private void helper(String sb, int index, String digits) {
        if (index >= digits.length()) {
            if (!set.contains(sb)) {
                set.add(sb);
            }
            return;
        }

        String str = letters[digits.charAt(index) - '2'];
        for (char ch : str.toCharArray()) {
            StringBuffer temp = new StringBuffer(sb);
            temp.append(ch);
            helper(temp.toString(), index + 1, digits);
        }
    }
}
