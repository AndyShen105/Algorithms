package section1;

import UtilFunc.AlgoUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hang.shen@transwarp.io on 19-9-17.
 */
public class Nsum {

    private static final Logger log = LogManager.getLogger(Nsum.class);

    public static int TowSum(int[] arr, int val) {
        Arrays.sort(arr);
        int[] re = new int[2];
        int count = 0, start = 0, end = arr.length - 1;
        while (start <= end) {
            int sum = arr[start] + arr[end];
            if (sum == val) {
                count++;
                start++;
                end--;
            } else if (sum > val) {
                end--;
            } else {
                start++;
            }
        }
        return count;
    }

    public static int[] TowSum2(int[] nums, int target) {
        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);
        Arrays.sort(nums);
        int[] re = new int[2];
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {

                re[0] = nums[start];
                re[1] = nums[end];
                break;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        int j = 0;
        for (int i = 0; i < copy.length; i++) {

            if (j < 2 && copy[i] == re[j]) {
                re[j] = i;
                j++;
            }
        }

        return re;
    }

    public static int[] TowSum3(int[] nums, int target) {
        int[] re = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] + nums[j] == target) {
                    re[0] = i;
                    re[1] = j;
                    return re;
                }
            }
        }
        return re;
    }

    public static void main(String[] args) {
        String filePath = "/home/andyshen/code/algorithms/src/main/java/data/numbers.txt";
        ArrayList<Integer> arrList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String tmp;
            while ((tmp = bufferedReader.readLine()) != null) {
                tmp = tmp.trim();
                arrList.add((Integer.parseInt(tmp)));
                if (tmp.isEmpty()) {
                    break;
                }
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }
        int[] arr = AlgoUtil.toArray(arrList);
        int[] re = TowSum3(arr, -8);
        log.info("");
    }
}

