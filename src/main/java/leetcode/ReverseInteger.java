package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Stack;

/**
 * Created by hang.shen@transwarp.io on 19-9-24.
 */
public class ReverseInteger {

    private static final Logger log = LogManager.getLogger(ReverseInteger.class);

    public ReverseInteger() {
    }

    public static int reverse2(int x) {
        int flag = 1;
        if (x < 0) {
            flag = -1;
            x = flag * x;
        }
        int d = 10, i = 0, re = 0, max = (int) Math.log10(x);


        try {
            while (x / (int) Math.pow(d, i) != 0) {
                int temp = x % (int) Math.pow(d, i);
                re += re + Math.pow(10, max) * temp;
                i++;
                max--;
            }
            re = re * flag;
        } catch (NumberFormatException e) {
            re = 0;
        }

        return re;
    }

    public static int reverse(int x) {
        int flag = x < 0 ? -1 : 1;
        String str = String.valueOf(x);
        Stack<Character> temp = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '-') {
                temp.push(ch);
            }
        }

        char[] re = new char[temp.size()];
        int i = 0;
        while (!temp.empty()) {
            char t = temp.pop();
            re[i] = t;
            i = i + 1;
        }
        String newstr = new String(re);
        int a = 0;
        try {
            a = Integer.parseInt(newstr);
        } catch (NumberFormatException e) {
            a = 0;
        }

        return a * flag;
    }

    public static void main(String[] args) {
        int a = 123;
        log.info(reverse2(a));
    }
}

