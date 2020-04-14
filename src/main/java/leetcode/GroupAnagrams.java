package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hang.shen@transwarp.io on 20-4-13.
 */
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return null;
        Map<String, List<String>> maps = new HashMap<>();
        for (String str : strs) {
            String key = helper(str);
            if (maps.containsKey(key)) {
                maps.get(key).add(str);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                maps.put(key, temp);
            }
        }
        List<List<String>> re = new ArrayList<>();
        for (String key : maps.keySet()) {
            re.add(maps.get(key));
        }
        return re;
    }

    private static String helper(String s) {
        char[] bit = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'
                , '0', '0', '0'};
        for (char ch : s.toCharArray()) {
            bit[ch - 'a'] = (char) (bit[ch - 'a'] + 1);
        }
        System.out.println(new String(bit));
        return new String(bit);
    }

}
