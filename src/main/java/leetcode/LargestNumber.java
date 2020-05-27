package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by hang.shen@transwarp.io on 2020-05-06.
 */
public class LargestNumber {
    private static final Logger log = LogManager.getLogger(LargestNumber.class);

    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Comparator comparator = new Comparator<String>() {
            public int compare(String str1, String str2) {
                String s1 = str1 + str2;
                String s2 = str2 + str1;
                return 0 - s1.compareTo(s2);
            }
        };
        Arrays.sort(strs, comparator);
        if (strs[0].toString().equals("0"))
            return "0";
        StringBuilder builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str);
        }
        return builder.toString();
    }
}
