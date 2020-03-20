package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/3/13.
 */
public class Subsets {

    private static final Logger log = LogManager.getLogger(Subsets.class);

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> re = new ArrayList<>();
        if (nums.length == 0) return null;
        List<Integer> empty = new ArrayList<>();
        re.add(empty);

        for (int number : nums) {
            int size = re.size();
            for (int i = 0; i < size; i++) {
                List<Integer> temp = new ArrayList<>();
                temp.addAll(re.get(i));
                temp.add(number);
                re.add(temp);
            }
        }
        return re;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        log.info(subsets(nums));
    }
}

