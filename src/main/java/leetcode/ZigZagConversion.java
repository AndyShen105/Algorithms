package leetcode;

import java.util.Stack;

/**
 * Created by hang.shen@transwarp.io on 2020/4/14.
 */

public class ZigZagConversion {

    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;
        String[] strs = new String[numRows];
        for(int i = 0; i<numRows;i++) {
            strs[i] = "";
        }
        int i = 0;
        boolean flag = true;
        for(char ch: s.toCharArray()) {
            if(flag) {
                strs[i] += ch;
                i++;
                if(i == numRows) {
                  flag = false;
                  i-=2;
                }
            }else {
                strs[i] += ch;
                i--;
                if(i == -1) {
                    flag = true;
                    i+=2;
                }
            }

        }
        String re = "";
        for(String str: strs) re += str;
        return re;
    }

//    public static String convert(String s, int numRows) {
//        if(numRows == 1) return s;
//        int step = 2*(numRows-2) +2, len = s.length();
//        String str = "";
//        for(int i = 0; i< numRows; i++) {
//            int j = i;
//            while(j < len) {
//                str += s.charAt(j);
//                j += step;
//            }
//        }
//        return str;
//    }

}
