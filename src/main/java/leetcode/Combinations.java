package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/5/11.
 */
public class Combinations {

    private static final Logger log = LogManager.getLogger(Combinations.class);

    public static List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        result.clear();
        List<Integer> list = new ArrayList<>();

        helper(k, n, 0, list);
        return result;
    }

    public void helper(int k, int n, int start, List<Integer> list) {
        if (list.size() == k) {
            result.add(list);
            return;
        }
        for (int i = start; i < n; i++) {
            List<Integer> newList = new ArrayList<>(list);
            newList.add(i + 1);
            helper(k, n, i + 1, newList);
        }
    }
}

