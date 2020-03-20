package section2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-9-23.
 */
public class QuickSort implements SortAlgo {

    private static final Logger log = LogManager.getLogger(QuickSort.class);

    public QuickSort() {
    }

    @Override
    public boolean less(Comparable a, Comparable b) {
        return false;
    }

    @Override
    public boolean exchange(Comparable[] a, int i, int j) {
        return false;
    }

    public static void sort(Comparable[] a, Comparable[] b) {

    }
}

