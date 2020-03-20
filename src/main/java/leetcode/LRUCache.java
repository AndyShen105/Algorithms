package leetcode;

import java.util.LinkedHashMap;

/**
 * Created by hang.shen@transwarp.io on 19-12-4.
 * Problem
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
 * it should invalidate the least recently used item before inserting a new item.
 * The cache is initialized with a positive capacity.
 */

public class LRUCache {

    private LinkedHashMap<Integer, Integer> data;
    private int maxCapacity;

    public LRUCache(int capacity) {
        data = new LinkedHashMap<>();
        maxCapacity = capacity;
    }

    public int get(int key) {
        if (!data.containsKey(key)) return -1;
        Integer val = data.get(key);
        put(key, val);
        return val;
    }

    public void put(int key, int value) {
        if (data.containsKey(key)) {
            data.remove(key);
        } else if (data.size() == maxCapacity) {
            data.remove(data.keySet().iterator().next());
        }
        data.put(key, value);
    }
}

