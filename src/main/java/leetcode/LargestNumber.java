package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by hang.shen@transwarp.io on 2020-05-06.
 */
public class LargestNumber {
    private static final Logger log = LogManager.getLogger(LargestNumber.class);

    public String largestNumber(int[] nums) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        for (int i : nums) {
            queue.add(String.valueOf(i));
        }

        String re = "", temp = queue.poll(), current;
        boolean flag = false || !temp.equals("0");
        while (!queue.isEmpty()) {
            current = queue.poll();
            flag = flag || !current.equals("0");
            if ((temp + current).compareTo(current + temp) > 0) {
                re = current + re;
            } else {
                re = temp + re;
                temp = current;
            }
        }

        return flag ? (temp + re) : "0";
    }
}
