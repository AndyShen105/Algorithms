package leetcode;

import UtilFunc.ListNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/5/28.
 */
public class PartitionListTests {

    private static final Logger log = LogManager.getLogger(PartitionListTests.class);

    @Test
    public void test1() {
        int array[] = {1, 4, 3, 2, 5, 2};
        ListNode root = ListNode.createLinkedList(array);
        PartitionList partitionList = new PartitionList();
        ListNode.print(partitionList.partition(root, 3));

    }
}

