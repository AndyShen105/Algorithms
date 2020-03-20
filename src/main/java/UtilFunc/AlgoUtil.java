package UtilFunc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 19-9-4.
 */
public class AlgoUtil {

    private static final Logger log = LogManager.getLogger(AlgoUtil.class);

    public AlgoUtil() {
    }

    public static int[] toArray(List<Integer> arrayList) {
        int[] arr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i] = arrayList.get(i);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[arr.length - 1] + "\r\n");
    }
}

