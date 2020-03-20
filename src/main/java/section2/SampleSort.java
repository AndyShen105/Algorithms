package section2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static UtilFunc.AlgoUtil.printArray;

/**
 * Created by hang.shen@transwarp.io on 19-9-26.
 */
public class SampleSort {

    private static final Logger log = LogManager.getLogger(SampleSort.class);
    public static volatile int count = 0;

    public SampleSort() {
    }

    public static void shellSort(int[] array) {
        int len = array.length, h = 1;
        while (h < len / 3) h = 3 * h + 1;
        while (h >= 1) {
            log.info(h);
            for (int i = h; i < len; i++) {
                for (int j = i; j >= h && array[j] > array[j - h]; j = j - h) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                }
            }
            h = h / 3;
        }
    }

    private static void merge(int[] array, int start, int mid, int end) {
        int[] aux = new int[end + 1];
        int i = start, j = mid + 1;
        for (int k = start; k <= end; k++) {
            aux[k] = array[k];
        }

        for (int k = start; k <= end; k++) {
            if (i > mid) array[k] = aux[j++];
            else if (j > end) array[k] = aux[i++];
            else if (aux[j] < aux[i]) array[k] = aux[j++];
            else array[k] = aux[i++];
        }
    }


    public static void mergeSort(int[] array, int start, int end) {
        log.info(count++);
        if (end <= start + 5) return;
        int mid = start + (end - start) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);
        merge(array, start, mid, end);
    }

    public static void mergeSortBU(int[] array, int start, int end) {
        int N = array.length;
        int[] aux = new int[N];

    }

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 19, 5, 45, 23, 11, 32, 43, 15, 16, 71, 21, 20};
        //shellSort(array);
        mergeSort(array, 0, array.length - 1);
        printArray(array);
    }
}

