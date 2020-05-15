package leetcode;

import javafx.util.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by hang.shen@transwarp.io on 2020/5/13.
 */
public class TopKFrequentElements {

    private static final Logger log = LogManager.getLogger(TopKFrequentElements.class);

    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        if (nums.length == 0) return result;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 0);
            }
        }
        PriorityQueue<Pair<Integer, Integer>> minHeap = new PriorityQueue(k, pairComparator);
        for (Integer key : map.keySet()) {

            if (minHeap.size() < k) {
                minHeap.add(new Pair<>(key, map.get(key)));
            } else {
                if (minHeap.peek().getValue() < map.get(key)) {
                    minHeap.poll();
                    minHeap.add(new Pair<>(key, map.get(key)));
                }
            }
        }

        int i = 0;
        while (!minHeap.isEmpty()) {
            result[i] = minHeap.poll().getKey();
            i++;
        }
        return result;
    }

    public static Comparator<Pair<Integer, Integer>> pairComparator = new Comparator<Pair<Integer, Integer>>() {

        @Override
        public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
            return o1.getValue() - o2.getValue();
        }
    };


}

