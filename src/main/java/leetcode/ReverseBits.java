package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020-05-07.
 */
public class ReverseBits {
    private static final Logger log = LogManager.getLogger(ReverseBits.class);
    public int reverseBits(int n) {
        int result = 0;
        // << 左移 一共移动32次，判断首位是否为1，如果是1 则移动后要+1
        for (int i=0; i<32; i++) {
            if ((n & 1) == 1) {
                result = (result << 1) + 1;
            } else {
                result = result << 1;
            }
            n = n >> 1;
        }
        return result;
    }
}
