package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/28.
 */
public class RomanToInteger {

    private static final Logger log = LogManager.getLogger(RomanToInteger.class);
    public static String[] STR = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static int[] VAL = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public int romanToInt(String s) {
        int re = 0, index = 0;
        for (int i = 0; i < STR.length; i++) {
            while (index + STR[i].length() <= s.length() && STR[i].equals(s.substring(index, index + STR[i].length()))) {
                re += VAL[i];
                index += STR[i].length();
            }
        }
        return re;
    }
}

