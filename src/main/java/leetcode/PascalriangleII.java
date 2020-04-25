package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/4/23.
 */
public class PascalriangleII {

    private static final Logger log = LogManager.getLogger(PascalriangleII.class);

    public static List<Integer> generate(int rowIndex) {
        List<Integer> pre = new ArrayList<>(), curr = new ArrayList<>(), temp;
        pre.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    curr.add(1);
                } else {
                    curr.add(pre.get(j - 1) + pre.get(j));
                }
            }
            temp = pre;
            pre = curr;
            curr = temp;
            curr.clear();
        }
        return pre;
    }
}

