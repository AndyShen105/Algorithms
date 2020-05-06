package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/5/6.
 */
public class BestTimetoBuyandSellStockII {

    private static final Logger log = LogManager.getLogger(BestTimetoBuyandSellStockII.class);

    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int pre = 0, current = 1, sum = 0;
        while (current < prices.length) {
            if (prices[current] >= prices[current - 1]) {
                if (current == prices.length - 1) {
                    sum += prices[current] - prices[pre];
                }
                current++;
            } else {
                sum += prices[current - 1] - prices[pre];
                pre = current;
                current++;
            }
        }
        return sum;
    }
}

