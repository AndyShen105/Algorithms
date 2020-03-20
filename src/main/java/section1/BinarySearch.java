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
 * Created by hang.shen@transwarp.io on 19-9-4.
 */
public class BinarySearch {

    private static final Logger log = LogManager.getLogger(BinarySearch.class);

    public BinarySearch() {

    }

    public static boolean binarySearch(int[] array, int val) {
        int start = 0, end = array.length, mid = 0;
        while (start < end) {
            mid = (start + end) / 2;
            log.info("mid: {}", mid);
            if (array[mid] == val) {
                return true;
            } else if (array[mid] > val) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return false;
    }

    public static boolean binarySearchWithRecursion(int start, int end, int[] arr, int val) {
        if (start >= end)
            return false;
        int mid = (start + end) / 2;
        if (arr[mid] == val) {
            return true;
        } else if (arr[mid] > val) {
            return binarySearchWithRecursion(start, mid, arr, val);
        } else {
            return binarySearchWithRecursion(mid + 1, end, arr, val);
        }

    }

    public static int binarySearchLessThanKey(int key, int[] arr) {
        int start = 0, end = arr.length, mid = 0;
        if (start >= end) return -1;
        while (start < end) {
            mid = (start + end) / 2;
            log.info(mid);
            if (arr[mid] == key) {
                while (arr[mid] == key) {
                    mid--;
                }
                return mid + 1;
            } else if (arr[mid] > key) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static int binarySearchCountKey(int key, int[] arr) {
        int start = 0, end = arr.length, mid = 0;
        if (start >= end) return -1;
        while (start < end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                int count = mid;
                while (arr[count] == key) {
                    count--;
                }
                while (arr[mid] == key) {
                    mid++;
                }
                return mid - count - 1;
            } else if (arr[mid] > key) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] arg) {
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
        Arrays.sort(arr);
        log.info(binarySearchCountKey(6, arr));
    }
}

