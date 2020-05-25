package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/20.
 */
public class LowestCommonAncestorOfABinarySearchTreeTests {

    private static final Logger log = LogManager.getLogger(LowestCommonAncestorOfABinarySearchTreeTests.class);

    @Test
    public void test1() {
        int[] array = {6, 2, 8, 0, 4, 7, 9, -1, -1, 3, 5, -1, -1};
        TreeNode root = TreeNode.creatTree(array),
                p = new TreeNode(2), q = new TreeNode(8);
        LowestCommonAncestorOfABinarySearchTree lowestCommonAncestorOfABinarySearchTree
                = new LowestCommonAncestorOfABinarySearchTree();
        p = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, p, q);
        log.info(p.val);
    }

    @Test
    public void test2() {
        int[] array = {6, 2, 8, 0, 4, 7, 9, -1, -1, 3, 5, -1, -1};
        TreeNode root = TreeNode.creatTree(array),
                p = new TreeNode(2), q = new TreeNode(4);
        LowestCommonAncestorOfABinarySearchTree lowestCommonAncestorOfABinarySearchTree
                = new LowestCommonAncestorOfABinarySearchTree();
        p = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, p, q);
        log.info(p.val);

    }

    @Test
    public void test3() {
        int[] array = {3, 1, 4, -1, 2};
        TreeNode root = TreeNode.creatTree(array),
                p = new TreeNode(2), q = new TreeNode(3);
        LowestCommonAncestorOfABinarySearchTree lowestCommonAncestorOfABinarySearchTree
                = new LowestCommonAncestorOfABinarySearchTree();
        p = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, p, q);
        log.info(p.val);

    }

    @Test
    public void test4() {
        int[] array = {3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4};
        TreeNode root = TreeNode.creatTree(array),
                p = new TreeNode(5), q = new TreeNode(4);
        LowestCommonAncestorOfABinarySearchTree lowestCommonAncestorOfABinarySearchTree
                = new LowestCommonAncestorOfABinarySearchTree();
        p = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, p, q);
        log.info(p.val);

    }
}

