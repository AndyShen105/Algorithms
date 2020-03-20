package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-12-27.
 */
public class MergeSortedArray {

    private static final Logger log = LogManager.getLogger(MergeSortedArray.class);

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m + n - 1;
        for (int i = end; i >= 0; i--) {
            if (n == 0) return;
            if (m == 0) {
                for (int j = 0; j < n; j++) {
                    nums1[j] = nums2[j];
                }
                break;
            }
            if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[i] = nums1[m - 1];
                m--;
            } else {
                nums1[i] = nums2[n - 1];
                n--;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 0};
        int[] arr23 = {1, 2, 3, 4};
        merge(arr1, 0, arr23, 4);
        log.info("aa{}", arr1);
    }
}

