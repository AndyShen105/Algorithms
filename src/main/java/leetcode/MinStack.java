package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

/**
 * Created by hang.shen@transwarp.io on 19-12-5.
 */
public class MinStack {

    private static final Logger log = LogManager.getLogger(MinStack.class);
    private ArrayList<int[]> data;
    private int pTop = -1;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        data = new ArrayList<>();
    }

    public void push(int x) {
        if (pTop == -1) {
            data.add(new int[]{x, x});
            pTop = 0;
            return;
        }
        if (data.get(pTop)[1] >= x) {
            data.add(new int[]{x, x});
        } else {
            data.add(new int[]{x, data.get(pTop)[1]});
        }
        pTop++;
    }

    public void pop() {
        if (pTop == -1) {
            return;
        }
        data.remove(pTop);
        pTop--;
    }

    public int top() {
        if (pTop == -1) {
            return -1;
        }
        return data.get(pTop)[0];
    }

    public int getMin() {
        return data.get(pTop)[1];
    }
}

