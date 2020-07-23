package DataStructure.SkipList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/7/23.
 */


public class Node {
    int value;
    Node next;
    Node down;
    private static final Logger log = LogManager.getLogger(Node.class);

    Node(int aValue) {
        value = aValue;
        next = null;
        down = null;
    }

    Node(int aValue, Node aNext) {
        value = aValue;
        next = aNext;
        down = null;
    }


    Node(int aValue, Node aNext, Node aDown) {
        value = aValue;
        next = aNext;
        down = aDown;
    }
};
