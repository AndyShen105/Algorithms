package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by hang.shen@transwarp.io on 2020-04-23.
 */
public class PermutationsII {
    private static final Logger log = LogManager.getLogger(PermutationsII.class);
    public Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>(nums.length);
        for(int i:nums) list.add(i);

        helper(list, new ArrayList());
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            result.add((List<Integer>)iterator.next());
        }
        return result;
    }

    private void helper(List<Integer> nums, List<Integer> list) {
        if(nums.size() == 0) {
            if(!set.contains(list)){
                set.add(list);
            }

            return;
        }
        for(int i = 0; i < nums.size(); i++) {
            List<Integer> temp = new ArrayList<>(list);
            List<Integer> subList = new ArrayList<>(nums);
            subList.remove(i);
            temp.add(nums.get(i));
            helper(subList, temp);
        }
    }
}
