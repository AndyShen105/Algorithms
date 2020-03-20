package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Stack;

/**
 * Created by hang.shen@transwarp.io on 19-9-12.
 */
public class BigCompte {

    private static final Logger log = LogManager.getLogger(BigCompte.class);

    public BigCompte() {
    }

    public static String add(String va, String vb) {
        int min = Math.min(va.length(), vb.length());
        int max = Math.max(va.length(), vb.length());
        String number = "";
        Stack<Integer> re = new Stack<>();
        int temp = 0, i = 1;
        char a, b;
        while (max - i >= 0) {
            if (min - i >= 0) {
                a = va.charAt(va.length() - i);
                b = vb.charAt(vb.length() - i);
                int val = a - '0' + b - '0' + temp;
                temp = 0;
                if (val >= 10) {
                    temp = val / 10;
                }
                re.push(val % 10);
            } else {
                if (va.length() >= vb.length()) {
                    a = va.charAt(va.length() - i);
                    int val = a - '0' + temp;
                    temp = 0;
                    if (val >= 10) {
                        temp = val / 10;
                    }
                    re.push(val % 10);
                } else {
                    b = vb.charAt(vb.length() - i);
                    int val = b - '0' + temp;
                    temp = 0;
                    if (val >= 10) {
                        temp = val / 10;
                    }
                    re.push(val % 10);
                }
            }
            i++;
        }
        while (!re.empty()) {
            number += re.pop();
        }
        return number;
    }

    public static void main(String[] args) {
        String va = "395",
                vb = "347";
        log.info(add(va, vb));
    }
}

