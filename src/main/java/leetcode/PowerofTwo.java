package leetcode;

/**
 * Created by hang.shen@transwarp.io on 2020/4/16.
 */
public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        int temp;
        n = Math.abs(n);
        while (n >= 2) {
            temp = n % 2;
            if (temp != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }
}
