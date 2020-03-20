package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by hang.shen@transwarp.io on 2020/3/18.
 */
public class JumpGame {
    /*
    * Given an array of non-negative integers, you are initially positioned at the first index of the array.

    Each element in the array represents your maximum jump length at that position.

            Determine if you are able to reach the last index.

    Example 1:

    Input: [2,3,1,1,4]
    Output: true
    Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
            Example 2:

    Input: [3,2,1,0,4]
    Output: false
    Explanation: You will always arrive at index 3 no matter what. Its maximum
    jump length is 0, which makes it impossible to reach the last index.
    *
    * */
    private static final Logger log = LogManager.getLogger(JumpGame.class);

    public static boolean canJump2(int[] nums) {
        if (nums.length == 0) return false;
        if (nums.length == 1) return true;
        Queue<Integer> temp = new ArrayDeque<>();
        int pos = nums.length - 1;
        temp.add(pos);
        while (!temp.isEmpty()) {
            int current = temp.poll();
            for (int i = 0; i < current; i++) {
                if (nums[i] >= current - i) {
                    temp.add(i);
                    if (i == 0) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }

    public static boolean canJump(int[] nums) {
        if (nums.length == 0) return false;
        if (nums.length == 1) return true;

        int current = nums.length - 1;
        while (true) {
            int temp = current;
            for (int i = 0; i < current; i++) {
                if (nums[i] >= current - i) {
                    current = i;
                    if (i == 0) {
                        return true;
                    }
                    break;
                }
            }
            if (temp == current) break;
        }
        return false;
    }

}

