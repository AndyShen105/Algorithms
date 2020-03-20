package section1;

import UtilFunc.AlgoUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-9-11.
 */
public class RingBuffer {
    /*
    循环队列的数组实现，会舍弃数组中的一个位置，如果不舍弃则判满，判空的条件是一样的
     */
    private static final Logger log = LogManager.getLogger(RingBuffer.class);

    int front, rear, size;
    int[] array;

    public RingBuffer() {
    }

    public RingBuffer(int size) {
        this.front = 0;
        this.rear = 0;
        this.size = size;
        array = new int[size];
    }

    public boolean isEmpty() {
        if (this.front == this.rear) return true;
        return false;
    }

    public boolean isFull() {
        if ((this.rear + 1) % this.size == this.front) return true;
        return false;
    }

    public void push(int val) {
        if (isFull()) return;
        this.array[this.rear] = val;
        this.rear = (this.rear + 1) % this.size;
    }

    public void pop() {
        if (this.front == this.rear) return;

        int index = (this.front + this.size) % this.size;
        this.front++;
        array[index] = -1;

    }

    public int Length() {
        if (this.rear == this.front) return 0;
        if (this.rear > this.front) {
            return this.rear - this.front - 1;
        } else {
            return this.size - (this.front - this.rear);
        }

    }

    public void print() {
        AlgoUtil.printArray(this.array);
    }

    public static void main(String[] args) {
        RingBuffer ringBuffer = new RingBuffer(6);
        for (int i = 1; i < 6; i++) {
            ringBuffer.push(i);
        }
        ringBuffer.print();
        ringBuffer.pop();
        ringBuffer.pop();
        ringBuffer.push(6);
        // ringBuffer.push(7);
        //ringBuffer.pop();
        ringBuffer.print();
        System.out.print(ringBuffer.Length());
    }
}

