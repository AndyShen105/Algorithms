package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020-04-20.
 */
public class IntegerToRoman {
    private static final Logger log = LogManager.getLogger(IntegerToRoman.class);
    public static String[] STR = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public static int[] VAL = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

    public static String intToRoman(int num) {
        String re = "";
        for (int i = 0; i < VAL.length; i++) {
            while (num >= VAL[i]) {
                re += STR[i];
                num = num - VAL[i];
            }
        }
        return re;
    }
}
