package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hang.shen@transwarp.io on 19-10-30.
 */
public class SingleNumber {

    private static final Logger log = LogManager.getLogger(SingleNumber.class);

    public static int singleNumber(int[] nums) {

        Set<Integer> map = new HashSet<>();
        for (int i : nums) {
            if (map.contains(i))
                map.remove(i);
            else
                map.add(i);
        }
        return (int) map.toArray()[0];
    }

    // 位运算（亦或），只要循环异或，出现两次的都变成0了，最后只剩下出现一次的single number
    public int singleNumber2(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] array = {4, 1, 2, 1, 2};
        log.info(singleNumber(array));
    }
}

