package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static UtilFunc.AlgoUtil.printArray;

/**
 * Created by hang.shen@transwarp.io on 19-12-2.
 */
public class PlusOne {

    private static final Logger log = LogManager.getLogger(PlusOne.class);

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;
            digits[i] = digit;
            if (carry == 0)
                return digits;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 9, 9, 9};
        printArray(plusOne(array));
    }
}

