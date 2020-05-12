package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hang.shen@transwarp.io on 2020/4/3.
 */
public class WordBreak {
    /*
    * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

    Note:

    The same word in the dictionary may be reused multiple times in the segmentation.
    You may assume the dictionary does not contain duplicate words.
    Example 1:

    Input: s = "leetcode", wordDict = ["leet", "code"]
    Output: true
    Explanation: Return true because "leetcode" can be segmented as "leet code".
    Example 2:

    Input: s = "applepenapple", wordDict = ["apple", "pen"]
    Output: true
    Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
                 Note that you are allowed to reuse a dictionary word.
    Example 3:

    Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
    Output: false
    * */
    private static final Logger log = LogManager.getLogger(WordBreak.class);

    public boolean wordBreak3(String s, List<String> wordDict) {
        if (s.length() == 0) return false;
        Set<String> sets = new HashSet<>(wordDict);
        return helper(0, s, sets);
    }

    private boolean helper(int start_position, String s, Set<String> set) {
        if (start_position >= s.length()) return true;
        boolean flag = false;
        for (int i = start_position + 1; i <= s.length(); i++) {
            String temp = s.substring(start_position, i);
            if (set.contains(temp)) {
                flag = flag || helper(i, s, set);
                if (flag) return flag;
            }
        }
        return flag;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

}

