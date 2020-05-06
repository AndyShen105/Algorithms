package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/6.
 */
public class BestTimetoBuyandSellStockIITests {

    private static final Logger log = LogManager.getLogger(BestTimetoBuyandSellStockIITests.class);

    @Test
    public void test1() {
        int[] array = {7, 1, 5, 3, 6, 4};
        BestTimetoBuyandSellStockII bestTimetoBuyandSellStockII = new BestTimetoBuyandSellStockII();
        log.info(bestTimetoBuyandSellStockII.maxProfit(array));
    }

    @Test
    public void test2() {
        int[] array = {1, 2, 3, 4, 5};
        BestTimetoBuyandSellStockII bestTimetoBuyandSellStockII = new BestTimetoBuyandSellStockII();
        log.info(bestTimetoBuyandSellStockII.maxProfit(array));
    }
}

