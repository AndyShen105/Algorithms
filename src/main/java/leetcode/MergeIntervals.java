package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/4/28.
 */
public class MergeIntervals {
    /*Given a collection of intervals, merge all overlapping intervals.

    Example 1:

    Input: [[1,3],[2,6],[8,10],[15,18]]
    Output: [[1,6],[8,10],[15,18]]
    Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
    Example 2:

    Input: [[1,4],[4,5]]
    Output: [[1,5]]
    Explanation: Intervals [1,4] and [4,5] are considered overlapping.
        NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.*/

    private static final Logger log = LogManager.getLogger(MergeIntervals.class);

    class ArrayComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            int temp = o1[0] - o2[0];
            return temp == 0 ? o1[1] - o2[1] : temp;
        }
    }

    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if (intervals.length == 0) return intervals;
        Arrays.sort(intervals, new ArrayComparator());
        int pre = 0, current = 1;
        List<int[]> list = new ArrayList<>();
        while (current <= len) {
            if (current == len) {
                list.add(intervals[pre]);
                break;
            }
            if (intervals[pre][0] == intervals[current][0]) {
                intervals[pre][1] = intervals[current][1];
            } else if (intervals[pre][1] >= intervals[current][0]) {
                if (intervals[pre][1] <= intervals[current][1]) intervals[pre][1] = intervals[current][1];
            } else {
                list.add(intervals[pre]);
                pre = current;
            }
            current++;
        }
        int[][] re = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            re[i] = list.get(i);
        }

        return re;
    }

}

