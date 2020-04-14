package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 20-04-14.
 */
public class GenerateParentheses {
    /*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

     For example, given n = 3, a solution set is:

        [
            "((()))",
            "(()())",
            "(())()",
            "()(())",
            "()()()"
        ]
    * */
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper("", n, n, result);
        return result;
    }

    private static void helper(String str, int left, int right, List<String> result) {
        if(left == 0 && right == 0) {
            result.add(str);
        }else {
            if(left > 0) {
                helper(str + "(", left - 1, right, result);
            }
            if(left < right) {
                helper(str + ")", left, right - 1, result);
            }
        }
    }
}
