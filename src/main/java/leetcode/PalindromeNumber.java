package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-11-7.
 */
public class PalindromeNumber {

    private static final Logger log = LogManager.getLogger(PalindromeNumber.class);

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int end = s.length() - 1, start = 0;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

//    public static boolean isPalindrome2(int x) {
//        if(x < 0) return false;
//        int end = (int)Math.log10(x);
//        int p,q;
//        while(end >= 1) {
//            p = x % 10;
//            q = x / (int)Math.pow(10, end);
//            if(p != q) return false;
//            x = (x % (int)Math.pow(10, end)) / 10;
//            end = (int)Math.log10(x);
//        }
//        return true;
//    }

    public static void main(String[] args) {
        log.info(isPalindrome(1000021));
    }
}

