package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-11-7.
 */
public class MultiplyStrings {

    private static final Logger log = LogManager.getLogger(MultiplyStrings.class);

    private static char[] reserve(String s) {
        char[] ch = new char[s.length()];
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            ch[j] = s.charAt(i);
            j++;
        }
        return ch;
    }

    public static String multiply(String num1, String num2) {
        if (num1 == null || num2 == null || num1.length() == 0 || num2.length() == 0)
            return "";
        if (num1.charAt(0) == '0')
            return "0";
        if (num2.charAt(0) == '0')
            return "0";
        char[] nc1 = reserve(num1);
        char[] nc2 = reserve(num2);
        int temp, mul;
        int[] re = new int[nc1.length + nc2.length];
        for (int i = 0; i < nc1.length; i++) {
            temp = nc1[i] - '0';
            for (int j = 0; j < nc2.length; j++) {
                mul = temp * (nc2[j] - '0');
                re[i + j + 1] = re[i + j + 1] + mul / 10 + (re[i + j] + mul % 10) / 10;
                re[i + j] = (re[i + j] + mul % 10) % 10;
            }
        }
        temp = re.length - 1;
        while (temp >= 0) {
            if (re[temp] != 0) break;
            else temp--;
        }
        String s = "";

        while (temp >= 0) {
            s += String.valueOf(re[temp]);
            temp--;
        }


        return s;
    }

    public static void main(String[] args) {
        log.info(multiply("123", "456"));
    }
}

