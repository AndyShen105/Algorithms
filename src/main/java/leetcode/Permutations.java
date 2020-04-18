package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/4/16.
 */
public class Permutations {
    public static List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        result.clear();
        permutation(nums, new ArrayList());
        return result;
    }
    public void permutation(int[] nums, List<Integer> list) {
        if(list.size() == nums.length) {
            result.add(list);
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])) {
                List<Integer> subList = new ArrayList<>(list);
                subList.add(nums[i]);
                permutation(nums, subList);
            }
        }
    }
}

