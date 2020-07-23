package DataStructure.SkipList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

/**
 * Created by hang.shen@transwarp.io on 2020/7/23.
 */

//跳跃表类
public class SkipList {
    int length;        //跳跃表最底层长度
    int layerNum;    //跳跃表最大层数
    SortedList[] layers;    //跳跃表层数的引用
    //为什么这里使用了数组？
    //因为跳跃表的层数是log（n），100层能够容纳2^100个数据，使用数组占用的空间可以忽略
    private static final Logger log = LogManager.getLogger(SkipList.class);

    SkipList() {
        length = 0;
        layerNum = 0;
        layers = new SortedList[100];
        for (int i = 0; i < 100; i++) {
            layers[i] = new SortedList();
        }
    }


    //向跳跃表插入值
    void insert(int value) {
        //get the necessary layerNum by number of nodes

        //先获得增加结点之后，该结点需要加入到哪些层
        int newLayerNum = getLayerNumRandomly(length + 1);
        //更新最大层数量
        if (layerNum < newLayerNum) {
            layerNum++;
        }

        //因为先要从上向下查找到要将新结点插入到哪里，并且需要将查找的路径记录下来
        //这样才能在每一层都插入该结点
        //该数组用于记录从上向下寻找的过程中，经过了哪些层的哪个结点（下标为层数，数组内容为经过的结点）
        Node[] aheadOfInsert = new Node[100];
        //数组初始化为NULL
        for (int i = 0; i < 100; i++)
            aheadOfInsert[i] = null;

        //获取每一层需要插入结点的位置
        getInsertIndex(value, aheadOfInsert);

        Node[] InsertedNode = new Node[100];
        for (int i = 0; i < 100; i++)
            InsertedNode[i] = null;

        //遍历每一层，插入结点
        for (int i = layerNum; i >= 0; i--) {
            InsertedNode[i] = layers[i].insertNode(value, aheadOfInsert[i]);
        }

        //更新层与层之间的指针
        for (int i = layerNum; i >= 1; i--) {
            InsertedNode[i].down = InsertedNode[i - 1];
        }
        length++;
        //打印各个层
        System.out.println("================================");
        layers[0].printSelf();
        layers[1].printSelf();
        layers[2].printSelf();
        layers[3].printSelf();
        layers[4].printSelf();
        System.out.println("================================");
    }

    //因为先要从上向下查找到要将新结点插入到哪里，并且需要将查找的路径记录下来
    //这样才能在每一层都插入该结点
    //这个函用于查找该路径，该路径用要插入的结点位置的前一个结点表示，存入aheadOfInsert数组
    void getInsertIndex(int value, Node[] aheadOfInsert) {
        int i;
        Node currentNode = null;

        //最高的层可能为空，需要在链表头插入结点，所以前一个结点为空
        for (i = layerNum; i >= 0 && (layers[i].head == null || layers[i].head.value > value); i--) {
            aheadOfInsert[i] = null;
        }
        //如果所有层都为空，直接返回
        if (i == -1)
            return;
        currentNode = layers[i].head;

        //从上层到下层遍历，寻找该路径
        for (; i >= 0; i--) {
            Node now;

            //该循环从一层的链表前方向后方遍历，循环停止的条件有两个：
            //当遇到链表尾：说明该值只可能在下一层找到
            //当遇到比当前值还小的结点，说明要找的值，在当前结点和下一和结点之间，转向下一层寻找
            for (now = currentNode; now.next != null && now.next.value < value; now = now.next) ;
            aheadOfInsert[i] = now;
            currentNode = now.down;
        }

    }


