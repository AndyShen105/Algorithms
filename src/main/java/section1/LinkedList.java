package section1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Stack;

/**
 * Created by hang.shen@transwarp.io on 19-9-10.
 */
public class LinkedList {

    private static final Logger log = LogManager.getLogger(LinkedList.class);

    public Node head;
    private Node last;


    public LinkedList() {
        this.head = null;
    }

    public static class Node {
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public void add(int val) {
        if (head == null) {
            head = new Node(val);
            last = head;
        } else {
            Node node = new Node(val);
            last.next = node;
            last = node;
        }
    }

    public boolean remove(int index) {
        int i = 1;
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (i == index - 1) {
                curr.next = curr.next.next;
                return true;
            }
            curr = curr.next;
            i++;
        }
        return false;
    }

    public void reverse() {
        if (head == null) return;
        ;
        Stack<Node> temp = new Stack<>();
        Node curr = head;
        while (curr != null) {
            temp.push(curr);
            curr = curr.next;
        }
        head = temp.pop();
        curr = head;

        while (!temp.empty()) {
            curr.next = temp.pop();
            curr = curr.next;
        }
        curr.next = null;
    }

    public void print() {
        Node node = head;
        while (node != null) {
            log.info("val: {}  ", node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        //linkedList.print();
        linkedList.reverse();
        linkedList.print();

    }

}

