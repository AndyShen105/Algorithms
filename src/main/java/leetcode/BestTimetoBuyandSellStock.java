package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/2.
 */
public class BestTimetoBuyandSellStock {

    private static final Logger log = LogManager.getLogger(BestTimetoBuyandSellStock.class);

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int temp = prices[0];
        prices[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            if (temp > prices[i]) {
                temp = prices[i];
            }
            prices[i] = Math.max(prices[i - 1], prices[i] - temp);

        }
        return prices[prices.length - 1];
    }
}

