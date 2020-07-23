package DataStructure.SkipList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/7/23.
 */

//顺序表，链表中的元素按升序排列
class SortedList {
    Node head;        //表头结点
    Node tail;        //表尾结点
    int length;        //链表长度
    private static final Logger log = LogManager.getLogger(SortedList.class);

    SortedList() {
        head = tail = null;
        length = 0;
    }


    //插入结点
    //参数：要插入新节点的值；要插入的结点的前一个结点的引用
    Node insertNode(int value, Node aheadOfInsert) {

        //被插入的结点
        Node InsertedNode = null;

        //如果链表为空，调用向头部插入方法
        if (aheadOfInsert == null) {
            InsertedNode = insertToHead(value);
        }
        //要在链表尾部插入，直接更新tail
        else if (aheadOfInsert == tail) {
            InsertedNode = tail = aheadOfInsert.next = new Node(value, null);
        }
        //在链表中间插入
        else {
            InsertedNode = aheadOfInsert.next = new Node(value, aheadOfInsert.next);
        }
        length++;

        return InsertedNode;
    }


    //删除结点
    //参数：要删除的结点的前一个结点的引用
    //如果要删除第一个结点，则该参数为空
    int deleteNode(Node aheadOfRemove) {
        //链表为空，直接返回-1
        if (head == null) {
            return -1;
        }


        Node removedNode = null;
        //链表只有一个结点，删除该结点
        if (head == tail) {
            removedNode = head;
            head = tail = null;
        }

        //参数为空，代表要删除第一个结点。同时更新head
        else if (aheadOfRemove == null) {
            removedNode = head;
            head = head.next;
        }
        //正常删除结点
        else {
            removedNode = aheadOfRemove.next;
            aheadOfRemove.next = aheadOfRemove.next.next;
        }
        length--;
        return 0;
    }

    //判断链表是否为空
    int isEmpty() {
        return head == null ? 1 : 0;
    }

    //打印链表内容及相关参数
    void printSelf() {
        System.out.print("SortedList: [");
        for (Node now = head; now != null; now = now.next)
            if (now.down == null)
                System.out.print(String.format("%d, ", now.value));
            else
                System.out.print(String.format("%d( %d), ", now.value, now.down.value));
        System.out.print(String.format("]\t\t%d\n", length));

    }

    private Node insertToHead(int value) {
        if (head == null) {
            head = tail = new Node(value, null, null);
        } else {
            head = new Node(value, head);
        }
        return head;
    }

};