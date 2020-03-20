package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-12-16.
 */
public class AddBinary {

    private static final Logger log = LogManager.getLogger(AddBinary.class);

    public static String addBinary(String a, String b) {
        char[] ch1, ch2;
        int max, min;
        if (a.length() > b.length()) {
            ch1 = a.toCharArray();
            ch2 = b.toCharArray();
            max = a.length() - 1;
            min = b.length() - 1;
        } else {
            ch2 = a.toCharArray();
            ch1 = b.toCharArray();
            max = b.length() - 1;
            min = a.length() - 1;
        }
        char temp = '0';
        char[] re = new char[max + 2];
        int sum;
        for (int i = 0; i < ch1.length; i++) {
            if (i <= min) {
                sum = ch1[max - i] + ch2[min - i] + temp - 144;

            } else {
                sum = ch1[max - i] + temp - 96;
            }
            re[max + 1 - i] = sum % 2 == 1 ? '1' : '0';
            temp = sum / 2 == 1 ? '1' : '0';
        }
        re[0] = temp;
        return temp == '1' ? new String(re) : new String(re).substring(1);
    }

    public static void main(String[] args) {
        String v1 = "11", v2 = "1";
        log.info(addBinary(v1, v2));
    }
}

