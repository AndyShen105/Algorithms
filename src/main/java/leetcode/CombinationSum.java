package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 19-11-11.
 */
public class CombinationSum {

    private static final Logger log = LogManager.getLogger(CombinationSum.class);

    public static void helper(int[] candidates, int target, int index, List<Integer> item, List<List<Integer>> re) {

        if (target == 0) {
            re.add(new LinkedList<>(item));
            return;
        } else if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            item.add(candidates[i]);
            helper(candidates, target - candidates[i], i, item, re);
            item.remove(item.size() - 1);
        }

    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0) return null;
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, temp, result);
        return result;
    }

    public static void main(String[] args) {
        int[] in = {1, 2, 7, 11, 6, 35};
        log.info(combinationSum(in, 8));
    }
}