    //因为先要从上向下查找到要删除哪个结点，并且需要将查找的路径记录下来
    //这样才能在每一层都删除该结点
    //这个函用于查找该路径，该路径用要删除的结点位置的前一个结点表示，存入aheadOfRemove数组
    //然而，在删除结点时，有如下三种情况：
    //1、该结点不存在这一层，不需要删除，指针为NULL
    //2、该结点是该层的第一个结点，该结点的前一个结点为NULL，指针也为NULL
    //3、找到了该结点，指针正常
    //所以，需要另一个数组表示该结点是否应该被删除，这里使用数组deleteOrNot
    void getRemoveIndex(int value, Node[] aheadOfRemove, boolean[] deleteOrNot) {
        int i;
        Node currentNode = null;

        //从上层向下层遍历，如果该层为空，或该层第一个值已经大于要删除的值，说明这一层不需要删除结点
        for (i = layerNum; i >= 0 && (layers[i].head == null || layers[i].head.value > value); i--) {
            aheadOfRemove[i] = null;
            deleteOrNot[i] = false;
        }
        //循环退出之后，i指向需要有结点有可能被删除的第一个层
        if (i == -1)
            return;

        //遍历可能需要删除结点的层
        //如果要删除的结点是底层链表的第一个元素，那么向上找，把所有头元素是该元素的链表首元素全部删除
        if (layers[0].head.value == value) {
            i = 0;
            while (layers[i].head != null && layers[i].head.value == value) {
                deleteOrNot[i] = true;
                aheadOfRemove[i] = null;
                i++;
            }
            return;
        }
        currentNode = layers[i].head;

        //否则向下沿路径查找，寻找应该删除的结点
        for (; i >= 0; i--) {
            Node now;

            for (now = currentNode; now.next != null && now.next.value < value; now = now.next) ;
            if (now.next != null && now.next.value == value) {
                deleteOrNot[i] = true;
            }
            aheadOfRemove[i] = now;
            currentNode = now.down;
        }
    }

    //删除某个元素的函数
    void remove(int value) {
        //每一层需要被删除的结点的前一个结点
        Node[] aheadOfRemove = new Node[100];
        //该层的这个结点是否有效，或者说，如果aheadOfRemove【i】==null，是代表不需要删除任何结点，还是删除第一个结点
        boolean[] removeOrNot = new boolean[100];
        for (int i = 0; i < 100; i++) {
            aheadOfRemove[i] = null;
            removeOrNot[i] = false;
        }

        //获取每一层需要被删除的结点的前一个结点
        getRemoveIndex(value, aheadOfRemove, removeOrNot);

        //删除结点
        for (int i = layerNum; i >= 0; i--)
            if (removeOrNot[i] == true) {
                layers[i].deleteNode(aheadOfRemove[i]);
            }
        length--;

        //打印结果
        System.out.println("================================");
        layers[0].printSelf();
        layers[1].printSelf();
        layers[2].printSelf();
        layers[3].printSelf();
        layers[4].printSelf();
        System.out.println("================================");
    }

    //在跳跃表中搜索某个元素
    Node search(int value) {
        int i;
        Node currentNode = null;

        //从上层向下层遍历，如果该层为空，或该层第一个值已经大于要查找的值，说明这一层不需要查找
        for (i = layerNum; i >= 0 && (layers[i].head == null || layers[i].head.value > value); i--) ;
        if (i == -1)
            return null;
        currentNode = layers[i].head;

        Node now = null;
        //从上层向下层遍历查找
        for (; i >= 0; i--) {
            for (now = currentNode; now.next != null && now.next.value <= value; now = now.next) ;
            currentNode = now.down;
        }
        return now;
    }

    //随机获取某个结点应该被插入到0-k层
    int getLayerNumRandomly(int supposeLength) {
        int k = 0;
        Random rand = new Random();
        //随机数
        int a = rand.nextInt(2);
        while (a == 0) {
            k++;
            a = rand.nextInt(2);
        }

        //根据二分的思想，查找n个结点，需要log（n）次
        //跳跃表里也就需要log（n）层，所以这里对随机产生的层数有最大值限制
        int maxLayer = getMaxLayer(supposeLength);
        if (k > maxLayer)
            k = maxLayer;

        return k;
    }

    int getMaxLayer(int supposeLength) {
        return (int) Math.ceil(Math.log10(supposeLength) / Math.log10(2));
    }

    static public void main(String[] argv) {

        SkipList list = new SkipList();
        list.insert(33);
        list.insert(1);
        list.insert(11);
        list.insert(21);
        list.insert(-1);
        list.insert(45);
        list.insert(37);

        Node result = list.search(11);
        System.out.println(result.value);
        System.out.println("next Search result: " + result.next.value);

        list.remove(11);
        list.remove(-1);
        list.remove(45);
    }

}