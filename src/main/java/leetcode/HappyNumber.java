package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hang.shen@transwarp.io on 2020-05-06.
 */
public class HappyNumber {
    private static final Logger log = LogManager.getLogger(HappyNumber.class);

    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();
        while (true) {
            if (set.contains(n)) {
                break;
            } else {
                set.add(n);
            }
            String str = String.valueOf(n);
            int temp = 0;
            for (char ch : str.toCharArray()) {
                temp += Math.pow(ch - '0', 2);
            }
            if (temp == 1) return true;
            n = temp;
        }
        return false;
    }

}
