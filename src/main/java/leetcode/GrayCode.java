package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/6/2.
 */
public class GrayCode {

    private static final Logger log = LogManager.getLogger(GrayCode.class);

    public List<Integer> grayCode(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int num = 1 << n;
        for (int i = 0; i < num; i++) {
            int a = i >> 1;
            int b = a ^ i;
            res.add(i >> 1 ^ i);
        }
        return res;
    }
}

