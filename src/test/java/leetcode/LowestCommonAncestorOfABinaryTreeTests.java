package leetcode;

import UtilFunc.TreeNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/25.
 */
public class LowestCommonAncestorOfABinaryTreeTests {

    private static final Logger log = LogManager.getLogger(LowestCommonAncestorOfABinaryTreeTests.class);

    @Test
    public void test1() {
        int[] array = {3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4};
        TreeNode root = TreeNode.creatTree(array),
                p = new TreeNode(1), q = new TreeNode(5);
        LowestCommonAncestorOfABinaryTree lowestCommonAncestorOfABinaryTree
                = new LowestCommonAncestorOfABinaryTree();
        p = lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, p, q);
        assert p.val == 3;
    }

    @Test
    public void test2() {
        int[] array = {3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4};
        TreeNode root = TreeNode.creatTree(array),
                p = new TreeNode(4), q = new TreeNode(5);
        LowestCommonAncestorOfABinaryTree lowestCommonAncestorOfABinaryTree
                = new LowestCommonAncestorOfABinaryTree();
        p = lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, p, q);
        assert p.val == 5;
    }

}

