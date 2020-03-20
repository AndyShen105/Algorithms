package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-10-11.
 */
public class ContainerWithMostWater {

    private static final Logger log = LogManager.getLogger(ContainerWithMostWater.class);

    public static int maxArea(int[] height) {
        int maxArea = 0, start = 0, end = height.length - 1;

        while (start < end) {
            if (height[start] < height[end]) {
                maxArea = Math.max(maxArea, (end - start) * height[start]);
                start++;
            } else {
                maxArea = Math.max(maxArea, (end - start) * height[end]);
                end--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        log.info(maxArea(array));
    }
}

