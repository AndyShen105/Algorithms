package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/6/3.
 */
public class CanPlaceFlowers {

    private static final Logger log = LogManager.getLogger(CanPlaceFlowers.class);

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            return n == 1;
        }
        for (int i = 0; flowerbed.length > 1 && i < flowerbed.length - 1; i++) {
            if (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                n--;
                flowerbed[i] = 1;
                continue;
            }
            if (i == flowerbed.length - 2 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                n--;
                flowerbed[i + 1] = 1;
                continue;
            }
            if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0) {
                n--;
                flowerbed[i + 1] = 1;
                i++;
                continue;
            }
        }
        return n <= 0;
    }
}

