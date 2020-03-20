package section1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 19-9-9.
 */
public class Josephus {

    private static final Logger log = LogManager.getLogger(Josephus.class);

    int size, key;
    ListNode head;
    ListNode rear;

    public Josephus(int size, int key) {
        this.key = key;
        this.size = size;
    }

    private class ListNode {
        ListNode next;
        int val;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void createJosephusCycle() {
        head = new ListNode(0);
        rear = head;
        for (int i = 1; i < this.size; i++) {

            ListNode node = new ListNode(i);
            rear.next = node;
            rear = node;
        }
        rear.next = head;
    }

    public int findTarget() {
        ListNode node = this.head;
        ListNode preNode = this.head;
        while (true) {
            for (int i = 0; i < this.key - 1; i++) {
                preNode = node;
                node = node.next;
            }
            if (node.next != node) {
                log.info("Dead: {}", node.val);
            } else {
                break;
            }
            preNode.next = node.next;
            node = node.next;
        }
        return node.val;
    }

    public static void main(String[] arg) {
        Josephus josephus = new Josephus(7, 2);
        josephus.createJosephusCycle();
        log.info("survice: {}", josephus.findTarget());
    }

}

