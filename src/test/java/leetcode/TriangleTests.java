package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/3/27.
 */
public class TriangleTests {
    private static final Logger log = LogManager.getLogger(TriangleTests.class);
    
    @Test
    public void TriangleTest1() {
        Integer[] level0 = new Integer[]{-1};
        Integer[] level1 = new Integer[]{2, 3};
        Integer[] level2 = new Integer[]{1, -1, -3};
        List<Integer> list0 = Arrays.asList(level0);
        List<Integer> list1 = Arrays.asList(level1);
        List<Integer> list2 = Arrays.asList(level2);
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(list0);
        triangle.add(list1);
        triangle.add(list2);
        assert Triangle.minimumTotal(triangle) == 0;
    }
}

