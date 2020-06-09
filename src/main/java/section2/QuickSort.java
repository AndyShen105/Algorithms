package section2;

/**
 * Created by hang.shen@transwarp.io on 19-9-23.
 */
public class QuickSort {
    public static void quickSort(int array[]) {
        if (array.length <= 1) return;
        helper(array, 0, array.length);
    }

    public static void helper(int array[], int start, int end) {
        if (start >= end) return;
        int temp, pos = start, current = pos + 1;
        while (current < end) {
            if (array[pos] > array[current]) {
                temp = array[pos];
                array[pos] = array[current];
                array[current] = temp;
                pos = current;
            }
            current++;
        }
        helper(array, start, pos);
        helper(array, pos + 1, end);
    }

    public static void main(String[] args) {
        int array[] = {32, 46, 2, 7, 31, 23, 34};
        QuickSort.quickSort(array);
        System.out.print(array);
    }
}

