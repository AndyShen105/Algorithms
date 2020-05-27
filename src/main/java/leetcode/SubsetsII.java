package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/5/27.
 */
public class SubsetsII {

    /*Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

    Note: The solution set must not contain duplicate subsets.

    Example:

    Input: [1,2,2]
    Output:
            [
            [2],
            [1],
            [1,2,2],
            [2,2],
            [1,2],
            []
            ]*/


    private static final Logger log = LogManager.getLogger(SubsetsII.class);


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(), add = new ArrayList<>();
        HashSet<List<Integer>> sets = new HashSet<>();
        List<Integer> init = new ArrayList<>();
        sets.add(init);
        result.add(init);

        List<Integer> temp;
        for (Integer i : nums) {
            add.clear();
            ;
            for (List<Integer> l : result) {
                temp = new ArrayList<>(l);
                temp.add(i);
                Collections.sort(temp);
                if (!sets.contains(temp)) {
                    sets.add(temp);
                    add.add(temp);
                }
            }
            result.addAll(add);
        }
        return result;
    }

}

